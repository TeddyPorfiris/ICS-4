public class TestStack {
    public static void main(String[] args) {
        int testPassed = 0;
        int testFailed = 0;

        if (!testPush()) {
            System.out.println("Test Failed: testPush");
            testFailed++;
         } else {
            testPassed++;
         }
   
         if (!testPop()) {
            System.out.println("Test Failed: testPop");
            testFailed++;
         } else {
            testPassed++;
         }
   
         if (!testSearch()) {
            System.out.println("Test Failed: testSearch");
            testFailed++;
         } else {
            testPassed++;
         }

         if (!testPeek()) {
            System.out.println("Test Failed: testPeek");
            testFailed++;
         } else {
            testPassed++;
         }

         if (!testIsEmpty()) {
            System.out.println("Test Failed: testIsEmpty");
            testFailed++;
         } else {
            testPassed++;
         }
   
         System.out.println("Tests Passed: " + testPassed + ". Tests Failed: " + testFailed);
      
    }

    private static IntArrayStack prepareArrayStack(){
        IntArrayStack stack = new IntArrayStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        return stack;
    }

    private static IntllStack preparellStack(){
        IntllStack stack = new IntllStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        return stack;
    }

    private static boolean testPush(){
        // IntArrayStack stack = prepareArrayStack();
        IntllStack stack = preparellStack();
        stack.push(6);
        if(stack.get(5) != 6 || stack.size() != 6)
            return false;
        
        return true;
    }

    private static boolean testPop(){
        //IntArrayStack stack = prepareArrayStack();
        IntllStack stack = preparellStack();
        stack.pop();
        if(stack.get(3) != 4 || stack.size() != 4)
            return false;
    
        return true;
    }

    private static boolean testSearch(){
        //IntArrayStack stack = prepareArrayStack();
        IntllStack stack = preparellStack();

        Integer temp = stack.search(5);
        if (temp != 5)
            return false;
        
        return true;
    }

    private static boolean testPeek(){
        //IntArrayStack stack = prepareArrayStack();
        IntllStack stack = preparellStack();

        if (stack.peek() != 1)
            return false;

        return true;
    }

    private static boolean testIsEmpty(){
        //IntArrayStack stack = prepareArrayStack();
        IntllStack stack = preparellStack();

        if (stack.isEmpty())
            return false;
        
        return true;
    }

}


// private static void testIntArrayStack(){
//     IntArrayStack arr = new IntArrayStack();
//     // arr.pop();
//     arr.push(1);
//     arr.push(2);
//     arr.push(3);
//     System.out.println(arr);
//     System.out.println(arr.search(3));
//     arr.pop();
//     System.out.println(arr);
//     System.out.println(arr.empty());
//     System.out.println(arr.peek()); 
// }


// private static void testIntllStack() {
//     IntllStack stack = new IntllStack();
//     // System.out.println(stack.isEmpty());
//     Integer temp = stack.pop();
//     stack.push(1);
//     stack.push(2);
//     stack.push(3);
//     stack.push(4);
//     stack.push(5);
//     System.out.println(stack);
//     temp = stack.pop();
//     System.out.println(temp);
//     System.out.println(stack);
//     stack.peek();
//     System.out.println(stack.isEmpty());
//     System.out.println(stack.search(3));
// }