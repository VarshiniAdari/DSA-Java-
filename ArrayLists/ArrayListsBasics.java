import java.util.ArrayList;
public class ArrayListsBasics{
    public static void main(String[] args){
        ArrayList<Integer> list1=new ArrayList<>();
        // ArrayList<String> list2=new ArrayList<>();
        // ArrayList<Boolean> list3=new ArrayList<>();
        //Add element
        list1.add(1);//O(1)
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        System.out.println(list1);
        // Get element-O(1)
        int element=list1.get(2); //list1.get(index)
        System.out.println(element);
        //Delete element-O(n)-linear time complexity
        list1.remove(2);
        System.out.println(list1);
        //Set element=O(n)-time complexity
        list1.set(2,10);//list1.set(index,newElemnt)
        System.out.println(list1);
        //Search an elemnt-contains-time complexity-O(n)
        System.out.println(list1.contains(1));
        System.out.println(list1.contains(100));
        //method 2 to add-will replace an element in range
        list1.add(1,10);
        System.out.println(list1);
        //Size of arrayList
        System.out.println(list1.size());
        //Print arrayList
        for(int i=0;i<list1.size();i++){
            System.out.println(list1.get(i));
        }
    }
}