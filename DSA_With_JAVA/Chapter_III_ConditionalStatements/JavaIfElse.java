package DSA_With_JAVA.Chapter_III_ConditionalStatements;

public class JavaIfElse {
    public static void main(String[] args) {
        int age=15;
        if(age>18){
            System.out.println("Adult : Driver : Vote");
        }
        if(age>13 && age<18){
            System.out.println("Teenager");
        }else{
            System.out.println("Not Adult");
        }
    }
}
