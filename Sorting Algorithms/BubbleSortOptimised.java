import java.util.*;
public class BubbleSortOptimised{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt(); 
        }
        bSortOpt(arr);
        printArr(arr);
        sc.close();
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        return;
    }
    public static void bSortOpt(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            boolean swap=false;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int tmp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=tmp;
                    swap=true;
                }
            }
            if(swap==false){
                break;
            }
        }
        return;
    }
}