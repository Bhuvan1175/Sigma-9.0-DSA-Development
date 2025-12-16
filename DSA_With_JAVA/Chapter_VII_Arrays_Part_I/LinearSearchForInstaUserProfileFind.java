
public class LinearSearchForInstaUserProfileFind {

public static int LinearSearch(String instagramUsers[],String findKey){
    for(int i=0;i<instagramUsers.length;i++){
        if(instagramUsers[i].equals(findKey)){
            return i;
        }
    }
    return -1;
}
    public static void main(String[] args) {
        String[] instgramUsers = {"akshay.codes","rohan.diaries","neha.vibes","amit.journey","priya.thoughts","karan.fitlife","simran.creates","rahul.dev","ananya.art","vikas.mindset","pooja.reflect","sahil.explore"};
        String findKey ="priya.thoughts";
        int index=LinearSearch(instgramUsers, findKey);

        if(index== -1){
            System.out.println("USER NOT FOUND");
        }else{
            System.out.println(findKey+" is at "+index+"th Position in Array!");
        }
    }
}
