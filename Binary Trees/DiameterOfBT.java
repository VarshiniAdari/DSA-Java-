public class DiameterOfBT{
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
    public static int height(Node root){
        if(root==null){
           return 0;
        }
        int l_ht=height(root.left);
        int r_ht=height(root.right);
        return Math.max(l_ht,r_ht)+1;
    }
    public static int diameter1(Node root){//approach1 TC->O(n^2)
        if(root==null){
            return 0;
        }
        int l_ht=height(root.left);
        int r_ht=height(root.right);
        int l_dm=diameter1(root.left);
        int r_dm=diameter1(root.right);
        int Selfdmtr=l_ht+r_ht+1;
        int ans= Math.max(Selfdmtr,Math.max(l_dm,r_dm));  
        return ans;       
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
        //root.left.left.left=new Node(10);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        System.out.println(diameter1(root));
    }
}