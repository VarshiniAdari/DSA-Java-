public class SelectionSort {
    public static void selectionsort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minIndex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
                int tmp=arr[i];
                arr[i]=arr[minIndex];
                arr[minIndex]=tmp;
                
            }
        }
    public static void main(String args[]){
        int arr[]={0,5,4,3,2,1};
        selectionsort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
