//Question 3 :Write a program to find the factorialof any number entered by the user
package DSA_With_JAVA.Chapter_IV_Loops.PracticeQuestion;

import java.util.Scanner;

public class Question02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any Number");
        int n=sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        System.out.println("Factorial of "+n+" is : "+fact);
        sc.close();
    }
}
