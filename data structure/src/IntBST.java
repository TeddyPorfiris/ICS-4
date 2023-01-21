public class IntBST {
    private IntBSTNode root;
    private String tempPre = "";
    private String tempPost = "";
    private String tempIn = "";

    public IntBST() {
        this.root = null;
    }



    public String preOrderPrintTraversal(){
        tempPre = "";
        preOrderPrintTraversal(root);
        return orderString("pre");
    }


    public String postOrderPrintTraversal(){
        tempPost = "";
        postOrderPrintTraversal(root);
        return orderString("post");
        
    }

    public String inOrderPrintTraversal(){
        tempIn = "";
        inOrderPrintTraversal(root);
        return orderString("in");
    }

    private void preOrderPrintTraversal(IntBSTNode root){

        tempPre = tempPre + root.getValue();

        if (root.hasLeftChild()){
            preOrderPrintTraversal(root.getLeftChild());
        }
        
        if (root.hasRightChild()){
            preOrderPrintTraversal(root.getRightChild());
        }

        
        
    }


    private void postOrderPrintTraversal(IntBSTNode root){
        
        
        if (root.hasLeftChild()){
            postOrderPrintTraversal(root.getLeftChild());
        }
        
        if (root.hasRightChild()){
            postOrderPrintTraversal(root.getRightChild());
        } 
        
        tempPost = tempPost + root.getValue();
    }

    private void inOrderPrintTraversal(IntBSTNode root){
        
        if (root.hasLeftChild()){
            inOrderPrintTraversal(root.getLeftChild());
        }

        tempIn = tempIn + root.getValue();
        
        if (root.hasRightChild()){
            inOrderPrintTraversal(root.getRightChild());
        } 

    }

    private String orderString(String type) {
        if (type == "pre")
            return tempPre;
        else if (type == "post")
            return tempPost;
        else
            return tempIn;
    }


    public IntBSTNode add(Integer val){
        if (root == null){
            root = new IntBSTNode(val);
        }
        return addRecursive(root, val);
    }


    public IntBSTNode find(Integer val){
        return findRecursive(root, val);
    }

    private IntBSTNode findRecursive(IntBSTNode root, Integer val) {
        if (val == root.getValue())
            return root;
        else if (root.hasLeftChild() && val < root.getValue())
            return findRecursive(root.getLeftChild(), val);
        else if (root.hasRightChild() && val > root.getValue())
            return findRecursive(root.getRightChild(), val);
        else
            return null;
    }


    /*
    * @param root  root of the subtree we are adding val to
    * @param val  the Integer we are adding to the BST (no duplicates)
    * @return  reference to the IntBSTNode we inserted
    */


    private IntBSTNode addRecursive(IntBSTNode root, Integer val) {
        if (val < root.getValue()){
            if (root.hasLeftChild())
                return addRecursive(root.getLeftChild(), val);
            else{
                IntBSTNode child = new IntBSTNode(val);
                root.setLeftChild(child);
                return child;
            }
        }else if (val > root.getValue()){
            if (root.hasRightChild())
                return addRecursive(root.getRightChild(), val);
            else{
                IntBSTNode child = new IntBSTNode(val);
                root.setRightChild(child);
                return child;
            }
        }else{
            return root;
        }

        
    }

    private IntBSTNode findLargest(IntBSTNode root){
        if (root.getRightChild() != null && root.getRightChild().getRightChild() != null)
            return findLargest(root.getRightChild());
        else if (root.getRightChild() != null)
            return root.getRightChild();

        return root;
    }



    // public boolean remove(Integer val){
    //     if (val == root.getValue()){
    //         //if root doesn't have any children set root value to null (everything is null)
    //         if (root.getLeftChild() == null && root.getRightChild() == null){
    //             root = null;
    //             return true;
    //         //if no left child, set the node you are removing to its right child
    //         }else if (root.getLeftChild() == null){
    //             root = root.getRightChild();
    //             return true;
    //         //if no right child, set the node you are removing to its left child
    //         }else if (root.getRightChild() == null){
    //             root = root.getLeftChild();
    //             return true;
    //         //if both left and right child, find the largest node in left branch and set the node you are removing to that largest node
    //         }else{
    //             IntBSTNode biggest = findLargest(root.getLeftChild());
    //             root.setValue(biggest.getValue());
    //             return removeRecursive(root.getLeftChild(), val);
                
    //         }
    //     }

    //     return true;

    // }


    // private boolean removeRecursive(IntBSTNode leftChild) {
    //     if (leftChild.getLeftChild() == null)
    //         leftChild = null;
    //     else if (leftChild.hasLeftChild()){
    //         leftChild = leftChild.getLeftChild();
    //         removeRecursive(leftChild);
    //     }

    //     return true;
    // }

    public void remove(Integer val) {
        // removing the root node of our BST
        root = removeRecursive(root, val);
  
     }

    private IntBSTNode removeRecursive(IntBSTNode root, Integer val) {
        if (root == null)
           return root;
  
        //recurses until val and root have the same value
        if (val < root.getValue()) {
           root.setLeftChild(removeRecursive(root.getLeftChild(), val));
        } else if (val > root.getValue()) {
           root.setRightChild(removeRecursive(root.getRightChild(), val));
        } else {
            //if no left child, set the node you are removing to its right child
           if (root.getLeftChild() == null) {
              return root.getRightChild();
            //if no right child, set the node you are removing to its left child
           } else if (root.getRightChild() == null) {
              return root.getLeftChild();
            //if both left and right child, find the largest node in left branch and set the node you are removing to that largest node
           } else {
              Integer biggest = findSmallest(root.getRightChild());
              root.setValue(biggest);
              root.setRightChild(removeRecursive(root.getRightChild(), root.getValue()));
           }
        }
  
        return root;
    }

    private Integer findSmallest(IntBSTNode root) {
        Integer min = root.getValue();
  
        while (root.getLeftChild() != null) {
           min = root.getLeftChild().getValue();
           root = root.getLeftChild();
        }
  
        return min;
     }




}
