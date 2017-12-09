/**
 * Developer: y7usuf
 * Created Date:  1.12.2017
 */

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Random;

public class LAB7 {
    public static void main(String args[]) {
        long start = System.currentTimeMillis();

        Random random = new Random();
        int[] arr = new int[100000];


        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100000) + 1;
        }

        LAB7 ob = new LAB7();
        ob.insertion_sort(arr);

        for (int i = 100000; i > 0; i--)
            System.out.print(arr[i-1] + " ");

        System.out.println();


        long end = System.currentTimeMillis();
        NumberFormat formatter = new DecimalFormat("#0.00000");
        System.out.print("Execution time is " + formatter.format((end - start) / 1000d) + " seconds");

    }

    private void insertion_sort(int arr[]) {
        for (int i = 1; i < arr.length; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
