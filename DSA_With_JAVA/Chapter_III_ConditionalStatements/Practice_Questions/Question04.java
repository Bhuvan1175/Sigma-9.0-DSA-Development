package DSA_With_JAVA.Chapter_III_ConditionalStatements.Practice_Questions;
import java.util.Scanner;
public class Question04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Year : ");
        int year=sc.nextInt();
        if((year%400==0)||(year%4==0  && year%100!=0)){
            System.out.println(year+" is a LEAP year");
        }else{
            System.out.println(year+" is not a LEAP year");
        }
        sc.close();
    }
}
