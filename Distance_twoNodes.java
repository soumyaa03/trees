public class Distance_twoNodes {
    public static class Node
    {
        int data;Node left,right;
        public Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public Node root;
    Node LCA(Node root,int a,int b)
    {
        if(root==null)
        return null;

        if(root.data==a||root.data==b)
        return root;

        Node left_LCA=LCA(root.left,a,b);
        Node right_LCA=LCA(root.right,a,b);

        if(left_LCA!=null && right_LCA!=null)
        return root;

        return (left_LCA!=null)?left_LCA:right_LCA;

    }
    int dist(int a,int b)
    {
        Node lca=LCA(root, a, b);
        int d1=lca_to_target(lca, a, 0);
        int d2=lca_to_target(lca, b, 0);
        return d1+d2;
    }
    int lca_to_target(Node node,int n,int level)
    {
        if(node==null)
        return -1;
        if(node.data==n)
        return level;
        int l=lca_to_target(node.left, n, level+1);
        
        
            int r= lca_to_target(node.right, n, level+1);

        
        if(l==-1)
        return r;
        else
        return l;
        

    }
    public static void main(String args[])
    {
        Distance_twoNodes ob=new Distance_twoNodes();
         ob.root=new Node(1);
        
        ob.root.left = new Node(2);
        ob.root.right = new Node(3);
      ob. root.left.left = new Node(4);
      ob. root.left.right = new Node(5);

       ob.root.right.left = new Node(6);
       ob.root.right.right = new Node(7);
       System.out.println("Distance(2,3)"+ob.dist(2,3));
       
        
    }
    


    

    
    
}
