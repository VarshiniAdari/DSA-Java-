public class SubArray {
    public static void printSubArray(int numbers[]){
        int i;
        for( i=0 ; i<numbers.length;i++){
            
            for(int j=i;j<numbers.length;j++){
                System.out.print("(");
                for(int k=i;k<=j;k++){
                    System.out.print(numbers[k]+",");
                }
                System.out.print(") ");
            }
            System.out.println();
        }
        return;
    }
    public static void main(String args[]){
        int numbers[]={2,4,6,8,10};
        printSubArray(numbers);
    }
}
