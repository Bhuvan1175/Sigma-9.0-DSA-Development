import java.util.*;
public class PalindromeNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Any Number : ");
        int num=sc.nextInt();
        int r;
        int rev=0;
        int Original=num;
        while(num>0){
            r=num%10;
            rev=r+rev*10;
            num/=10;
        }
        System.out.println(rev);
        if(rev==Original){
            System.out.println("Palindrome Number");
        }else{
             System.out.println("Not a Palindrome Number");
        }
    }
}