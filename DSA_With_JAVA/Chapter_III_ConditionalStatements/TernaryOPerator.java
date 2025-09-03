package DSA_With_JAVA.Chapter_III_ConditionalStatements;

public class TernaryOPerator {
    public static void main(String[] args) {
        int number=4;
        String type = (number%2==0) ? "even" :"odd";
        System.out.println(type);
    }
}


// Ternary Operator
// variable=conduition?statement1:statement2;
// boolean larger=(5>3)?5:3; it gives 5