
//Question 01 : In a program,input 3 numbers:A,B and C.You have to out put the average of these 3 numbers.
import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        System.out.println("First Number : " + A);

        int B = sc.nextInt();
        System.out.println("First Number : " + B);

        int C = sc.nextInt();
        System.out.println("First Number : " + C);

        int sum = A + B + C;
        System.out.println("Average of " + A + " , " + B + " , " + C + " is = " + (sum / 3));
        sc.close();
    }
}