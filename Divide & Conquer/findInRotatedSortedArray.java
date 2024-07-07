public class findInRotatedSortedArray {
    public static void main(String[]args){
        int arr[]={4,5,6,7,0,1,2};
        int trgt=0; //output=4
        int trgtIndx=searchAlgo(arr,0,arr.length-1,trgt);
        System.out.println(trgtIndx);
    }
    public static int searchAlgo(int arr[],int si, int ei, int trgt){
        int mid=si+(ei-si)/2;
        //Base case
        if(arr[mid]==trgt){
            return mid;
        }
        //mid on L1
        if(arr[si]<=arr[mid]){
            //case a: L1 on left
            if(trgt>=arr[si]&&trgt<=arr[mid]){
                return searchAlgo(arr,si,mid-1,trgt);
            }
            //case b: right of mid, may be on L1 or L2
            else{
                return searchAlgo(arr, mid+1, ei, trgt);
            }
        }
        //mid on L2
        else{
            //case a: Target on L1 right
            if(trgt>=arr[mid]&&trgt<=arr[ei]){
                return searchAlgo(arr, mid+1, ei, trgt);
            }
            //case b: Target to left of mid, may on L1 or L2
            else{
                return searchAlgo(arr, si, mid-1, trgt);
            }
        }

    }
    
}
