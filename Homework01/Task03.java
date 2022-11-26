import java.util.Scanner;

// Реализовать простой калькулятор
public class Task03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = in.nextInt();
        System.out.println("Введите операцию: + - * /");
        String operand = in.next();
        System.out.print("Введите второе число: ");
        int num2 = in.nextInt();
        in.close();
        if (operand.equals("+")){
            int result = num1 + num2;
            System.out.println(""+num1+"+"+num2+"="+result+"");
        }
        if (operand.equals("-")){
            int result = num1 - num2;
            System.out.println(""+num1+"-"+num2+"="+result+"");
        }
        if (operand.equals("*")){
            int result = num1 * num2;
            System.out.println(""+num1+"*"+num2+"="+result+"");
        }
        if (operand.equals("/")){
            if (num2 !=0){
            int result = num1 / num2;
            System.out.println(""+num1+"/"+num2+"="+result+"");
            } else {
                System.out.println("На 0 делить нельзя");
            }
        }
    }
}