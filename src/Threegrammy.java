import java.util.*;

// TODO Можно удалить
public class Threegrammy {
    public static Map getThreergammy(List<String> texts) {

        Map<String, Double> threegrammy = new HashMap<>();
        List<String> list = new ArrayList<>();

        for (String text : texts) {

            String[] test = text.split(" ");

            //запись троек слов в лист
            for (int i = 0; i < test.length - 2; i++) {
                list.add(test[i] + " " + test[i + 1] + " " + test[i + 2]);
            }

            //обработка троек слов в карту
            for (String three : list) {
                if (threegrammy.containsKey(three)) {
                    threegrammy.put(three, threegrammy.get(three) + 1);
                } else {
                    threegrammy.put(three, 0.);
                }
            }

            //очистка листа для нового файла
            list.clear();
        }

        return threegrammy;
    }
}
