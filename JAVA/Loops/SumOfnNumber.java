import java.util.*;
public class SumOfnNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Any Number : ");
        int num=sc.nextInt();
        int sum=0;
        for(int i=0;i<=num;i++){
            sum+=i;
        }
        System.out.println("Sum Of N Number is : "+sum);
    }
}