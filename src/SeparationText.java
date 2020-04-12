import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

//Разовые процедуры
public class SeparationText {

    static String CATALOG_FULL = "C:\\Users\\HP\\Desktop\\Учеба\\Магистратура\\5 курс\\1 семестр\\Нейронны сети\\Худ.жанры\\эпос\\СОЛЯНКА\\";

    /**
     * Создает из файла со сказками файлы с отдельными сказками
     *
     * @param PATH_FILE полный путь к файлу со сказками
     * @throws IOException
     */
    public static void skazki(String PATH_FILE) throws IOException {

//        String FILE_NAME_SKAZKI = PATH_FILE;
        String FILE_NAME_SKAZKI = "C:\\Users\\HP\\Desktop\\Учеба\\Магистратура\\5 курс\\1 семестр\\Нейронны сети\\Худ.жанры\\эпос\\сказка+\\sbornik_skazok.txt";
        List<String> lines_skaz = Files.readAllLines(Paths.get(FILE_NAME_SKAZKI), Charset.forName("windows-1251"));
        String text_skazki = lines_skaz.stream().collect(Collectors.joining(" "));
        String[] lines2_skaz = text_skazki.split("     ");
        for (int i = 0; i < lines2_skaz.length; i++) {
//            String FILE_NAME2 = "C:\\Users\\HP\\Desktop\\Учеба\\Магистратура\\5 курс\\1 семестр\\Нейронны сети\\Худ.жанры\\эпос\\сказка\\";
            String FILE_NAME2 = CATALOG_FULL;
            Files.write(Paths.get(FILE_NAME2 + "skazka_" + (i + 1) + ".txt"), WorkText.cleanText(lines2_skaz[i]).getBytes());
        }
    }

    /**
     * Создает из файла с баснями файлы с отдельными баснями
     *
     * @param PATH_FILE полный путь к файлу с баснями
     * @throws IOException
     */
    public static void basni(String PATH_FILE) throws IOException {

        String FILE_NAME_SKAZKI = "C:\\Users\\HP\\Desktop\\Учеба\\Магистратура\\5 курс\\1 семестр\\Нейронны сети\\Худ.жанры\\эпос\\басня+\\sbornik_basni.txt";
        List<String> lines_bas = Files.readAllLines(Paths.get(FILE_NAME_SKAZKI), Charset.defaultCharset());
        String text_bas = lines_bas.stream().collect(Collectors.joining());
        String[] lines2_bas = text_bas.split("             ");
        int count = 1;
        for (int i = 1; i < lines2_bas.length; i = i + 2) {
//            String FILE_NAME2 = "C:\\Users\\HP\\Desktop\\Учеба\\Магистратура\\5 курс\\1 семестр\\Нейронны сети\\Худ.жанры\\эпос\\басня\\";
            String FILE_NAME2 = CATALOG_FULL;
            Files.write(Paths.get(FILE_NAME2 + "basnja_" + (count++) + ".txt"), WorkText.cleanText(lines2_bas[i]).getBytes());
        }
    }

    /**
     * Создает из файла с очерками файлы с отдельными очерками
     *
     * @param PATH_FILE полный путь к файлу с очерками
     * @throws IOException
     */
    public static void otcherki(String PATH_FILE) throws IOException {

//        String FILE_NAME_SKAZKI = PATH_FILE;
        String FILE_NAME_SKAZKI = "C:\\Users\\HP\\Desktop\\Учеба\\Магистратура\\5 курс\\1 семестр\\Нейронны сети\\Худ.жанры\\эпос\\очерк+\\sbornik_otcherki.txt";
        List<String> lines_o4 = Files.readAllLines(Paths.get(FILE_NAME_SKAZKI), Charset.forName("windows-1251"));
        String text_o4 = lines_o4.stream().collect(Collectors.joining(" "));
        String[] lines2_o4 = text_o4.split("    ");
        for (int i = 0; i < lines2_o4.length; i++) {
            String FILE_NAME2 = CATALOG_FULL;
            Files.write(Paths.get(FILE_NAME2 + "otcherk_" + (i + 1) + ".txt"), WorkText.cleanText(lines2_o4[i]).getBytes());
        }
    }

    /**
     * Создает из файла с повестями файлы с отдельными повестями
     *
     * @param PATH_FILE полный путь к файлу с повестями
     * @throws IOException
     */
    public static void povesti(String PATH_FILE) throws IOException {

//        String FILE_NAME_SKAZKI = PATH_FILE;
        String FILE_NAME_SKAZKI = "C:\\Users\\HP\\Desktop\\Учеба\\Магистратура\\5 курс\\1 семестр\\Нейронны сети\\Худ.жанры\\эпос\\повесть\\sbornik_povesti.txt";
        List<String> lines_povesti = Files.readAllLines(Paths.get(FILE_NAME_SKAZKI), Charset.forName("windows-1251"));
        String text_povesti = lines_povesti.stream().collect(Collectors.joining(" "));
        String[] lines2_povesti = text_povesti.split("        ");
        for (int i = 0; i < lines2_povesti.length; i++) {
//            String FILE_NAME2 = "C:\\Users\\HP\\Desktop\\Учеба\\Магистратура\\5 курс\\1 семестр\\Нейронны сети\\Худ.жанры\\эпос\\повесть\\";
            String FILE_NAME2 = CATALOG_FULL;
            Files.write(Paths.get(FILE_NAME2 + "povest_" + (i + 1) + ".txt"), WorkText.cleanText(lines2_povesti[i]).getBytes());
        }
    }

    /**
     * Создает из файла с рассказами Марины файлы с отдельными рассказами Марины
     *
     * @param PATH_FILE полный путь к файлу с рассказами Марины
     * @throws IOException
     */
    public static void rasskazyMariny(String PATH_FILE) throws IOException {

//        String FILE_NAME_SKAZKI = PATH_FILE;
        String FILE_NAME_SKAZKI = "C:\\Users\\HP\\Desktop\\Учеба\\Магистратура\\5 курс\\1 семестр\\Нейронны сети\\Худ.жанры\\эпос\\рассказ+\\sbornik_rasskazy_marina.txt";
        List<String> lines_povesti = Files.readAllLines(Paths.get(FILE_NAME_SKAZKI), Charset.forName("windows-1251"));
        String text_povesti = lines_povesti.stream().collect(Collectors.joining(" "));
        String[] lines2_povesti = text_povesti.split("    ");
        for (int i = 0; i < lines2_povesti.length; i++) {
//            String FILE_NAME2 = "C:\\Users\\HP\\Desktop\\Учеба\\Магистратура\\5 курс\\1 семестр\\Нейронны сети\\Худ.жанры\\эпос\\рассказ\\";
            String FILE_NAME2 = CATALOG_FULL;
            Files.write(Paths.get(FILE_NAME2 + "rasskaz_marina_" + (i + 1) + ".txt"), WorkText.cleanText(lines2_povesti[i]).getBytes());
        }
    }

    /**
     * Создает из файла с рассказами Марк Твена файлы с отдельными рассказами Марк Твена
     *
     * @param PATH_FILE полный путь к файлу с рассказами Марк Твена
     * @throws IOException
     */
    public static void rasskazyMarkTwena(String PATH_FILE) throws IOException {

//        String FILE_NAME_SKAZKI = PATH_FILE;
        String FILE_NAME_SKAZKI = "C:\\Users\\HP\\Desktop\\Учеба\\Магистратура\\5 курс\\1 семестр\\Нейронны сети\\Худ.жанры\\эпос\\рассказ+\\sbornik_rasskazy_mark_twen.txt";
        List<String> lines_povesti = Files.readAllLines(Paths.get(FILE_NAME_SKAZKI), Charset.forName("windows-1251"));
        String text_povesti = lines_povesti.stream().collect(Collectors.joining(" "));
        String[] lines2_povesti = text_povesti.split("     ");
        for (int i = 0; i < lines2_povesti.length; i++) {
//            String FILE_NAME2 = "C:\\Users\\HP\\Desktop\\Учеба\\Магистратура\\5 курс\\1 семестр\\Нейронны сети\\Худ.жанры\\эпос\\рассказ\\";
            String FILE_NAME2 = CATALOG_FULL;
            Files.write(Paths.get(FILE_NAME2 + "rasskaz_mark_twen_" + (i + 1) + ".txt"), WorkText.cleanText(lines2_povesti[i]).getBytes());
        }
    }

    /**
     * Создает из файла с рассказами Песах файлы с отдельными рассказами Песах
     *
     * @param PATH_FILE полный путь к файлу с рассказами Песах
     * @throws IOException
     */
    public static void rasskazyPesah(String PATH_FILE) throws IOException {

//        String FILE_NAME_SKAZKI = PATH_FILE;
        String FILE_NAME_SKAZKI = "C:\\Users\\HP\\Desktop\\Учеба\\Магистратура\\5 курс\\1 семестр\\Нейронны сети\\Худ.жанры\\эпос\\рассказ+\\sbornik_rasskazy_pesah.txt";
        List<String> lines_povesti = Files.readAllLines(Paths.get(FILE_NAME_SKAZKI), Charset.forName("windows-1251"));
        String text_povesti = lines_povesti.stream().collect(Collectors.joining(" "));
        String[] lines2_povesti = text_povesti.split("    ");
        for (int i = 0; i < lines2_povesti.length; i++) {
//            String FILE_NAME2 = "C:\\Users\\HP\\Desktop\\Учеба\\Магистратура\\5 курс\\1 семестр\\Нейронны сети\\Худ.жанры\\эпос\\рассказ\\";
            String FILE_NAME2 = CATALOG_FULL;
            Files.write(Paths.get(FILE_NAME2 + "rasskaz_pesah_" + (i + 1) + ".txt"), WorkText.cleanText(lines2_povesti[i]).getBytes());
        }
    }

    /**
     * Создает из файла с Эпопеями файлы с отдельными Эпопеями
     *
     * @param PATH_FILE полный путь к файлу с Эпопеями
     * @throws IOException
     */
    public static void epopei(String PATH_FILE) throws IOException {

//        String FILE_NAME_SKAZKI = PATH_FILE;
        String FILE_NAME_SKAZKI = "C:\\Users\\HP\\Desktop\\Учеба\\Магистратура\\5 курс\\1 семестр\\Нейронны сети\\Худ.жанры\\эпос\\эпопея\\sbornik_epopei.txt";
        List<String> lines_povesti = Files.readAllLines(Paths.get(FILE_NAME_SKAZKI), Charset.forName("windows-1251"));
        String text_povesti = lines_povesti.stream().collect(Collectors.joining(" "));
        String[] lines2_povesti = text_povesti.split("    ");
        for (int i = 0; i < lines2_povesti.length; i++) {
//            String FILE_NAME2 = "C:\\Users\\HP\\Desktop\\Учеба\\Магистратура\\5 курс\\1 семестр\\Нейронны сети\\Худ.жанры\\эпос\\эпопея\\";
            String FILE_NAME2 = CATALOG_FULL;
            Files.write(Paths.get(FILE_NAME2 + "epopeja_" + (i + 1) + ".txt"), WorkText.cleanText(lines2_povesti[i]).getBytes());
        }
    }

    /**
     * Создает из файла с романами файлы с отдельными романами
     *
     * @param PATH_FILE полный путь к файлу с романами
     * @throws IOException
     */
    public static void romany(String PATH_FILE) throws IOException {

//        String FILE_NAME_SKAZKI = PATH_FILE;
        String FILE_NAME_SKAZKI = "C:\\Users\\HP\\Desktop\\Учеба\\Магистратура\\5 курс\\1 семестр\\Нейронны сети\\Худ.жанры\\эпос\\роман+\\sbornik_romany.txt";
        List<String> lines_povesti = Files.readAllLines(Paths.get(FILE_NAME_SKAZKI), Charset.forName("windows-1251"));
        String text_povesti = lines_povesti.stream().collect(Collectors.joining(" "));
        String[] lines2_povesti = text_povesti.split("                 ");
        for (int i = 0; i < lines2_povesti.length; i++) {
//            String FILE_NAME2 = "C:\\Users\\HP\\Desktop\\Учеба\\Магистратура\\5 курс\\1 семестр\\Нейронны сети\\Худ.жанры\\эпос\\роман\\";
            String FILE_NAME2 = CATALOG_FULL;
            Files.write(Paths.get(FILE_NAME2 + "roman_" + (i + 1) + ".txt"), WorkText.cleanText(lines2_povesti[i]).getBytes());
        }
    }

    public static void fullWork() throws IOException {
        skazki("");
        basni("");
        otcherki("");
        povesti("");
        rasskazyMariny("");
        rasskazyMarkTwena("");
        rasskazyPesah("");
        epopei("");
        romany("");
    }
}
