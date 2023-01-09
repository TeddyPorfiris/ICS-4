public class Test{
    public static void main(String[] args){
        IntLinkedList linkedList = new IntLinkedList();
        linkedList.add(1);
        linkedList.add(2);
        // linkedList.remove(2);
        linkedList.add(1, 3);
        linkedList.add(3, 4);

        linkedList.viewLinkedList();
        System.out.println("size is: " + linkedList.size());
        
    }
}