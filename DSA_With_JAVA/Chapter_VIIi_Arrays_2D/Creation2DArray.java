import java.util.Scanner;
public class Creation2DArray{
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Row Count");
        int n=sc.nextInt();
           System.out.println("Enter Column Count");
        int m=sc.nextInt();
        int matrix[][]=new int[n][m];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        for(int x[]:matrix){
            for(int y:x){
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }
}