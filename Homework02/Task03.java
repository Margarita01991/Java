/*В файле содержится строка с данными:
[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"}, {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
 {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]

Напишите метод, который разберёт её на составные части и, используя StringBuilder создаст массив строк такого вида:

Студент Иванов получил 5 по предмету Математика.
Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика. */

package Homework02;

import java.io.*;
import java.util.*;

public class Task03 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new FileInputStream("Homework02/list_task03.json"));
        String s = scanner.nextLine();
        scanner.close();
        // System.out.println(scanner);
        List<String> report = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int index = i;
            char current = s.charAt(i);
            if (current == '\"') {
                index = s.indexOf('\"', i + 1);
                String word = s.substring(i + 1, index);
                if (word.equals("family")) {
                    sb.append("student ");
                } else if (word.equals("estimation")) {
                    sb.append(" received a ");
                } else if (word.equals("subject")) {
                    sb.append(" in the subject of ");
                } else {
                    sb.append(word);
                }
            }
            if (current == '}') {
                report.add(sb.toString());
                sb.setLength(0);
            }
            i = index;
        }
        System.out.println(report.toString().replaceAll("^\\[|\\]$", ""));
    }
}

