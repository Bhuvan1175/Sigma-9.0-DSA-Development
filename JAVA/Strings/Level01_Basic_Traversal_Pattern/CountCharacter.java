// Count Total Character without using length();

public class CountCharacter{
    public static void main(String[] args) {
        int count=0;
        String str="Hello Bhuvan";
        for(char ch:str.toCharArray()){
            count++;
            //System.out.println("Ch"+ch);
        }
        System.out.println("Length of "+str+" is : "+count);
    }
}