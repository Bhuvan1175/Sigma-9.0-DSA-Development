// Question2:Finish the following code so that it prints You have a fever if your temperature is above 100 and otherwise prints You don't have a fever
package DSA_With_JAVA.Chapter_III_ConditionalStatements.Practice_Questions;

public class Question02 {
    public static void main(String[] args) {
        double temp=103.5;
        String result=(temp>100)?"You Have Fever":"You Dont Have a Fever";
        System.out.println(result);
    }
}
