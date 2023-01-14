public class TestQue {
    public static void main(String[] args) {
        int testPassed = 0;
        int testFailed = 0;

        if (!testEnqueue()) {
            System.out.println("Test Failed: testEnqueue");
            testFailed++;
         } else {
            testPassed++;
         }
   
         if (!testDequeue()) {
            System.out.println("Test Failed: testDequeue");
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


    private static IntArrayQue prepareArrayQue(){
        IntArrayQue que = new IntArrayQue();
        que.enqueue(1);
        que.enqueue(2);
        que.enqueue(3);
        que.enqueue(4);
        que.enqueue(5);

        return que;
    }

    private static IntllQueue preparellQue(){
        IntllQueue que = new IntllQueue();
        que.enqueue(1);
        que.enqueue(2);
        que.enqueue(3);
        que.enqueue(4);
        que.enqueue(5);

        return que;
    }

    private static boolean testEnqueue(){
        // IntArrayQue que = prepareArrayQue();
        IntllQueue que = preparellQue();

        que.enqueue(6);
        if(que.get(5) != 6 || que.size() != 6)
            return false;

        return true;
    }

    private static boolean testDequeue(){
        // IntArrayQue que = prepareArrayQue();
        IntllQueue que = preparellQue();

        que.dequeue();
        if(que.get(0) != 2 || que.size() != 4)
            return false;

        return true;
    }

    private static boolean testIsEmpty(){
        // IntArrayQue que = prepareArrayQue();
        IntllQueue que = preparellQue();

        if (que.isEmpty())
            return false;
        
        return true;
    }

    private static boolean testPeek(){
        // IntArrayQue que = prepareArrayQue();
        IntllQueue que = preparellQue();

        if (que.peek() != 1)
            return false;

        return true;
    }

}
