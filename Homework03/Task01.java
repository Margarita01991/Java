package Homework03;

// Реализовать алгоритм сортировки слиянием.

import java.util.Arrays;

public class Task01 {
    public static void main(String[] args) {
        int [] array = new int[] {5, 0, 7, 2, 9, -2, 4, 6};
        System.out.print("Исходный массив: ");
        System.out.println(Arrays.toString(array));
        System.out.print("Итоговый массив: ");
        System.out.println(Arrays.toString(mergeSort(new int[] {5, 0, 7, 2, 9, -2, 4, 6})));
    }
    public static int[] mergeSort(int[] array){
        if (array.length == 1 || array.length == 0) return array;
        int[] right = mergeSort(Arrays.copyOf(array, array.length / 2));
        int[] left = mergeSort(Arrays.copyOfRange(array,array.length / 2, array.length));
        int n = 0, m = 0, k = 0;
        int[] newArr = new int[right.length+left.length];
        while (n < right.length && m < left.length)
            if (right[n] <= left[m])
                newArr[k++] = right[n++];
            else
                newArr[k++] = left[m++];
        while (n < right.length) newArr[k++] = right[n++];
        while (m < left.length) newArr[k++] = left[m++];
        return newArr;
    }
}