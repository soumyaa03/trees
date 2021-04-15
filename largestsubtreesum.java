

public class largestsubtreesum
{
    public static class Node
    {
        int data;
        Node right; Node left;
        public Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
        
        
    } 
    public Node root;int ins;
    largestsubtreesum()
        {
            root=null;
            ins=-999999;
        }
       public static class INT 
{ 
    int v; 
    INT(int a) 
    { 
        v = a; 
    } 
} 

    int largestsum(Node root,INT ins)
    {
        if(root==null)
        return 0;
        int currentsum=root.data+largestsum(root.left,ins)+largestsum(root.right, ins);
        ins.v=Math.max(ins.v,currentsum);
        return currentsum;
    }
    int largestsubtreesumUtil(Node root)
    {
        if(root==null)
        return 0;
        INT ins = new INT(-9999999);
        largestsum(root, ins);
        return ins.v;
    }
    public static void main(String args[])
    {
        largestsubtreesum ob = new largestsubtreesum();
        Node root = new Node(1);  
    root.left = new Node(-2);  
    root.right = new Node(3);  
    root.left.left = new Node(4);  
    root.left.right = new Node(5);  
    root.right.left = new Node(-6);  
    root.right.right = new Node(2);
    System.out.println("sum = "+ob.largestsubtreesumUtil(root));
   // ob.largestsubtreesumUtil(root);
    //System.out.print(ob.ins);
   
       

    }

}