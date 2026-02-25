// Print characters at even index

public class EvenIndexCharacter{
    public static void main(String[] args) {
        String str="Hey i am bhuvan , i am an Software Developer!";
        for(int i=0;i<str.length();i++){
            if(i%2==0){
                System.out.println("Character "+str.charAt(i));
            }
        }
    }
}