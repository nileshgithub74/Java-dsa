package Sorting;

import java.util.Arrays;

public class CountSort {

    public static void sorting(int[] arr) {
        int max = arr[0];
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int[] count = new int[max + 1];

        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }5

        for (int i = 1; i <= max; i++) {
            count[i] = count[i - 1] + count[i];

        }

        int[] output = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            int index = count[arr[i]];
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }

    }

    public static void main(String[] args) {

        int[] arr = { 4, 2, 2, 8, 3, 3, 1 };
        sorting(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

    }

}


// counting sort became unstable when it is done in in-place;