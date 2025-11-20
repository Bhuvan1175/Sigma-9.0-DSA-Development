import java.util.Scanner;
 
public class Question03 {
  
 public static int Palindrome(int number) {
             int PalNum=0;
         while(number>0){
            int lastDigit=number%10;

         PalNum=PalNum*10+lastDigit;
         number /= 10;
         }
return PalNum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        int result=Palindrome(num);
        System.out.println("Palindrom of "+num+" is : "+result);

        int a=9;
        int b=10;
        int result1=Math.max(a, b);
        System.out.println("result1 : "+result1);
    }
}
