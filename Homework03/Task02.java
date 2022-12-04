package Homework03;

// Пусть дан произвольный список целых чисел. Удалить из него чётные числа.

import java.util.Arrays;

public class Task02 {

    public static void main(String[] args)
    {
        int[] array = {5, 0, 7, 2, 9, -2, 4, 6};
        System.out.print("Исходный массив: ");
        System.out.println(Arrays.toString(array));
        int[] result = removeEven(array);
        System.out.print("Итоговый массив: ");
        System.out.println(Arrays.toString(result));
    }

    public static int[] removeEven(int[] array)
    {
        int count = 0;
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] % 2 != 0)
            {
                count++;
            }
        }
        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] % 2 != 0)
            {
                result[index++] = array[i];
            }
        }
        return result;
    }
}