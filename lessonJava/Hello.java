// import java.time.LocalDateTime;
// import java.time.format.DateTimeFormatter;
// import java.util.Scanner;

/*
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


class Hello {
    public static void main(String[] args) {
        System.out.println("Hello world");
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println(now.format (formatter));
    }
}
*/
/*
public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.printlnf("Hi, %s", name);
        scanner.close();
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm");
        System.out.println(now.format(formatter));
        if (now.getHour() > 5 && now.getHour() < 12){
            System.out.printlnf("Good morning, %s", name);
        }
        else if (now.getHour() >= 12 && now.getHour() < 18){
            System.out.printlnf("Good day, %s", name);
        }
        else if (now.getHour() >= 18 && now.getHour() < 22){
            System.out.printlnf("Good evening, %s", name);
        }
        else (now.getHour() > 5 && now.getHour() < 12){
            System.out.printlnf("Good night, %s", name);
        }
    }
   
}
*/
/*
public class Hello {
    public static void main(String[] args) {
        int[] array = {1,1,0,1,1,1,0,3};
        int count = 0;
        int max = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] == 1){
                count++;
                if (count>max){
                    max = count;
                }
            }
            else{
                count = 0;
            }
        }
        System.out.println(count);
    }
}
*/

public class Hello {
    public static void main(String[] args) {
        int[] array = {3,2,2,3,2,4,5,3,3,5};
        int[] arrayNew = new int [array.length];
        int val = 3;
        int count = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] == val){
                arrayNew[array.length-1-count] = array[i];
                count++;
            }
            else{
                arrayNew[i-count] = array[i];
            }

        }
        for (int j = 0; j < array.length; j++) {
            System.out.print(arrayNew[j] + " ");
        }
    }
}
 
/*
public class Hello {
    public static void main(String[] args) {
        String[] array = {"abc","abcd","abcgdgdg","ahdh"};// берем все буквы из первой строки и сравниваем со всеми элементами
        System.err.println(FindPrefix(array));
        }

    private static String FindPrefix(String[] array){
        String result = ""; //
        for (int j = 0; j < array[0].length(); j++) {
            result += array[0].charAt(j);
            int count = 1;

            for (int i = 1; i < array.length; i++) {
                if (array[i].startsWith(result) == true){
                    count++;
                }
            }
            if (count < array.length){
                return result.substring(beginIndex:0, result.length()-1)
            }
        return result;
            // System.out.println(count);   
    }
}
 */