// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class Task01 {
    public static void main (String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print ("Введите число: ");
        int n = in.nextInt();
        in.close ();
        int sum = 0;
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
            factorial = factorial * i;
        }
        System.out.printf ("сумма чисел от 1 до "+n+": %d \n", sum);
        System.out.printf ("факториал "+n+"!: %d \n", factorial);
    }
}
