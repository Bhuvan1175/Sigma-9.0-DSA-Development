package DSA_With_JAVA.Chapter_IV_Loops;

public class Continue {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            if(i==3){
                continue;
            }
            System.out.println(i);
        }
    }
}
