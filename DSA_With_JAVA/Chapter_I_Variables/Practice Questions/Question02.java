// Question 02 : In a program,input the side of asquare.You have to output the area of the square.
import java.util.Scanner;

public class Question02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int side=sc.nextInt();
        System.out.println("Area of Square = "+(side*side));
        sc.close();
    }
}