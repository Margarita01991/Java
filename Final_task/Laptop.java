package Final_task;

import java.util.Map;
import java.util.Set;

public class Laptop {
    String manufacturer;
    String operatingSystem;
    String price;
    String hdd;
    String ram;
    String color;
    

    public Laptop (String manufacturer, String operatingSystem, String price, String hdd, String ram, String color){
        this.manufacturer = manufacturer.toLowerCase();
        this.operatingSystem = operatingSystem.toLowerCase();
        this.price = price;
        this.hdd = hdd;
        this.ram = ram;
        this.color = color.toLowerCase();;
    }
    public static void findByManufacturer(Set<Laptop> laptops, String input, Map<String, Laptop> result){
        int count = 1;
        for(Laptop laptop : laptops){
            if(laptop.manufacturer.contains(input)){
                result.put(String.format("Ноутбук № %d", count), laptop);
                count++;
            }
        } 
    }
    public static void findByOperatingSystem(Set<Laptop> laptops, String input, Map<String, Laptop> result){
        int count = 1;
        for(Laptop laptop : laptops){
            if(laptop.operatingSystem.contains(input)){
                result.put(String.format("Ноутбук № %d", count), laptop);
                count++;
            }
        } 
    }
    public static void findByPrice(Set<Laptop> laptops, String input, Map<String, Laptop> result){
        Integer count = 1;
        for(Laptop laptop : laptops){
            if(laptop.price.contains(input)){
                result.put(String.format("Ноутбук № %d", count), laptop);
                count++;
            }
        } 
    }
    public static void findByDiscSpace(Set<Laptop> laptops, String input, Map<String, Laptop> result){
        int count = 1;
        for(Laptop laptop : laptops){
            if(laptop.hdd.contains(input)){
                result.put(String.format("Ноутбук № %d", count), laptop);
                count++;
            }
        }  
    } 
    public static void findByRam(Set<Laptop> laptops, String input, Map<String, Laptop> result){
        int count = 1;
        for(Laptop laptop : laptops){
            if(laptop.ram.contains(input)){
                result.put(String.format("Ноутбук № %d", count), laptop);
                count++;
            }
        }
    }
    public static void findByColor(Set<Laptop> laptops, String input, Map<String, Laptop> result){
        Integer count = 1;
        for(Laptop laptop : laptops){
            if(laptop.color.contains(input)){
                result.put(String.format("Ноутбук № %d", count), laptop);
                count++;
            }
        } 
    }

    @Override
    public String toString() {
        return String.format("Производитель: %s\nОперационная система: %s\nЦена: %s\nОЗУ: %s\nHDD: %s\nЦвет: %s", manufacturer, operatingSystem, price, hdd, ram, color);
    }
}
