//   Convert lowercase to uppercase without inbuilt method

public class ConvertLowercaseToUppercase{
    public static void main(String[] args) {
        String str="hello bhuvan";
        String Result="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='a'&& ch<='z'){
                ch=(char)(ch-32);
            }
            Result+=ch;
        }
          System.out.println("Original String: " + str);
        System.out.println("Uppercase String: " + Result);
    }

} 