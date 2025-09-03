package DSA_With_JAVA.Chapter_IV_Loops;

public class SumNNatural {
    public static void main(String[] args) {
        int n=5;
        int i=1;
        int sum=0;
        while(i<=n){
            sum+=i;
            i++;
        }
        System.out.println("Sum of N Natural Number is : "+sum);
    }
}
