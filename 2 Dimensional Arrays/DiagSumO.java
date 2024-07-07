public class DiagSumO {//0 means optimised code
    public static void printDiagSum(int matrix[][]){
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            
                sum+=matrix[i][i];
                if(i!=matrix.length-i-1)
                sum+=matrix[i][matrix.length-i-1];
        }
        System.out.println(sum);
    }
    public static void main(String args[]){
        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
        printDiagSum(matrix);
    }
    
}
