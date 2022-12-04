package Homework03;

// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметичское этого списка.

import java.util.*;

public class Task03 {
    public static void main(String[] args) {

        List<Integer> lst = Arrays.asList(5, 0, 7, 2, 9, -2, 4, 6);
        float sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum = sum + lst.get(i);
        }
        Collections.sort(lst);
        System.out.println("Maximum:" + lst.get(lst.size()-1));
        System.out.println("Minimum:" + lst.get(0));
        System.out.println("Average:" + sum / lst.size());

    }
}