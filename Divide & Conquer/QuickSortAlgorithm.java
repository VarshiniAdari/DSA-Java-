public class QuickSortAlgorithm {
    public static void main(String[]args){
        int arr[]={6,3,9,8,2,5};
        quickSort(arr,0,arr.length-1);
        printArr(arr);
    }
    public static void quickSort(int arr[],int si, int ei){
        if(si>=ei){
            return;
        }
        int pivIndx=partition(arr,si,ei);
        quickSort(arr,si,pivIndx-1);
        quickSort(arr, pivIndx+1, ei);
    }
    public static int partition(int arr[],int si,int ei){
        int pivElmnt=arr[ei];
        int i=si-1;
        for(int j=si;j<=ei;j++){
            if(arr[j] < pivElmnt){
                //swap
                i++;
                int tmp=arr[i];
                arr[i]=arr[j];
                arr[j]=tmp;
            }
        }
        i++;
        //swap pivot element to correct position
        arr[ei]=arr[i];
        arr[i]=pivElmnt;
        // System.out.println("I VALUE"+i);
        return i;
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        return;
    }
    
}
