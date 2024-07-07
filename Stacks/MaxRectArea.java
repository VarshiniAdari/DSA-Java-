import java.util.Stack;
public class MaxRectArea {
    public static int maxArea(int[] height){
        Stack<Integer> s1=new Stack<>();
        Stack<Integer> s2=new Stack<>();
        int n=height.length;
        int[] nsl=new int[n];
        int[] nsr=new int[n];
        //next smaller left
        for(int i=0;i<n;i++){
            while(!s1.isEmpty()&&height[i]<=height[s1.peek()]){
                s1.pop();
            }
            if(s1.isEmpty()){
                nsl[i]=-1;
            }
            else{
                nsl[i]=s1.peek();
            } 
            s1.push(i);
        }
        for(int i=0;i<n;i++){
            System.out.println(nsl[i]);
        }
        //next smaller right
        //can use s= new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!s2.isEmpty()&&height[i]<=height[s2.peek()]){
                s2.pop();
            }
            if(s2.isEmpty()){
                nsr[i]=n;
            }
            else{
                nsr[i]=s2.peek();
            }
            s2.push(i);
        }
        for(int i=0;i<n;i++){
            System.out.println(nsr[i]);
        }
        //calc max area
        int maxAr=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int wdth=nsr[i]-nsl[i]-1;
            int area=height[i]*wdth;
            maxAr=Math.max(maxAr, area);
        }
        return maxAr;
    }
    public static void main(String[] args){
        int[] height={2,1,5,6,2,3};
        System.out.println(maxArea(height));
    }
}
