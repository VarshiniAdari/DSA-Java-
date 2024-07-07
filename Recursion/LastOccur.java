public class LastOccur {
    public static void main(String [] args){
        int arr[]={1,4,2,5,6,7,8,6,5,9,0,3};
        int key=6;
        System.out.println(recurSearchLast(arr,0,key));
    }
    public static int recurSearchLast(int arr[],int i,int key){
        if(i==arr.length){
            return -1;
        }
        int isFound=recurSearchLast(arr, i+1, key);
        if(arr[i]==key&&isFound==-1){
            isFound=i;
        }
        return isFound;
    }
}
