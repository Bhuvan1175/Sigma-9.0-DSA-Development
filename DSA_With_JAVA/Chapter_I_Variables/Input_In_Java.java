import java.util.Scanner;
public class Input_In_Java {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String input=sc.next();
        System.out.println("My Input "+input);
        sc.close();
    }
}

/*
    Input in java

 * next            : Take String But till Space
 * nextLine        : Full String
 * nextInt         : Integer Value
 * nextByte
 * nextFloat       : Floating Value
 * nextDouble
 * nextBoolean
 * nextShort
 * nextLong
 * 
 */