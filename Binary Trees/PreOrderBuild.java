public class PreOrderBuild{
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
    static class BinaryTree{
        static int idx=-1;//travel array
        //building a tree whose input is in preOrder
        public Node buildTree(int[] nodes){
            idx++; 
            if(nodes[idx]==-1){//when u reched leaf-base case
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;
        }
        public void preorder(Node root){
        if(root==null){
            // System.out.print(-1+"  ");
            return;
        }
        System.out.print(root.data+"  ");
        preorder(root.left);
        preorder(root.right);
        }
    }
    
    public static void main(String[] args){
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree bt=new BinaryTree();
        Node root=bt.buildTree(nodes);
        // System.out.println(root.data);
        bt.preorder(root);
    }
}