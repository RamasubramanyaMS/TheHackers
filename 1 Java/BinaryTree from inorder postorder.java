class Node { 
    int data; 
    Node left, right; 
  
    public Node(int data) 
    { 
        this.data = data; 
        left = right = null; 
    } 
} 
  

class Index { 
    int index; 
} 
  
class BinaryTree { 
    
    Node buildUtil(int in[], int post[], int inStrt, 
                   int inEnd, Index pIndex) 
    { 
        
        if (inStrt > inEnd) 
            return null; 
  
        
        Node node = new Node(post[pIndex.index]); 
        (pIndex.index)--; 
  
        if (inStrt == inEnd) 
            return node; 
  
        
        int iIndex = search(in, inStrt, inEnd, node.data); 
  
        node.right = buildUtil(in, post, iIndex + 1, inEnd, pIndex); 
        node.left = buildUtil(in, post, inStrt, iIndex - 1, pIndex); 
  
        return node; 
    } 
  
    
    Node buildTree(int in[], int post[], int n) 
    { 
        Index pIndex = new Index(); 
        pIndex.index = n - 1; 
        return buildUtil(in, post, 0, n - 1, pIndex); 
    } 
  
  
    int search(int arr[], int strt, int end, int value) 
    { 
        int i; 
        for (i = strt; i <= end; i++) { 
            if (arr[i] == value) 
                break; 
        } 
        return i; 
    } 
  
    
    void preOrder(Node node) 
    { 
        if (node == null) 
            return; 
        System.out.print(node.data + " "); 
        preOrder(node.left); 
        preOrder(node.right); 
    } 
  
    public static void main(String[] args) 
    { 
        BinaryTree tree = new BinaryTree(); 
        int in[] = new int[] { 4, 8, 2, 5, 1, 6, 3, 7 }; 
        int post[] = new int[] { 8, 4, 5, 2, 6, 7, 3, 1 }; 
        int n = in.length; 
        Node root = tree.buildTree(in, post, n); 
        System.out.println("Preorder of the constructed tree : "); 
        tree.preOrder(root); 
    } 
} 