// Question 03 : Write a Java program to take the cost of a pencil, pen, and eraser as float inputs from the user and print the total cost, and also display the final amount after adding 18% GST.
import java.util.Scanner;
public class Question03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float Pencil= sc.nextFloat();
        System.out.println("First Number : " + Pencil);

        float pen = sc.nextFloat();
        System.out.println("Second Number : " + pen);

        float erarse = sc.nextFloat();
        System.out.println("Third Number : " + erarse);

        float totalCost=Pencil+pen+erarse;

        double totalCostWithGst=totalCost+(totalCost*0.18);

        System.out.println("Total cost : "+totalCost);
        System.out.println("Total cost with 18% GST : "+totalCostWithGst);
        sc.close();
    }
}
