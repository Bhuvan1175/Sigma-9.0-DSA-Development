package DSA_With_JAVA.Chapter_IV_Loops;

import java.util.Scanner;

public class BreakMultipleofTen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Enter Number");
            int n=sc.nextInt();
            if(n%10==0){
                break;
            }
            System.out.println(n);
        }while(true);
        sc.close();
    }
}
