import java.util.*;
public class CountDigitsOfaNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Any Number : ");
        int num=sc.nextInt();
        int r;
        int count=0;
        while(num>0){
            r=num%10;
            count++;
            System.out.print(r);
            num/=10;
        }
        System.out.println("");
        System.out.println("Count Digits is : "+count);
    }
}