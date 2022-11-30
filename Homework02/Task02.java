/*
Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
 */

package Homework02;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.*;

public class Task02 {
    public static void main(String[] args) {
        int[] arr = {3,1,5,0,7,9,8};

        try {
            System.out.println(Arrays.toString(bubbleSort(arr)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static int[] bubbleSort(int[] array) throws IOException {
        Logger logger = Logger.getLogger(Task02.class.getName());
        FileHandler fh = new FileHandler("Homework02/log_task02.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        boolean sorted = false;
        while (!sorted){
            for (int i = 0; i < array.length-1; i++) {
                sorted = true;
                if (array[i] > array[i+1]){
                    sorted = false;
                    int tmp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = tmp;
                }
                logger.log(Level.INFO, Arrays.toString(array));
            }
        }
        return array;
    }
}    
