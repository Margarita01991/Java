import java.util.Scanner;

// Реализовать простой калькулятор
public class Task03 {
    public static void main(String[] args) {
        System.out.println("Введите цифру команды:"+
        "\n"+"1 сложение"+
        "\n"+"2 вычетание"+
        "\n"+"3 умножение"+
        "\n"+"4 деление");
        Scanner in = new Scanner(System.in);
        int command = in.nextInt();
        System.out.print("Введите первое число: ");
        int num1 = in.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = in.nextInt();
        if (command == 1){
            int result = num1 + num2;
            System.out.println(""+num1+"+"+num2+"="+result+"");
        }
        if (command == 2){
            int result = num1 - num2;
            System.out.println(""+num1+"-"+num2+"="+result+"");
        }
        if (command == 3){
            int result = num1 * num2;
            System.out.println(""+num1+"*"+num2+"="+result+"");
        }
        if (command == 4){
            if (num2 !=0){
            int result = num1 / num2;
            System.out.println(""+num1+"/"+num2+"="+result+"");
            } else {
                System.out.println("На 0 делить нельзя");
            }
        }
        in.close();
    }
}