package Recurstion;

import java.util.Scanner;


public class Fibonacci {
    public static int fibonacciFinding (int n) {
        
        int result = 0;
        // 1.Base case condtion
        if(n<=1){
            return n;
        }

        // 2. Recursive function call
         else{
            result = fibonacciFinding(n-1) +fibonacciFinding(n-2);
         }
         return result;
    }
    

    // Function definition
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number  in fibonacci series:");

        int n = sc.nextInt();

        // Function calling
        int result = fibonacciFinding(n);
        System.out.println("The final output is:"+result);

        
    }
}
