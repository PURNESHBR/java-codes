import java.util.*;
public class binary_search_tree {
    static class node{
        int data;
        node left;
        node right;
        node(int data){
            this.data=data;
        }
    }
    public static node insert(node root,int val){
        if(root ==null){
            root=new node(val);
            return root;
        }
        if(root.data>val){
            //left subtree
            root.left=insert(root.left, val);
        }
        else{
            root.right=insert(root.right, val);
        }
        return root;
    }
    public static node delete(node root,int val){
        if(root.data>val){
            root.left=delete(root.left,val);
        }
        else if(root.data<val){
            root.right=delete(root.right, val);
        }else{//root.data==val
            //case1
            if(root.left==null && root.right==null){
                return null;
            }
            //case2
            else if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            //case 3 to find leftmost node in right subtree
            node is=inordersuccessor(root.right);
            root.data=is.data;
            root.right=delete(root.right, is.data);
        }
        return root;

    }
    public static node inordersuccessor(node root){
        while(root.left !=null){
            root=root.left;
        }
        return root;
    }
    public static void inorder(node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static boolean search(node root,int key){
        if(root==null){
            return false;
        }
        if(root.data>key){
            return search(root.left, key);
        }
        else if(root.data<key){
            return search(root.right, key);
        }else{
            return true;
        }
    }
    public static void inrange(node root,int x, int y){
        if(root == null){
            return;
        }
        if(root.data>=x && root.data<=y){
            inrange(root.left, x, y);
            System.out.print(root.data+" ");
            inrange(root.left, x, y);
        }
        else if(root.data>y){
            inrange(root.left, x, y);
        }else{
            inrange(root.right, x, y);
        }
    }
    public static void printroot2leaf(node root,ArrayList<Integer> path){
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            printpath(path);
        }else{
            path.add(root.data);
            printroot2leaf(root.left, path);
            printroot2leaf(root.right, path);
        }
        path.remove(path.size()-1);
    }
    public static void printpath(ArrayList<Integer> path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+"->");
        }
    }
    public static void main(String[] args) {
        int values[]={8,5,3,1,4,6,10,11,14};
        node root = null;
        for(int i=0;i<values.length;i++){
            root=insert(root, values[i]);
        }
        inorder(root);
        System.out.println();
        if(search(root, 1)){
            System.out.println("found");
        }else{
            System.out.println("not found");
        }
        //delete(root, 4);
        inorder(root);
        inrange(root, 6, 10);
        printroot2leaf(root, new ArrayList<>());
    }
    
}
