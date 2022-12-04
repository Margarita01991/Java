package Homework04;

// Пусть дан LinkedLst с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

import java.util.*;

public class Task01{
	
	private static LinkedList<Integer> lstReverse(LinkedList<Integer> lst) {
		LinkedList<Integer> temp = new LinkedList<>();
		Iterator<Integer> it = lst.descendingIterator();
		while(it.hasNext()) {
			temp.add(it.next());
		}
		return temp;
	}
    public static void main(String args[]){
	
	LinkedList<Integer> lst = new LinkedList<>();
	for (int i = 0; i < 10; i++) {
		lst.add(new Random().nextInt(30) + 1);
	}
	System.out.printf("Исходный список: %s\n", lst);
	LinkedList<Integer> lst1 = lstReverse(lst);
	System.out.printf("Итоговый список: %s", lst1);
    }
}