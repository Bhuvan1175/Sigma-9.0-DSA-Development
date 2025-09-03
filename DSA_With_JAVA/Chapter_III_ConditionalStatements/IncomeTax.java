package DSA_With_JAVA.Chapter_III_ConditionalStatements;
import java.util.Scanner;
public class IncomeTax {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int income=sc.nextInt(); 
        float tax=0;

        if(income < 500000){
            System.out.println("0% Tax");
            tax=0;
        }else if(income>500000 && income<1000000){
            System.out.println("20% Tax");  
            tax=(income*0.2f);  
        }else{
            System.out.println("30% Tax");
            tax=(income*0.3f);  
        }

        System.out.println("Your Tax is : "+tax);
        sc.close();
    }
}
