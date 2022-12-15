package Final_task;

/*1. Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
2. Создать множество ноутбуков.
3. Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
   отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
“Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
4. Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
5. Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
*/

import java.util.*;

public class Task{
    public static final String GREEN = "\033[0;32m";
    public static final String RESET = "\033[0m";

    public static void result(Map<String, Laptop> result){
        for (var Laptop : result.entrySet()) {
            System.out.printf(GREEN + "%s\n%s\n" , Laptop.getKey() + RESET, Laptop.getValue().toString());
        }       
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<Integer, String> filter = new HashMap<>();
        Map<String, Laptop> result = new LinkedHashMap<>();
        Set<Laptop> laptops = new HashSet<>();
        
        Laptop laptop1 = new Laptop("Acer","Windows 11" , "80000","4 Tb", "8Gb", "black");
        Laptop laptop2 = new Laptop("ASUS","Windows 11", "85000", "6 Tb", "8Gb", "blue");
        Laptop laptop3 = new Laptop("ASUS","Windows 10", "90000", "2 Tb", "16Gb", "grey");
        Laptop laptop4 = new Laptop("Apple","Linux", "100000", "4 Tb", "16Gb", "red");
        Laptop laptop5 = new Laptop("HP","Windows 10", "80000", "2 Tb", "16Gb", "red");
        Laptop laptop6 = new Laptop("HP","Windows 10", "80000", "2 Tb", "4Gb", "white");

        laptops.add(laptop1);
        laptops.add(laptop2);
        laptops.add(laptop3);
        laptops.add(laptop4);
        laptops.add(laptop5);
        laptops.add(laptop6);

        filter.put(1, "Производитель");
        filter.put(2, "Операционная система");
        filter.put(3, "Стоимость");
        filter.put(4, "Объем ЖД");
        filter.put(5, "ОЗУ");
        filter.put(6, "Цвет");        

        System.out.println("Введите цифру, соответствующую необходимому критерию:\n1 - Производитель\n2 - Операционная система\n3 - Стоимость\n4 - Объем ЖД\n5 - ОЗУ\n6 - Цвет");
        System.out.print("Ввод: ");
        int number = scan.nextInt();
                
        if(filter.containsKey(number)){
            switch(number){
                case 1:{
                    System.out.printf("Введите название %s: \n", filter.get(1));
                    System.out.print("Ввод: ");
                    String input = scan.next();
                    Laptop.findByManufacturer(laptops, input, result);
                    result(result);
                    break;
                }
                case 2:{
                    System.out.printf("Введите название %s: \n", filter.get(2));
                    System.out.print("Ввод: ");
                    String input = scan.next();
                    Laptop.findByOperatingSystem(laptops, input, result);
                    result(result);
                    break;
                }
                case 3: {
                    System.out.printf("Введите название %s: \n", filter.get(3));
                    System.out.print("Ввод: ");
                    String input = scan.next();
                    Laptop.findByPrice(laptops, input, result);
                    result(result);
                    break;
                }
                case 4: {
                    System.out.printf("Введите название %s: \n", filter.get(4));
                    System.out.print("Ввод: ");
                    String input = scan.next();
                    Laptop.findByDiscSpace(laptops, input, result);
                    result(result);
                    break;
                }
                case 5: {
                    System.out.printf("Введите название %s: \n", filter.get(5));
                    System.out.print("Ввод: ");
                    String input = scan.next();
                    Laptop.findByRam(laptops, input, result);
                    result(result);
                    break;
                }
                case 6: {
                    System.out.printf("Введите название %s: \n", filter.get(6));
                    System.out.print("Ввод: ");
                    String input = scan.next();
                    Laptop.findByColor(laptops, input, result);
                    result(result);
                    break;
                }
            }
            scan.close();
        }
    }
}
