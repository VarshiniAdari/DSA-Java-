import java.util.ArrayList;
public class Container2Pointer {
    public static void main(String[] args){
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(storedWater(height)+" is the maximum water container");
    }
    public static int storedWater(ArrayList<Integer> height){
        int currWater=Integer.MIN_VALUE;
        int maxWater=0;
        int lp=0;
        int rp=height.size()-1;
        while(lp<rp){
            int ht=Math.min(height.get(lp),height.get(rp));
            int wdth=rp-lp;
            currWater=ht*wdth;
            maxWater=Math.max(maxWater, currWater);
            if(height.get(lp)<height.get(rp)){
                lp++;
            }
            else{
                rp--;
            }
        }
        return maxWater;
    }

}
