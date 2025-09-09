package DSA_With_JAVA.Chapter_IV_Loops;

import java.util.*;

public class PrimeOrNot {
    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     System.out.println("Enter a positive Number");
    //     int n=sc.nextInt();
    //     int i;
    //     for(i=2;i<=n-1;i++){
    //         if(n%i==0){
    //             System.out.println("Not a Prime Number");
    //             break;
    //         }

    //     }
    //     if(i==n){
    //         System.out.println(n+" Is Prime Number");
    //     }

    //   sc.close();
    // }
    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     System.out.println("Enter a positive Number");
    //     int n=sc.nextInt();
    //     boolean isPrime=true;
    //     for(int i=2;i<=n-1;i++){
    //         if(n%i==0){
    //             isPrime=false;
    //             break;
    //         }

    //     }
    //     if(isPrime==true){
    //         System.out.println(n+" Is Prime Number");
    //     }else{
    //         System.out.println(n+" Is not Prime Number");
    //     }

    //   sc.close(); 
    // }

    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     System.out.println("Enter a positive Number");
    //     int n=sc.nextInt();
    //     if(n==2){
    //         System.out.println(n+" Is Prime Number");
    //     }else{
    //         boolean isPrime=true;
    //     for(int i=2;i<=n-1;i++){
    //         if(n%i==0){
    //             isPrime=false;
    //             break;
    //         }

    //     }
    //     if(isPrime==true){
    //         System.out.println(n+" Is Prime Number");
    //     }else{
    //         System.out.println(n+" Is not Prime Number");
    //     }
    //     }
        

    //   sc.close(); 
    // }

    // for big number

     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a positive Number");
        int n=sc.nextInt();
        if(n==2){
            System.out.println(n+" Is Prime Number");
        }else{
            boolean isPrime=true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                isPrime=false;
                break;
            }

        }
        if(isPrime==true){
            System.out.println(n+" Is Prime Number");
        }else{
            System.out.println(n+" Is not Prime Number");
        }
        }
        

      sc.close(); 
    }
}
