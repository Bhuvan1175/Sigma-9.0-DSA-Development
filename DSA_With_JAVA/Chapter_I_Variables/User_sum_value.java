import java.util.Scanner;
public class User_sum_value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a=sc.nextInt();

        System.out.println("First Value a = "+a);

        int b=sc.nextInt();

        System.out.println("Second Value b = "+b);

        System.out.println("Sum of "+a+ " + " +b+ " is = "+(a+b) );

        sc.close();
    }
}
