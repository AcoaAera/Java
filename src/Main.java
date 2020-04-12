import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        try {
            //Получаем все строки из текстового файла
            List<String> texts = WorkText.getRowsFileCharsetDefault("src\\roman3.txt");
            //Формируем карту из уникальных слов без предварительной чистки текста
            Map map = NWordgrammy.getNWordgrammy(texts, 1);
            //Выводим карту
            Utils.printSortedMap(map);
            System.out.println("Готово");
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());

        }
    }
}
