import java.util.Scanner;
public class Area_of_Circle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        double radius=sc.nextDouble();

        double pi=3.14;

        System.out.println("Area of Circle = "+ (pi*radius*radius));

        sc.close();

        
    }
}
