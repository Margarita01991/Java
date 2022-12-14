package Homework05;

// Реализовать алгоритм пирамидальной сортировки (HeapSort).

import java.util.*;

public class Task03 {
    public static void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
    public static void fixHeap(int[] a, int rootIndex, int lastIndex) {
        int rootValue = a[rootIndex];
        int index = rootIndex;
        boolean more = true;
        while (more) {
            int childIndex = getLeftChildIndex(index);
            if (childIndex <= lastIndex) {
                int rightChildIndex = getRightChildIndex(index);
                if (rightChildIndex <= lastIndex && a[rightChildIndex] > a[childIndex]) {
                    childIndex = rightChildIndex;
                }
            
                if (a[childIndex] > rootValue) {
                    a[index] = a[childIndex];
                    index = childIndex;
                } else {
                    more = false;
                }
            } else {
                more = false; 
            }
        }
        a[index] = rootValue;
    }
    private static int getLeftChildIndex(int index) {
        return 2 * index + 1;
    }
    private static int getRightChildIndex(int index) {
        return 2 * index + 2;
    }
    public static void sort(int[] a) {
        int n = a.length - 1;
        
        for (int i = (n - 1) / 2; i >= 0; i--) {
            fixHeap(a, i, n);
        }
        while (n > 0) {
            swap(a, 0, n);
            n--;
            fixHeap(a, 0, n);
        }
    }
    public static void main(String[] args) {
        int [] array = new int[] {5, 0, 7, 2, 9, -2, 4, 6};
        System.out.print("Исходный массив: ");
        System.out.println(Arrays.toString(array));
        sort(array);
        System.out.print("Итоговый массив: ");
        System.out.println(Arrays.toString(array));
    }
}