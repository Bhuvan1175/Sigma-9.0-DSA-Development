import java.util.*;
public class DisplayDigits{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Any Number : ");
        int num=sc.nextInt();
        int r;
        while(num>0){
            r=num%10;
            System.out.println(r);
            num/=10;
        }
    }
}