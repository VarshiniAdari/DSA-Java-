public class CountSort {
    public static int[] frequencyArr(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest = Math.max(largest, arr[i]);
        }
        int freq[]=new int[largest+1];
        for(int i=0;i<freq.length;i++){
            freq[arr[i]]++;
        }
        for(int i=0;i<freq.length;i++){
            System.out.println(freq[i]);
        }
        return freq;
    }
    public static void countsort(int freq[],int arr[]){
        int j=0;
        for(int i=0;i<freq.length;i++){
            while(freq[i]>0){
                arr[j]=i;
                j++;
                freq[i]--;
            }
        }
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String args[]){
        int arr[]={1,4,1,3,2,4,3,7};
        countsort( frequencyArr(arr),arr);
        System.out.println("Array sorted by counting sort");
        printArr(arr);
    }
    
}
