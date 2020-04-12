import java.util.*;

// TODO Можно удалить
public class Unigrammy {

    /**
     * Возвращаем карту униграмм. key - слово, value - количество повторений в выборке
     * @param texts список текстов для составления униграмм
     * @return
     */
    public static Map getUnigrammy(List<String> texts){
        Map<String, Double> unigramm = new HashMap<>();
        for (String text : texts) {
            for (String word : text.split(" ")) {
                if (unigramm.containsKey(word)) {
                    Double value = unigramm.get(word);
                    unigramm.put(word, value + 1);
                } else {
                    unigramm.put(word, 0.);
                }
            }
        }

        return unigramm;
    }

    class Unigram  {

        public Set<String> getNGram(String text) {
            if (text == null) {
                text = "";
            }

            // get all words and digits
            String[] words = text.toLowerCase().split("[ \\pP\n\t\r$+<>№=]");

            Set<String> uniqueValues = new LinkedHashSet<>(Arrays.asList(words));
            uniqueValues.removeIf(s -> s.equals(""));

            return uniqueValues;
        }
    }

}
