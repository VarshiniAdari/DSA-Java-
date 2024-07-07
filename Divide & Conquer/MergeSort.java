public class MergeSort{
    public static void main(String[] args){
        int arr[]={6,3,9,5,2,8};
        mergeSort(arr, 0, arr.length-1);
        printArr(arr);
    }
    public static void mergeSort(int arr[],int si,int ei){
        //base case
        if(si==ei){//important in lecture it was si>=ei. I do not know why?
            return;
        }
        //work of the function--dividing
        int mid=si+(ei-si)/2;
        mergeSort(arr,si,mid);
        mergeSort(arr,mid+1,ei);
        merge(arr,si,mid,ei);
    }
    public static void merge(int arr[],int si, int mid, int ei){
        int temp[]=new int[ei-si+1];
        //sorting 
        int i=si;//left iterator
        int j=mid+1;//right iterator
        int k=0;//temporary array index
        while(i<=mid&&j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
        k++;
        }
        //for left part left over part
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        for(i=si,k=0;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }

    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        return;
    }
}