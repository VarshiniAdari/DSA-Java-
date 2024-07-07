public class DeleteNodeInBST {
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
    public static Node delete(Node root,int val){
        if(root.data<val){
            root.right=delete(root.right,val);
        }
        else if(root.data>val){
            root.left=delete(root.left,val);
        }
        else{//we found the root to be deleted

            //case-1=No children(leaf Node)
            if(root.left==null&&root.right==null){
                return null;
            }
            //case-2=One child
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            //case-3=2 children
            //step-1 find inorder successor(IS)
            //step-2 replace root with IS
            //step-3 delete IS
            Node IS=findIS(root.right);
            root.data=IS.data;
            root=delete(root.right,IS.data);
        }
        return root;
    }
    public static Node findIS(Node root){
        while(root.left!=null){
            root=root.left;
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
    public static void main(String[] args) {
        int values[]={5,1,3,4,2,7};
        Node root=null;
        for(int i=0;i<values.length;i++){
            root=insert(root,values[i]);
        }
        inorder(root);
        System.out.println();
        delete(root,1);
        inorder(root);
        System.out.println();
    }
}