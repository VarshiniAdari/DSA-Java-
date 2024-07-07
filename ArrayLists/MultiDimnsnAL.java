import java.util.ArrayList;
public class MultiDimnsnAL {
    public static void main(String[] args){
        //Creating a multi-dimensional ArrayList
        ArrayList<ArrayList<Integer>> mainList=new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        mainList.add(list1);
        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(2);
        list2.add(4);
        list2.add(6);
        list2.add(8);
        list2.add(10);
        mainList.add(list2);
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(3);
        list3.add(6);
        list3.add(9);
        list3.add(12);
        list3.add(15);
        mainList.add(list3);
        //Print 2D ArrayList
        for(int i=0;i<mainList.size();i++){
            ArrayList<Integer> currList=mainList.get(i);
            //print current list
            // for(int j=0;j<currList.size();j++){
            //     System.out.print(currList.get(j)+" ");
            // }
            // System.out.println();
            System.out.println(currList);
        }
        //Print 2D directly
        System.out.println(mainList);
        //To read 
        ArrayList<ArrayList<Integer>> mainList2=new ArrayList<>();
        ArrayList<Integer> list4=new ArrayList<>();
        ArrayList<Integer> list5=new ArrayList<>();
        ArrayList<Integer> list6=new ArrayList<>();
        for(int i=1;i<=3;i++){
            list4.add(i*1);
            list5.add(i*2);
            list6.add(i*3);
        }
        mainList2.add(list4);
        mainList2.add(list5);
        mainList2.add(list6);
        System.out.println(mainList2);
    }
    
}
