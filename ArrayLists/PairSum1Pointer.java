import java.util.ArrayList;
public class PairSum1Pointer {
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int target =5;
        System.out.println(isPairSumExists(list,target));
        System.out.println(isPairSumExists(list,50));
    }
    public static boolean isPairSumExists(ArrayList<Integer> list, int target){
        int lp=0;
        int rp=list.size()-1;
        while(lp<rp){
            int sum=list.get(lp)+list.get(rp);
            if(sum==target){
                return true;
            }
            else if(sum<target){
                lp++;
            }
            else{
                rp--;
            }
        }
        return false;

    }
}