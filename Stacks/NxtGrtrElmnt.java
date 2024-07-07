import java.util.Stack;
public class NxtGrtrElmnt{
    public static void formNxtGrtr(int[] arr, int[] nxtGrtr){
        Stack<Integer> s=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty()&&arr[i]>=arr[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                nxtGrtr[i]=-1;
            }
            else{
                nxtGrtr[i]=arr[s.peek()];
            }
            s.push(i);
        }
    }
    public static void main(String[] args){
        int[] arr={8,9,3,0,2};
        int[] nxtGrtr=new int[arr.length];
        formNxtGrtr(arr,nxtGrtr);
        for(int i=0;i<arr.length;i++){
            System.out.print(nxtGrtr[i]+" ");
        }
        System.out.println();
    }
}