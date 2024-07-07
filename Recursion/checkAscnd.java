public class checkAscnd{
    public static void main(String[]args){
        int arr[]={1,2,3,5,4};
        System.out.println(isSorted(arr,0));
    }
    public static boolean isSorted(int arr[],int i){//ascending
        if(arr[i]>arr[i+1]){
            return false;
        }
        if(i+1==arr.length-1){
            return true;
        }
        return isSorted(arr,i+1);
    }
    
}