public class BruteForce{

    public static int BruteForce(int arr[]){
        int ms=Integer.MIN_VALUE;
        int cs;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                cs=0;
                for(int k=i;k<=j;k++){
                    cs+=arr[k];
                    
                }
                if (ms<cs){
                    ms=cs;
                }
            }
        }
        return ms;
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        System.out.println("Maximum Subarray Sum is "+BruteForce(arr));
    }
}