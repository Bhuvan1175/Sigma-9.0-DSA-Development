public class ReverseArray{
    public static void ReverseArray(int numbers[]) {
        int start=0,end=numbers.length-1;
        while(start<end){
            int temp=numbers[end];
            numbers[end]=numbers[start];
            numbers[start]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        ReverseArray(numbers);
        for(int num:numbers){
            System.out.print(num+" ");
        }
    }
}