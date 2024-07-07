import java.util.ArrayList;
public class MaxAL {
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(3);
        list.add(6);
        list.add(81);
        list.add(8);
        list.add(1);
        list.add(18);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>max){
                max=list.get(i);
            }
            // max=Math.max(max,list.get(i));
        }
        System.out.println("Maximum value in the list is "+max);
    }
    
}
