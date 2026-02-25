// Print each character with index. Without length();

public class PrintEachCharacter{
    public static void main(String[] args) {
        int index=0;
        String str="Hello Bhuvan";
        for(char ch:str.toCharArray()){
            System.out.println("Index : "+index+" Character : "+ch);
            index++;
        }
    }
}

// If allow Length(); just used str.charAt() in normal loop