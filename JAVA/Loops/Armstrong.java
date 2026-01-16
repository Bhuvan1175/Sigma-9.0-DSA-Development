import java.util.*;
public class Armstrong{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Any Number : ");
        int num=sc.nextInt();
        int Original=num;
        int r;
        int sum=0;
        while(num>0){
            r=num%10;
            num/=10;
            sum=sum+(r*r*r);
        
        }
        System.out.println("Sum : "+sum);
        if(sum==Original){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not an Armstrong Number");
        }
    
    }
}