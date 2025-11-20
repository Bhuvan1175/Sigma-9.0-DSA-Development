import java.util.Scanner;

public class Question02 {

    // Method to check even
    public static boolean isEven(int number) {
        return number % 2 == 0;  // Clean return
    }
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        if (isEven(num)) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is ODD");
        }

  
    }
}
