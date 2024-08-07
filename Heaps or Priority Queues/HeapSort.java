public class HeapSort {
    public static void heapify(int arr[], int i,int n){
        int left=2*i+1;
        int right=2*i+2;
        int maxIdx=i;
        if(left<n&&arr[left]>arr[maxIdx]){
            maxIdx=left;
        }
        if(right<n&&arr[right]>arr[maxIdx]){
            maxIdx=right;
        }
        if(maxIdx!=i){
            //swap
            int tmp=arr[i];
            arr[i]=arr[maxIdx];
            arr[maxIdx]=tmp;
            heapify(arr, maxIdx, n);
        }
    }
    public static void heapSort(int arr[]){
        //step-1 build maxHeap
        int n=arr.length;
        for(int i=n/2;i>=0;i--){
            heapify(arr,i,n);
        }
        //step-2 push largest at end
        for(int i=n-1;i>0;i--){
            //swap largest-first and last element
            int tmp=arr[0];
            arr[0]=arr[i];
            arr[i]=tmp;
            heapify(arr,0,i);
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,3,5,0};
        heapSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"   ");
        }
    }
}