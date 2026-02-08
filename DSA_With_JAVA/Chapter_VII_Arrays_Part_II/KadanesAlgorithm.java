public class KadanesAlgorithm{
    public static void main(String[] args) {
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        KadanesArray(arr);
    }
    public static void KadanesArray(int arr[]){
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0;i<arr.length;i++){
            cs+=arr[i];
            ms=Math.max(ms, cs);
            if(cs<0){
                cs=0;
            }
        }
        System.out.println("Maximum Subarray "+ms);
    }
}