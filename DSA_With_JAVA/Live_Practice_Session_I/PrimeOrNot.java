
import java.util.Scanner;

public class PrimeOrNot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number : ");
        int num = sc.nextInt();
        if (num == 2) {
            System.out.println(num + " Is Prime Number!");
        } 
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
      
        if (isPrime) {
            System.out.println(num + " is Prime Number");
        } else {
            System.out.println(num + " is not Prime Number");
        }
    }
}
