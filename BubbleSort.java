// Approach : Bubble Sort
// time complexity: O(n ^ 2)
// space complexity: O(1)

package Shorting;
import java.util.*;
import java.io.*;

public class BubbleSort {
    public static void BubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;

            // For every iteration we ,get the biggest element in an array in the end

            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    // Swap between arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 20, 50, 10, 12, 45, 67, 90 };

        // Function calling
        BubbleSort(arr);
        System.out.println("Sorted array is:");
        System.out.println(Arrays.toString(arr));
    }
}
