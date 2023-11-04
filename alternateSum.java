import java.util.*;
public class alternateSum {

    // Function definition
    public static int sum (int n) {
        // Base case condition
        if(n==0){
            return 0;
        }
        // Recursive  function call
        // if num is even
        if(n%2==0){
            return sum(n-1)-n;
        }
        // if num is odd
        else{
            return sum(n-1)+n;
        }
    }
    public static void main(String[] args) {
        int num = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element:");
        num = sc.nextInt();
        
        // Function callimg
        int result= sum(num);
        System.out.println("The alternate sign sum  is :"+result);

    }
}
