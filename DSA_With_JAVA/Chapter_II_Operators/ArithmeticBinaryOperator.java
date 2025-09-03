package DSA_With_JAVA.Chapter_II_Operators;
import java.util.Scanner;

public class ArithmeticBinaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User se input lena
        System.out.print("Enter value of A: ");
        int a = sc.nextInt();

        System.out.print("Enter value of B: ");
        int b = sc.nextInt();

        // Output
        System.out.println("\n--- Arithmetic Operations ---");
        System.out.println("Addition (A + B) = " + (a + b));
        System.out.println("Subtraction (A - B) = " + (a - b));
        System.out.println("Multiplication (A * B) = " + (a * b));

        // Division aur remainder handle karte waqt B != 0 check
        if (b != 0) {
            System.out.println("Division (A / B) = " + (a / b));
            System.out.println("Remainder (A % B) = " + (a % b));
        } else {
            System.out.println("Division and Remainder not possible (B = 0)");
        }

        sc.close();
    }
}

// Binary Operators: Required 2 operands (+, -, *, /, %)
// Unary Operators: Required 1 operand (++a, --a, etc.)
