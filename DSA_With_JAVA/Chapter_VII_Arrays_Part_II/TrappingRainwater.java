public class TrappingRainwater{
   
    public static void TrappedWater(int arr[]){
          int waterLevel;
        int trappedWater=0;
        // Left max Boundary Array
        int leftArrayBound[]=new int[arr.length];
        leftArrayBound[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            leftArrayBound[i]=Math.max(leftArrayBound[i-1], arr[i]);
        }

        // rightArrayBound Array
        int rightArrayBound[]=new int[arr.length];
        rightArrayBound[arr.length-1]=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            rightArrayBound[i]=Math.max(rightArrayBound[i+1], arr[i]);
        }
       
        // Loop
        for(int i=0;i<arr.length;i++){
            // water level find
            waterLevel=Math.min(leftArrayBound[i], rightArrayBound[i]);
            // trapper water
            trappedWater+=waterLevel-arr[i];
        }
        System.out.println("Trapped Water is : "+trappedWater);
    }
     public static void main(String[] args) {
        int arr[]={1,8,6,2,5,4,8,3,7};
        TrappedWater(arr);
    }
}