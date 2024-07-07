public class SortedArrToBalancedBST {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    public static Node insert(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(root.data>val){
            //leftSubTree
            root.left=insert(root.left,val);
        }
        else{
            //rightSubTree
            root.right=insert(root.right,val);
        }
        return root;
    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static Node createBalancedBST(int[] arr, int st,int end){
        if(st>end){
            return null;
        }
        int mid=(st+end)/2;
        Node root=new Node(arr[mid]);
        root.left=createBalancedBST(arr, st, mid-1);
        root.right=createBalancedBST(arr, mid+1, end);
        return root;
    }
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        int values[]={3,5,6,8,10,11,12};
        Node root=null;
        for(int i=0;i<values.length;i++){
            root=insert(root,values[i]);
        }
        /*          8
                  /   \
                 5     11
                / \   / \
               3   6  10 12 (balanced BST)
         */
        inorder(root);
        System.out.println();
        preorder(root);
        System.out.println();
        root=createBalancedBST(values, 0, values.length-1);
        inorder(root);
        System.out.println();
        preorder(root);
        System.out.println();
    }
}
