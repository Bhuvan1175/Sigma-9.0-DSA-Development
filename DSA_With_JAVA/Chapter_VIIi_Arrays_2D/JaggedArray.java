import java.util.Scanner;
public class JaggedArray{
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Row Count");
        int n=sc.nextInt();
        
        int matrix[][]=new int[n][];  // Sirf rows define kiye
        
        // Har row ke liye column count input lo
        for(int i=0;i<n;i++){
            System.out.println("Enter Column Count for Row " + (i+1));
            int cols=sc.nextInt();
            matrix[i]=new int[cols];  // Is row ke liye columns banao
        }
        
        // Values input karo
        System.out.println("Enter values:");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        
        // Print karo
        System.out.println("Jagged Array:");
        for(int x[]:matrix){
            for(int y:x){
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }
}
 