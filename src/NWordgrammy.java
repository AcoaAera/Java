import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NWordgrammy {

    public static Map getNWordgrammy(List<String> texts, int countWord) {

        Map<String, Double> ngrammy = new HashMap<>();
        List<String> list = new ArrayList<>();

        for (String text : texts) {

            String[] test = text.split(" ");

            //запись countWord слов в лист
            for (int i = 0; i < test.length - (countWord - 1); i++) {
                String words = "";
                for (int j = 0; j < countWord; j++) {
                    words += test[i + j];
                    if (j != (countWord - 1)) {
                        words += " ";
                    }
                }
                list.add(words);
            }

            //обработка countWord слов в карту
            for (String three : list) {
                if (ngrammy.containsKey(three)) {
                    ngrammy.put(three, ngrammy.get(three) + 1);
                } else {
                    ngrammy.put(three, 1.);
                }
            }

//            //очистка листа для нового файла
//            list.clear();
        }

        return ngrammy;
    }
}
