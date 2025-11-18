import java.util.Scanner;
public class Fibonacci{
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any Number : ");
        int num=sc.nextInt();
        int a=0;
        int b=1;
          System.out.print(a+",");
           System.out.print(b+",");
        int c;
        for(int i=1;i<=num;i++){
            c=a+b;
            System.out.print(c+",");
            a=b;
            b=c;
        }
    }
}