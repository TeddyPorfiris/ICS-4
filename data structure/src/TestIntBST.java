public class TestIntBST {
    public static void main(String[] args) {
        int testPassed = 0;
        int testFailed = 0;
        
        if (!testFind()) {
            System.out.println("Test Failed: testFind");
            testFailed++;
         } else {
            testPassed++;
         }

         if (!testAdd()) {
            System.out.println("Test Failed: testAdd");
            testFailed++;
         } else {
            testPassed++;
         }

         if (!testRemove()) {
            System.out.println("Test Failed: testRemove");
            testFailed++;
         } else {
            testPassed++;
         }

         if (!testPreOrderPrintTraversal()) {
            System.out.println("Test Failed: testPreOrderPrintTraversal");
            testFailed++;
         } else {
            testPassed++;
         }

         if (!testPostOrderPrintTraversal()) {
            System.out.println("Test Failed: testPostOrderPrintTraversal");
            testFailed++;
         } else {
            testPassed++;
         }

         if (!testInOrderPrintTraversal()) {
            System.out.println("Test Failed: testInOrderPrintTraversal");
            testFailed++;
         } else {
            testPassed++;
         }

         System.out.println("Tests Passed: " + testPassed + ". Tests Failed: " + testFailed);
        
    }

    private static IntBST prepareIntBST(){
        IntBST bst = new IntBST();

        bst.add(6);
        bst.add(8);
        bst.add(3);
        bst.add(1);
        bst.add(13);
        bst.add(9);
        bst.add(7);
        bst.add(11);

        return bst;
    }



    private static boolean testFind(){
        IntBST bst = prepareIntBST();

        if (bst.find(6) == null)
            return false;
        
        return true;
    }

    private static boolean testAdd(){
        IntBST bst = prepareIntBST();

        bst.add(20);
        if (bst.find(20) == null)
            return false;
        
        return true;
    }

    private static boolean testRemove(){
        IntBST bst = prepareIntBST();

        bst.remove(13);
        if (bst.find(13) == null)
            return true;
        
        return false;
    }

    private static boolean testPreOrderPrintTraversal(){
        IntBST bst = prepareIntBST();
        if (bst.preOrderPrintTraversal() != "6318713911")
            return false;
        return true;
    }

    private static boolean testPostOrderPrintTraversal(){
        IntBST bst = prepareIntBST();
        if (bst.postOrderPrintTraversal() != "1371191386")
            return false;
        return true;
    }

    private static boolean testInOrderPrintTraversal(){
        IntBST bst = prepareIntBST();
        if (bst.inOrderPrintTraversal() != "1367891113")
            return false;
        return true;
    }
    
}
