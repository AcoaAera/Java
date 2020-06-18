package db;

import java.sql.*;
import java.util.Map;

public class Query {
    public static Connection conn = MyConnection.GetConnection();

    public static Integer insWords(String word) {
        try {
            PreparedStatement stm = conn.prepareStatement(
                    "INSERT INTO java.words (name) VALUES ('" + word + "')", Statement.RETURN_GENERATED_KEYS);
            stm.execute();
            ResultSet rs = stm.getGeneratedKeys();
            rs.next();
            return rs.getInt(1);
        } catch (SQLException e) {
            System.out.println("Дубликат слова");
            return null;
        }
    }

    public static Integer insRoman(String word) {
        try {
            PreparedStatement stm = conn.prepareStatement("INSERT INTO java.romans (name) VALUES (?)", Statement.RETURN_GENERATED_KEYS);

            stm.setString(1, word);
            stm.execute();
            ResultSet rs = stm.getGeneratedKeys();
            rs.next();
            return rs.getInt(1);
        } catch (SQLException e) {
            System.out.println("Дубликат романа");
            return null;
        }
    }

    public static Integer getRomanIdByName(String name) {
        try {
            PreparedStatement stm = conn.prepareStatement(
                    "INSERT INTO java.romans (name) VALUES (?)");
            stm.setString(1, name);
            stm.execute();
            return null;
        } catch (Exception e) {
            return null;
        }
    }

    public static Integer getWordIdByName(String name) {
        try {
            PreparedStatement stm = conn.prepareStatement(
                    "INSERT INTO java.word (name) VALUES (?)");
            stm.setString(1, name);
            stm.execute();
            return null;
        } catch (Exception e) {
            return null;
        }
    }

    public static void insWIR2(Integer idWord, Integer idRoman, Double count) {
        try {
            String SQL = "INSERT INTO `java`.`words_in_romans` (`word_id`, `roman_id`, `count`) VALUES ('" + idWord + "', '" + idRoman + "', '" + count + "')";
            PreparedStatement stm = conn.prepareStatement(SQL);
            stm.execute();
        } catch (Exception ex) {
            System.out.println("Ошбика в insWIR2: " + ex.getMessage());
        }
    }

    public static Integer getIdWord(String word) {
        try {
            String SQL = "SELECT id FROM words WHERE name = '" + word + "'";
            PreparedStatement stm = conn.prepareStatement(SQL);
            ResultSet resultSet = stm.executeQuery();
            while (resultSet.next()){
                return resultSet.getInt(1);
            }
            return null;
        } catch (Exception ex) {
            System.out.println("Не могу получить id слова: " + ex.getMessage());
            return null;
        }
    }

//    public static void insWIR(Map<String, Double> map, String nameRoman) {
//        try {
//            Integer idRoman = getRomanIdByName(nameRoman);
//            map.forEach((key, value) -> {
//                Integer idWord = getWordIdByName(key);
//
//            });
//        } catch (Exception ex) {
//            System.out.println("Возникла ошибка");
//        }
//    }
}
