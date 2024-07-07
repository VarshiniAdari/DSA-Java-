public class SubTree {
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
    public static boolean isIdentical(Node root,Node subTree){
        if(root==null&&subTree==null){
            return true;
        }
        else if(root==null||subTree==null||root.data!=subTree.data){
            return false;
        }
        return isIdentical(root.left, subTree.left)&&isIdentical(root.right, subTree.right);
    }
    public static boolean isSubTree(Node root,Node subRoot){
        if(root==null){
            return false;
        }
        if(root.data==subRoot.data){
            if(isIdentical(root,subRoot)){
                return true;
            }
        }
        return isSubTree(root.left, subRoot)||isSubTree(root.right, subRoot);
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
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        /*
                    2
                   / \
                  4   5
         */
        Node subRoot=new Node(2);
        subRoot.left=new Node(4);
        subRoot.right=new Node(5);
        System.out.println(isSubTree(root, subRoot));
    }
    
}
