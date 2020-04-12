import java.util.*;

// TODO Можно удалить
public class Bigrammy {

    public static Map getBirgammy(List<String> texts) {

        Map<String, Double> bigrammy = new HashMap<>();
        List<String> list = new ArrayList<>();

        for (String text : texts) {

            String[] test = text.split(" ");

            //запись пар слов в лист
            for (int i = 0; i < test.length - 1; i++) {
                list.add(test[i] + " " + test[i + 1]);
            }

            //обработка пар слов в карту
            for (String bi : list) {
                if (bigrammy.containsKey(bi)) {
                    bigrammy.put(bi, bigrammy.get(bi) + 1);
                } else {
                    bigrammy.put(bi, 0.);
                }
            }

            //очистка листа для нового файла
            list.clear();
        }

        return bigrammy;
    }

}
