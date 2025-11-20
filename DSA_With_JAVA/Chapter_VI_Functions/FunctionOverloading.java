public class FunctionOverloading{
    
    public static int sum(int a,int b){
  
        return a+b;
    }
    public static int sum(int a,int b,int c){
  
        return a+b+c;
    }
    public static void main(String[] args) {
        int a=5;
         int b=5;
         int c=10;
         int result1=sum(a, b);
          int result2=sum(a, b,c);
          System.out.println("Result 1 = "+result1);
              System.out.println("Result 2 = "+result2);
    }
}