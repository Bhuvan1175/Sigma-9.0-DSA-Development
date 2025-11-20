// Question 1 :Write a Java method to compute the averageof three numbers.
import java.util.Scanner;
public class Question01{
   
   public static int Averages(int a,int b,int c){
        int Averages=(a+b+c)/3;
        return  Averages;
        
   }
   
    public static void main(String[] args) {
               Scanner sc=new Scanner(System.in);
               System.out.println("Enter Number A : ");
               int A=sc.nextInt();
               System.out.println("Enter Number B : ");
               int B=sc.nextInt();
               System.out.println("Enter Number C : ");
               int C=sc.nextInt();
               int AverageResult=Averages(A, B, C);
               System.out.println("Average of "+A+","+B+","+C+" is : "+AverageResult);
    }
}