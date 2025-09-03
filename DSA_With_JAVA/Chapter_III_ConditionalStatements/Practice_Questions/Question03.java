// Question3 : Write a Java program to input week number(1-7)and print day of week name using switch case.
package DSA_With_JAVA.Chapter_III_ConditionalStatements.Practice_Questions;

import java.util.Scanner;

public class Question03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int weekDay=sc.nextInt();
        switch (weekDay) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        
            default:
                break;
        }
        sc.close();
    }
}
