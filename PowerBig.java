import java.math.*;
import java.util.Scanner;

public class PowerBig {
    // Function definition
  
    public static BigInteger powerFind(BigInteger a, int b){
        BigInteger result, finalResult;

        // Base case condition
        if(b == 1){
            return a;
        }
        // Recursive function calls
        else{
            result = powerFind(a, b/2);
            finalResult = result.multiply(result);
            if(b%2 == 0){
                return finalResult;
            }
            else{
                return a.multiply(finalResult);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
System.out.println("Enter the values of a and b : ");
BigInteger a = sc.nextBigInteger();
int b = sc.nextInt();

// Function calling
BigInteger result = powerFind(a,b);
System.out.println("Power of an element is:"+ result);
    }
    
}
