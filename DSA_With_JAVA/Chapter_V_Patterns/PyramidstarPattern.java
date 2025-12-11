

public class PyramidstarPattern{
    public static void main(String[] args) {
        int n=4;
        int counter=1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print(i+" ");
                counter++;
            }
            System.out.println("");
        }

    }
}
