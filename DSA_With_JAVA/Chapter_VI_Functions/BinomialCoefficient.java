public class BinomialCoefficient{
    
    public static int factorial(int a){
        int fact=1;
        for(int i=a;i>=1;i--){
            fact*=i;

        }
        return fact;
    }
     public static int BinomialCoefficient(int n , int r){
         
         int nCr=(factorial(n)/(factorial(r)*(factorial(n-r))));
         return nCr;
    }
    public static void main(String[] args) {
        int n=5;
        int r=2;
        int result=BinomialCoefficient(n,r);
        System.out.println("Binomial Coefficient of "+n+"C"+r+" is = "+result);
        
    }
}