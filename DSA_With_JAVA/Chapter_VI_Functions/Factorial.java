public class Factorial{
    
    public static int factorial(int a){
        int fact=1;
        for(int i=a;i>=1;i--){
            fact*=i;

        }
        return fact;
    }
    public static void main(String[] args) {
        int a=5;
        int result=factorial(a);
        System.out.println("Factorial Of "+a+" = "+result);
    }
}