package DSA_With_JAVA.Chapter_III_ConditionalStatements;

public class ElseIfStatement {
    public static void main(String[] args) {
        int age=13;
        if(age>=18){
            System.out.println("adult");
        }else if(age>=13 && age<18){
            System.out.println("Teenager");
        }else{
            System.out.println("not teenager");
        }
    }
}
