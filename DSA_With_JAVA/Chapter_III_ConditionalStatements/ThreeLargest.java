package DSA_With_JAVA.Chapter_III_ConditionalStatements;

public class ThreeLargest {
    public static void main(String[] args) {
        int a=1,b=3,c=5;

        if(a>b && a>c){
            System.out.println("a is Largest");
        }else if(b>a && b>c){
            System.out.println("b is Largest");
        }else{
            System.out.println("c is Largest");
        }
    }
}
