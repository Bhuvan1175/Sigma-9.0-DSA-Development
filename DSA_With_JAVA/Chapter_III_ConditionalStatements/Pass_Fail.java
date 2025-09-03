package DSA_With_JAVA.Chapter_III_ConditionalStatements;
import java.util.Scanner;
public class Pass_Fail {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();
        String Result=(marks>33)? "Pass":"Fail";
        System.out.println(Result);
        sc.close();
    }
}
