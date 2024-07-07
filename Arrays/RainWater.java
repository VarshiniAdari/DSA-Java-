public class RainWater {
    public static void trappedWater(int height[]){
        int leftMax[]=new int[height.length];
        int rightMax[]=new int[height.length];
        leftMax[0]=height[0];
        rightMax[height.length-1]=height[height.length-1];
        for(int i=1;i<leftMax.length;i++){
            leftMax[i]=Math.max(leftMax[i-1],height[i]);
            
        }
        
        for(int i=height.length-2;i>=0;i--){
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
           
        }
        int finalVol=0;
        for(int i=0;i<height.length;i++){
            int Vol=(Math.min(leftMax[i],rightMax[i]))-height[i];           
            finalVol+=Vol;
            
        }
        System.out.println("Volume of the final volume trapper is: "+finalVol);
    }
    public static void main(String args[]){
        int height[]={4,2,0,6,2,3,5};
        trappedWater(height);
    }
    
}
