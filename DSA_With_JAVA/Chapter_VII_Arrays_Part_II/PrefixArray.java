public class PrefixArray{
    public static void PrefixArraySum(int arr[]){
        int ms=Integer.MIN_VALUE;
        int cs;

        int prefixArray[]=new int[arr.length];
        prefixArray[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefixArray[i]=prefixArray[i-1]+arr[i];
        }

        for(int i=0;i<arr.length;i++){
            cs=0;
            for(int j=i;j<arr.length;j++){
                cs=i==0?prefixArray[j]:prefixArray[j]-prefixArray[i-1];
            }
            if(ms<cs){
                ms=cs;
            }
        }
        System.out.println("Maximum Sum Array sum : "+ms);
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        PrefixArraySum(arr);
    }
}