package DSA_With_JAVA.Chapter_IV_Loops;

import java.util.Scanner;

public class ContinueKeyQues {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Enter Any Number");
            int n=sc.nextInt();
            if(n%10==0){
                //continue;
                break;// for doing to stop the code i used continue ki jgh break 
            }
            System.out.println("You Enter it "+n);
        }while(true);
       
        sc.close();

    }
}
