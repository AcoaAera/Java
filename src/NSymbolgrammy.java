import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NSymbolgrammy {

    public static Map getNrgammy(List<String> texts, int countGramm) {
        Map<String, Double> Ngrammy = new HashMap<>();
        List<String> list = new ArrayList<>();

        for (String text : texts) {

            String[] test = text.split("");

            //запись N символов в лист
            for (int i = 0; i < test.length - (countGramm - 1); i++) {
                String symbols = "";
                for (int j = 0; j < countGramm; j++) {
                    symbols += test[i + j];
                }
                list.add(symbols);
            }

            //обработка N символов в карту
            for (String three : list) {
                if (Ngrammy.containsKey(three)) {
                    Ngrammy.put(three, Ngrammy.get(three) + 1);
                } else {
                    Ngrammy.put(three, 0.);
                }
            }

            //очистка листа для нового файла
            list.clear();
        }

        return Ngrammy;
    }
}
