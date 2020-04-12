import javax.annotation.processing.SupportedSourceVersion;
import java.util.Map;

public class Utils {

    /**
     * Вывод карты с заголовком
     * @param map Карта
     */
    public static void printSortedMap(Map<String, Double> map) {
        System.out.println("-------------------------------------------");
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);
        System.out.println("-------------------------------------------");
    }

    /**
     * Вывод карты с заголовком
     * @param map Карта
     * @param annotation Заголовок
     */
    public static void printSortedMap(Map<String, Double> map, String annotation) {
        System.out.println("-------------------------------------------");
        System.out.println(annotation);
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);
        System.out.println("-------------------------------------------");
    }

}
