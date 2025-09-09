// Question : Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
package DSA_With_JAVA.Chapter_IV_Loops.PracticeQuestion;

import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any Number");
        int n=sc.nextInt();
        int evenSum=0;
        int oddSum=0;
        while(n>0){
            int lastDigit=n%10;
            if(lastDigit%2==0){
                System.out.println(lastDigit+" is Even Number");
                evenSum+=lastDigit;
            }else{
                System.out.println(lastDigit+" is Odd Number");
                oddSum+=lastDigit;
            }
            n/=10;
        }
        System.out.println("Even Sum : "+evenSum);
        System.out.println("Odd Sum : "+oddSum);
        sc.close();
    }
}
