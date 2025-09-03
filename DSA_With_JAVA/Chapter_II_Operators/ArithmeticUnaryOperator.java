package DSA_With_JAVA.Chapter_II_Operators;

public class ArithmeticUnaryOperator {
   public static void main(String[] args) {
     int A=10;
    int B=++A;
    
    System.out.println(A);
    System.out.println(B);

     int c=10;
    int d=c++;
    
    System.out.println(c);
    System.out.println(d);
   }
     
}


// Pre Increment 
// ++a
// value change first and then value used 

// Post Increment 
// a++ 
// value used and then change

// same of pre and post Decrement
// --a & a-- 