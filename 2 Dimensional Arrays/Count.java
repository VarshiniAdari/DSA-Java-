public class Count {
    public static void count(int array[][],int value){
        int count=0;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[0].length;j++){
                if(array[i][j]==value){
                    count++;
                }
            }
        }
        System.out.println(count+" is the count of "+value);
        return;
    }
    public static void main(String args[]){
        int[][] array = { {4,7,8},{8,8,7} };
        int value=8;
        count(array,value);
    }
    
}
