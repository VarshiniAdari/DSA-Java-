public class OccurrenceIndx {
    public static void main(String args[]){
        int arr[]={3, 2, 4, 5, 6, 2, 7, 2, 2};
        int key=2;
        printIndx(arr,0,key);
    }
    public static void printIndx(int arr[], int indx, int key){
        if(indx==arr.length){
            return;
        }
        if(arr[indx]==key){
            System.out.println(indx);
        }
        printIndx(arr, indx+1, key);
    }
}
