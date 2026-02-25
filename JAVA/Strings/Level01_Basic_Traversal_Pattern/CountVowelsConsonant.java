// Count vowels and consonants


public class CountVowelsConsonant{
    public static void main(String[] args) {
        int vowels=0,consonants=0;
        String str="hey i  am Bhuvan , I am a Software Developer . Currently in Nagpur!";
        for(char ch:str.toCharArray()){
            ch=Character.toLowerCase(ch);
            if(ch>='a' && ch<='z'){
                if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                    //System.out.println("Vowels "+vowels+" Character : "+ch);
                    vowels++;
                }else{
                    //System.out.println("Consonant "+consonants+" Character : "+ch);
                    consonants++;
                }
            }
        }
        System.out.println("Vowels : "+vowels);
        System.out.println("Consonant : "+consonants);
    }
}