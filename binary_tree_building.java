import java.util.*;
public class binary_tree_building {
    public static class node{
        int data;
        node left;
        node right;
        node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static class binarytree{
        static int idx=-1;
        public node buildtree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            node newnode=new node(nodes[idx]);
            newnode.left=buildtree(nodes);
            newnode.right=buildtree(nodes);

            return newnode;

        }
    }
    public static void preorder(node root){
        if(root==null){
            return ;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void postorder(node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    public static void levelorder(node root){
        if(root==null){
            return;
        }
        Queue<node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            node currnode=q.remove();
            if(currnode==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }else{
                System.out.print(currnode.data+" ");
                if(currnode.left!=null){
                    q.add(currnode.left);
                }
                if(currnode.right!=null){
                    q.add(currnode.right);
                }
            }

        }
            
    }
    public static int countnode(node root){
        if(root==null){
            return 0;
        }
        int leftnode=countnode(root.left);
        int rightnode=countnode(root.right);
        return leftnode+rightnode+1;//x+y+1(x=leftnode,y=rightnode,1=root)
    }
    public static int sumnode(node root){
        if(root ==null){
            return 0;
        }
        int leftsum=sumnode(root.left);
        int rightsum=sumnode(root.right);
        return leftsum+rightsum+root.data;
    }
    public static int heighttree(node root){
        if(root ==null){
            return 0;
        }
        int leftheight=heighttree(root.left);
        int rightheight=heighttree(root.right);
        int maxheight=Math.max(leftheight, rightheight)+1;
        return maxheight;
    }
    public static int diametertree(node root){
        if(root==null){
            return 0;
        }
        int diam1=diametertree(root.left);
        int diam2=diametertree(root.right);
        int diam3=heighttree(root.left)+heighttree(root.right)+1;
        return Math.max(diam3,Math.max(diam1, diam2));

    }

    public static void main(String[] args) {
        int node[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binarytree tree = new binarytree();
        node root=tree.buildtree(node);
        System.out.println(root.data);
        preorder(root);
        System.out.println();
        inorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
        levelorder(root);
        System.out.println(countnode(root));
        System.out.println(sumnode(root));
        System.out.println(heighttree(root));
        System.out.println(diametertree(root));
    }
    
}
