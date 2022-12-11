package Homework05;

/*
Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что один человек может иметь несколько телефонов.

Пусть дан список сотрудников: Иван, Пётр, Антон и так далее. 
Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.
 */
import java.util.*;

public class Task01_02 {
    private static Map<String, ArrayList<String>> phoneBook = new HashMap<>();
    
    public static void addRecord(String name, String phoneNumber) {
        if (phoneBook.get(name) == null) {
            phoneBook.put(name, new ArrayList<String>());
        }
        phoneBook.get(name).add(phoneNumber);
    }
    public static ArrayList<String> findRecord(String name) {
        return phoneBook.get(name);
    }
    public static void main(String[] args) {
        addRecord("Иван", "123-00-01");
        addRecord("Петр", "123-00-02");
        addRecord("Евгений", "123-00-03");
        addRecord("Петр", "123-00-04");
        addRecord("Елена", "123-00-05");
        addRecord("Петр", "132-00-06");
        addRecord("Елена", "123-00-07");

        ArrayList<Map.Entry<String, ArrayList<String>>> entries = new ArrayList<>(phoneBook.entrySet());
        entries.sort(new Comparator<Map.Entry<String, ArrayList<String>>> () {
            public int compare(Map.Entry<String, ArrayList<String>> e1,  Map.Entry<String, ArrayList<String>> e2) {
                if (e1.getValue().size() < e2.getValue().size()) {
                    return 1;
                } else if (e1.getValue().size() == e2.getValue().size()) {
                    return 0;
                }
                    return -1;
            }
        });
        for (var entry : entries) {
            System.out.println(entry.getKey() + ": " + entry.getValue().size() + " повтор");
        }
    }
   
}
