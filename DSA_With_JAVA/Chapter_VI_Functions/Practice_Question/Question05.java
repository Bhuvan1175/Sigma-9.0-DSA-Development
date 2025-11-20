public class Question05{
   public static int SumDigit(int Number){
    int sum=0;
    while(Number>0){
        int lastDigit=Number%10;
        sum=sum+lastDigit;
        Number/=10;
    }
    return sum;
   }
    public static void main(String[] args) {
        System.out.println("Sum = "+SumDigit(555));
    }
}