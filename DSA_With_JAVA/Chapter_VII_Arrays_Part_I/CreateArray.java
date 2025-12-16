import java.util.*;

public class CreateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Type 1: User-defined array with loop
        System.out.println("Enter size of array:");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        
        System.out.println("Enter " + size + " array elements:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        
        System.out.println("Numbers array:");
        for (int num : numbers) {  // Enhanced for loop
            System.out.print(num + " ");
        }
        System.out.println();  // New line after array
        
        // Type 2: Pre-initialized array
        String[] cities = {"Nagpur", "Mumbai", "Pune", "Bangalore"};
        
        System.out.println("Cities array:");
        for (String city : cities) {  // Enhanced for loop
            System.out.print(city + " ");
        }
        System.out.println();
        
 
    }
}