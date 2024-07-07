import java.util.ArrayList;
public class PairSumBrute {
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int targetSum=5;
        System.out.println(isSumExists(list,targetSum));
        System.out.println(isSumExists(list,50));
    }
    public static boolean isSumExists(ArrayList<Integer> list, int targetSum){
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)+list.get(j)==targetSum){
                    return true;
                }
            }
        }
        return false;
    }
}
