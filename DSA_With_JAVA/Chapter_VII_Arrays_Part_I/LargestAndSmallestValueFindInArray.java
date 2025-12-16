public class LargestAndSmallestValueFindInArray{
    public static int getLargestAndSmallest(int numbers[]){
        int Largest=Integer.MIN_VALUE;
        int Smallest=Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if(Largest< numbers[i]){
                Largest=numbers[i];
            }
                if(Smallest > numbers[i]){
                Smallest=numbers[i];
            }
        }
        System.out.println("Smallest From Array "+Smallest);
        return Largest;
       
    }
    public static void main(String[] args) {
        int numbers[]={1,3,4,6,7,9,0};
        System.out.println("Largest From Array "+getLargestAndSmallest(numbers));
    }
}