// Time complexity :O(n2)
// Space complexity : O(1)


package Shorting;
import java.util.*;
import java.io.*;

public class SelectionSort {
public static void selectionSort(int[]arr){
    for(int i=0; i<arr.length;i++){

        // MIn_idx is taking the index of minimum element at every iteration
        int min_idx = i;
        for(int j=i+1; j<arr.length;j++){
            if(arr[j]<arr[min_idx]){
                min_idx =j;

            }
        }
        if(min_idx != i){

            // Swap  between arr[min_idx and rr[i]
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;

        }
    }
}
    public static void main(String[] args) {
        int [] arr = {20,50,12,17,19,25,97,16};
        //Fuunction calling
        selectionSort(arr);
        System.out.println("Sorted array is:");
        System.out.println(Arrays.toString(arr));
    }
}
