//Questions 01 :  Write a Java program to get a number from the user and print whether it is positive or negative.
package DSA_With_JAVA.Chapter_III_ConditionalStatements.Practice_Questions;
import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number :");
        int number=sc.nextInt();
        if(number>0){
            System.out.println("Its Positive Number");
        }else{
            System.out.println("Its Negative Number");
        }
        sc.close();
    }
}
