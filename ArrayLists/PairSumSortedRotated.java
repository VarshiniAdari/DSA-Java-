import java.util.ArrayList;
public class PairSumSortedRotated {
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target=16;
        // System.out.println(isSumExists(list, target));
        // System.out.println(isSumExists(list, 50));
        System.out.println(isSumExistsModArthmtc(list, target));
        System.out.println(isSumExistsModArthmtc(list, 50));
    }
    public static boolean isSumExistsModArthmtc(ArrayList<Integer> list, int target){
        //find pivot or break point bp
        int bp=-1;
        int n=list.size();
        for(int i=0;i<n;i++){
            if(list.get(i)>list.get(i+1)){
                bp=i;
                break;
            }
        }
        int lp=bp+1;
        int rp=bp;
        while(lp!=rp){
            int sum=list.get(lp)+list.get(rp);
            //case1
            if(sum==target){
                return true;
            }
            //case2
            if(sum<target){
                lp=(lp+1)%n;
            }
            //case3
            if(sum>target){
                rp=(n+rp-1)%n;
            }
        }
        return false;
    }
    public static boolean isSumExists(ArrayList<Integer> list, int target){
        int n=list.size();
        int pvt=0;
        for(int i=0;i<n;i++){
            if(list.get(i)>list.get(i+1)){
                pvt=i;
                break;
            }
        }
        int lp=pvt+1;
        int rp=pvt;
        int sum=0;
        while(lp!=rp){ // lp<rp will not work
            sum=list.get(lp)+list.get(rp);
            if(sum==target){
                return true;
            }
            else if(sum<target){
                if(lp!=n-1){
                    lp++;
                }
                else if(lp==n-1){
                    lp=0;
                }
            }
            else{
                if(rp==0){
                    rp=n-1;
                }
                else{
                    rp--;
                }
            }
        }
        return false;
    }

}