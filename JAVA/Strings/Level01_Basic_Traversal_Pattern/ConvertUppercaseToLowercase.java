//  Convert uppercase to lowercase without inbuilt

public class ConvertUppercaseToLowercase{
    public static void main(String[] args) {
        String str="HELLO BHUVAN";
        String Result="";
        for(char ch:str.toCharArray()){
            if(ch>='A' && ch<='Z'){
                ch=(char)(ch+32);
                Result+=ch;
            }
        }
         System.out.println("Original String: " + str);
        System.out.println("Uppercase String: " + Result);
    }
}