import java.util.*;
// import java.util.Scanner;

public class countWays {
    // Function definition
    public static int countNum(int n){
        int result = -0;
        if(n <= 1){
            return 1;
        }
        else{
            result = countNum(n-1)+countNum(n-2);
        }
        return result;
    }
    public static void main(String[] args) {
        Scannersc = new Scanner(System.in);
        System.out.println("Enter numberr of stairs:");
        int n = sc.nextInt;

        // Function calling
        
        int result = countNum(n+1);
        System.out.println("Number of ways is:"+result);
    
    }
}
