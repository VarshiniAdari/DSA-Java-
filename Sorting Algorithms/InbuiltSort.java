import java.util.Arrays;
import java.util.Collections;
public class InbuiltSort {
    public static void inbuiltsort(int arr[]){
        Arrays.sort(arr);
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void printArr(Integer arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void reverseSort(Integer arr[]){
        Arrays.sort(arr,Collections.reverseOrder());
    }
    public static void main(String args[]){
        int arr[]={5,4,1,3,2};
        Integer arr2[]={5,4,1,3,2};
        int arr3[]={1,6,3,8,4,0};
        inbuiltsort(arr);
        printArr(arr);
        reverseSort(arr2);
        printArr(arr2);
        Arrays.sort(arr3,0,3);
        printArr(arr3);
    }
    
}
