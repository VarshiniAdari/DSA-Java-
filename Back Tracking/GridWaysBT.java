public class GridWaysBT {
    public static void main(String[] args){
        int n=5;
        int m=5;
        System.out.println(GridWays(0,0,n,m));
    }
    public static int GridWays(int i,int j, int n, int m){
        //Base case
        if(i==n-1&&j==m-1){
            return 1;
        }
        if(i==n||j==m){
            return 0;
        }
        //No. of ways for right move(W1)
        int W1=GridWays(i+1,j,n,m);
        //No. of ways for down move(W2)
        int W2=GridWays(i, j+1, n, m);
        //Total no. of ways
        return W1+W2;
    }
    
}
// Time complexity-O(2^(m+n))