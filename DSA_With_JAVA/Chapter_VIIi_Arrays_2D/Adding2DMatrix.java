import java.util.*;
public class Adding2DMatrix{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Rows Count");
        int n=sc.nextInt();
        System.out.println("Enter Columns Count");
        int m=sc.nextInt();
        int matrix1[][]=new int[n][m];
        int matrix2[][]=new int[n][m];
        AddingMatrix(matrix1,matrix2,n,m);
    }
    public static void AddingMatrix(int matrix1[][],int matrix2[][],int n, int m){
        int c[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                c[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        }
        for(int x[]:c){
            for(int y:x){
                System.out.print(y+"");
            }
            System.out.println("");
        }
    }
}