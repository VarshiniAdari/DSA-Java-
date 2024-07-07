public class BubbleSort {
    public static void bubblesort(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }
    }
    public static void main(String args[]){
        int arr[]={5,4,3,2,1,0};
        bubblesort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
    
}
