public class FirstOccur {
    public static void main(String[]args){
        int arr[]={1,3,2,6,4,5,7,3,0,6};
        int key=0;
        System.out.println(recurSearch(arr,0,key));
    }
    public static int recurSearch(int arr[],int i,int key){
        if(arr[i]==key){
            return i;
        }
        if(i==arr.length-1){
            return -1;
        }
        return recurSearch(arr, i+1, key);
    }
    
}
