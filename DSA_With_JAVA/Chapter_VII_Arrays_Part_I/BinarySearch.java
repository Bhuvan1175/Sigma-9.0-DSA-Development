public class BinarySearch{
    public static int BinarySearch(int numbers[],int findkey){
        int start=0,end=numbers.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(numbers[mid]==findkey){
                return mid;
            }if(numbers[mid]<findkey){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10,12,14};
        int findKey=10;
        System.out.println(findKey+" at "+BinarySearch(numbers,findKey)+"th Position From Array!");
    }
}