import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class WorkText {

    /**
     * Получает список уникальных слов по каталогу
     *
     * @param CATALOG каталог к папке с текстовыми файлами
     * @return
     */
    public static List<String> getUniqWordsByCatalog(String CATALOG) {

        File dir1 = new File(CATALOG);

        List<String> fullRowsString = new ArrayList<>();
        String foldedLines;
        String cleanLines;

        for (String fileName : Objects.requireNonNull(dir1.list())) {
            List<String> rowsFile = new ArrayList<>();
            //TODO Надо как-то обработать
            try {
                rowsFile = getRowsFileCharsetDefault(CATALOG + "\\" + fileName);
            } catch (Exception ex) {
                try {
                    rowsFile = getRowsFileCharsetWindows1251(CATALOG + "\\" + fileName);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } finally {
                fullRowsString.addAll(rowsFile);
            }
        }

        foldedLines = String.join(" ", fullRowsString);

        cleanLines = cleanText(foldedLines);

        return getWordsUniq(cleanLines);
    }

    /**
     * Возвращает список с текстами файлов
     * @param CATALOG путь к КАТАЛОГУ
     * @return
     */
    public static List<String> getListTextByCatalog(String CATALOG) {

        File dir1 = new File(CATALOG);

        List<String> listTexts = new ArrayList<>();

        for (String fileName : Objects.requireNonNull(dir1.list())) {

            listTexts.add(getTextByPath(CATALOG + "\\" + fileName));

        }

        return listTexts;

    }

    /**
     * Возвращает текст файла в очищенном виде для построения N-грамм
     *
     * @param PATH путь к фалу
     * @return
     */
    public static String getTextByPath(String PATH) {
        List<String> rowsFile = new ArrayList<>();
        try {
            rowsFile = getRowsFileCharsetDefault(PATH);
        } catch (Exception ex) {
            rowsFile = getRowsFileCharsetWindows1251(PATH);
        } finally {
            String text = String.join(" ", rowsFile);
            text = cleanText(text);
            return text;
        }
    }

    /**
     * Получает все строки из текстового файла. Кодировка default
     *
     * @param PATH полный путь к файлу
     * @return
     * @throws IOException
     */
    public static List<String> getRowsFileCharsetDefault(String PATH) throws IOException {
        return Files.readAllLines(Paths.get(PATH), Charset.defaultCharset());
    }

    /**
     * Получает все строки из текстового файла. Кодировка windows-1251
     *
     * @param PATH полный путь к файлу
     * @return
     * @throws IOException
     */
    public static List<String> getRowsFileCharsetWindows1251(String PATH) throws IOException {
        return Files.readAllLines(Paths.get(PATH), Charset.forName("windows-1251"));
    }

    /**
     * Формирует список уникальных слов в тексте
     *
     * @param text
     * @return
     */
    private static List<String> getWordsUniq(String text) {

        List<String> wodrsList = new ArrayList<>();
        for (String s : text.split(" ")) {
            if (!wodrsList.contains(s)) {
                wodrsList.add(s);
            }
        }

        return wodrsList;
    }

    /**
     * Чистит текст от символов, цифр, лишних пробелов, lowerCase
     *
     * @param text
     * @return
     * @throws IOException
     */
    public static String cleanText(String text) {

        //обработка минуса
        String rowFile = text.replace('-', ' ');
        rowFile = rowFile.replace('–', ' ');
        rowFile = rowFile.replace('-', ' ');
        //Убираем всякие символы
        rowFile = rowFile.replaceAll("[\\^\\$\\(\\)|<\\>\\|\\\\\\{\\}\\[\\]\\.\\*\\+\\?!,'\"_=%#№@`~»«:;…—a-zA-Z]", "");
//        //убираем цифры
//        rowFile = rowFile.replaceAll("[0-9]", "");
        rowFile = rowFile.toLowerCase();
        //Убираем лишние пробелы
        rowFile = rowFile.replaceAll("[\\s]{2,}", " ");
        rowFile = rowFile.replace("  ", " ");
        rowFile = rowFile.replace("  ", " ");
        rowFile = rowFile.replace("  ", " ");
        rowFile = rowFile.replace("  ", " ");

        return rowFile;
    }

}
