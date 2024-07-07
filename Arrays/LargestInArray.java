
public class LargestInArray {
    public static void main(String args[]){
        int largest = Integer.MIN_VALUE;
        int nmbrs[]={1,2,3,4,5,6,7,8,9,0};
        for(int i=0;i<nmbrs.length;i++){
            if(nmbrs[i]>largest){
                largest=nmbrs[i];
            }
        }
        System.out.println("The largest number in the array is "+largest);
    }
    
}
