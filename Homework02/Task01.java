/*
В файле содержится строка с исходными данными в такой форме: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
Требуется на её основе построить и вывести на экран новую строку, в форме SQL запроса:
SELECT * FROM students WHERE name = "Ivanov" AND country = "Russia" AND city = "Moscow";
Для разбора строки используйте String.split. Сформируйте новую строку, используя StringBuilder. Значения null не включаются в запрос.
 */

package Homework02;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task01 {
    public static void main(String[] args) {

        String s = parseJson("Homework02/list_task01.json");
        String[] text;
        text = s.split(",");
        StringBuilder sqlText = new StringBuilder();
        sqlText.append("SELECT * FROM students WHERE ");
        for (int i = 0; i < text.length; i++) {
            text[i] = text[i].replaceFirst("\"", "");
            text[i] = text[i].replaceFirst("\"", "");
            if (!(text[i].contains("null"))) {
                text[i] = text[i].replace(":", " = ");
                sqlText.append(text[i]);
                if (i != 2) {
                    sqlText.append(" AND ");
                }
            }
        }
        System.out.println(sqlText.toString());
    }

    private static String parseJson(String path) {

        try (FileReader fr = new FileReader(path);) {
            Scanner scan = new Scanner(fr);
            StringBuilder build = new StringBuilder();
            String s = "";
            while (scan.hasNextLine()) {
                build.append(scan.nextLine());
            }
            s = build.toString();
            scan.close();
            s = s.replace(" ", "");
            s = s.replace("{", "");
            s = s.replace("}", "");
            return s;
        } catch (FileNotFoundException ex2) {
            System.out.println(ex2.getMessage());
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
        return "";
    }
}
