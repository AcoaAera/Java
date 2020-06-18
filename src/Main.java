import db.Query;

import java.io.File;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // Заливка БД
        try {
            String CATALOG = "src\\basnja";
            File dir1 = new File(CATALOG);

            for (String fileName : Objects.requireNonNull(dir1.list())) {
                System.out.println(fileName);
                //Получаем все строки из текстового файла
                List<String> texts = WorkText.getRowsFileCharsetDefault(CATALOG + "\\" + fileName);
                List<String> cleanTexts = new ArrayList<>();
                texts.forEach(x -> cleanTexts.add(WorkText.cleanText(x)));
                //Формируем карту из уникальных слов без предварительной чистки текста
                Map<String, Double> map = NWordgrammy.getNWordgrammy(cleanTexts, 1);
                Integer idText = Query.insRoman(fileName);
                map.forEach((key, value) -> {
                    Integer idWord = Query.insWords(key);
                    idWord = (idWord == null) ? Query.getIdWord(key) : idWord;
                    Query.insWIR2(idWord, idText, value);
                });
                //Выводим карту
//                System.out.println(CATALOG + "\\" + fileName);
//                Utils.printSortedMap(map);
//                System.out.println(map.size());
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
