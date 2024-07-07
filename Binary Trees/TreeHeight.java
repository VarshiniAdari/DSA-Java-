public class TreeHeight {
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
    public static int getHeight(Node root){
        if(root==null){
            return 0;
        }
        int l_ht=getHeight(root.left);
        int r_ht=getHeight(root.right);
        int ht=Math.max(l_ht,r_ht)+1;
        return ht;
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
        // root.left.left.left=new Node(10);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        System.out.println(getHeight(root));
    }
}