public class MinNodeDistance{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static Node lca2(Node root, int n1, int n2){
        if(root==null||root.data==n1||root.data==n2){
            return root;
        }
        Node LeftLCA=lca2(root.left,n1,n2);
        Node RightLCA=lca2(root.right,n1,n2);
        if(LeftLCA==null){
            return RightLCA;
        }
        if(RightLCA==null){
            return LeftLCA;
        }
        return root;
    }
    public static int getDist(Node root,int n){
        if(root==null){
            return -1;
        }
        if(root.data==n){
            return 0;
        }
        int left=getDist(root.left,n);
        int right=getDist(root.right,n);
        if(left==-1&&right==-1){
            return -1;
        }
        else if(left==-1){
            return right+1;
        }
        else{
            return left+1;
        }
    }
    public static int calcMinDist(Node root, int n1,int n2){
        Node lca=lca2(root,n1,n2);
        int dist1=getDist(lca,n1);
        int dist2=getDist(lca,n2);
        return dist1+dist2;
    }
    public static void main(String[] args){
        /*
                 1
               /   \
              2     3
             / \   / \
            4  5  6   7               
         */
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.left.left.left=new Node(10);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        int n1=4,n2=7;
        System.out.println(calcMinDist(root, n1, n2));
    }
}