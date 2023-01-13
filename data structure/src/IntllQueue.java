public class IntllQueue {
    private IntLinkedList data;

    //Linked list implementation of a queue where the front of the liked list is the front of the queue
    public IntllQueue(){
        data = new IntLinkedList();
    }

    public boolean isEmpty(){
        return data.isEmpty();
    }

    public void clear(){
        data = new IntLinkedList();
    }

    public boolean enqueue(Integer el){
        return data.add(el);
    }

    public Integer dequeue() {
        return data.removeFront();
    }
}
