public class DiagonalSum {
    public static void diagonalSum(int matrix[][]){
        int sum1=0;
        int sum2=0;
        
        for(int i=0;i<matrix.length;i++){
            sum1+=matrix[i][i];
        }
        for(int i=0,j=matrix[0].length-1;i<matrix.length&&j>=0;i++,j--){
            sum2+=matrix[i][j];
        }
        if(((matrix.length-1)/2)%2==0){
        System.out.println("Sum is "+(sum1+sum2));
        }
        else{
            System.out.println("Sum is "+((sum1+sum2)-matrix[matrix.length/2][matrix.length/2]));
        }
    }
    
    public static void main(String args[]){
        int matrix[][]={{1,2,3},{5,6,7},{9,10,11}};
        diagonalSum(matrix);
    }
    
}
