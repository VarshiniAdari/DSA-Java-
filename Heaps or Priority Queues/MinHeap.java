import java.util.*;
public class MinHeap {
    static class Heap{
        ArrayList<Integer> arr=new ArrayList<>();
        public void add(int data){
            //add
            arr.add(data);
            int x=arr.size()-1;
            int par=(x-1)/2;
            while(arr.get(x)<arr.get(par)){
                int tmp=arr.get(x);
                arr.set(x,arr.get(par));
                arr.set(par,tmp);
                x=par;
                par=(x-1)/2;
            }
        }
        public int peek(){
            return arr.get(0);
        }
        public int remove(){
            int data=arr.get(0);
            //Swap
            int tmp=arr.get(0);
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1,tmp);
            //remove last index
            arr.remove(arr.size()-1);

            //heapify
            heapify(0);
            return data;
        }
        public void heapify(int i){
            int left=2*i+1;
            int right=2*i+2;
            int minIdx=i;
            if(left<arr.size()&&arr.get(left)<arr.get(minIdx)){
                minIdx=left;
            }
            if(right<arr.size()-1&&arr.get(right)<arr.get(minIdx)){
                minIdx=right;
            }
            if(minIdx!=i){
                //Swap
                int tmp=arr.get(i);
                arr.set(i,arr.get(minIdx));
                arr.set(minIdx,tmp);
                heapify(minIdx);
            }
        }
        public boolean isEmpty(){
            return arr.size()==0;
        }
    }
    public static void main(String[] args) {
        Heap h=new Heap();
        h.add(2);
        h.add(3);
        h.add(4);
        h.add(5);
        h.add(10);
        h.add(6);
        while(!h.isEmpty()){
            System.out.println(h.peek());
            h.remove();
        }
        //output just like priority queue
    }
}
