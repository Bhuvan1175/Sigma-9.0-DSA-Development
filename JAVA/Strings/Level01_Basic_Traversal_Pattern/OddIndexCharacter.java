// Print characters at odd index

public class OddIndexCharacter{
    public static void main(String[] args) {
        String str="Hello Bhuvan";
        int index=0;
        for(char ch:str.toCharArray()){
            if(index%2!=0){
                System.out.println("Index "+index+" Character "+ch);
                
            }
            index++;
        }
    }
}