package Homework04;

/*Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди, 
dequeue() - возвращает первый элемент из очереди и удаляет его, 
first() - возвращает первый элемент из очереди, не удаляя. */

import java.util.*;

public class Task02{
	
	private static void enqueue(List<String> list, String enter) {
		list.add(enter);
	}
	private static String dequeue(LinkedList<String> list) {
		return list.pollFirst();
	}
	private static String first(LinkedList<String> list) {
		return list.getFirst();
	}
    public static void main(String args[]){
		LinkedList<String> list = new LinkedList<>();
    System.out.println("Создаем список, помещаем элементы в конец очереди:");
	enqueue(list, "Sergey");
	enqueue(list, "Polina");
	enqueue(list, "Sasha");
	enqueue(list, "Denis");
		
	System.out.printf("Исходный список: %s\n", list);
	System.out.printf("Первый элемент из очереди: %s\n", dequeue(list));
	System.out.printf("Список после удаления первого элемента: %s\n", list);
	System.out.printf("Первый элемент из очереди: %s\n", first(list));
    }
}