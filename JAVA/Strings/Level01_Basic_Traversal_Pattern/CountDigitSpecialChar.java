// Count digits and special characters

public class CountDigitSpecialChar{
    public static void main(String[] args) {
        // Using Character Class Method
        int digit=0,special=0;
        String str="Hellow Bhuvan123@#";
        for(char ch:str.toCharArray()){
            if(Character.isDigit(ch)){
                System.out.println("Character Digit "+ch);
                digit++;
            }else if (!Character.isLetter(ch)&&!Character.isDigit(ch)&&!Character.isWhitespace(ch)) {
                System.out.println("Character Special Char "+ch);
                special++;
            }
        }
        System.out.println("Digits "+digit);
        System.out.println("Special "+special);
    }
}