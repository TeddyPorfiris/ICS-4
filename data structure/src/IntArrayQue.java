public class IntArrayQue {
    private Integer que[];

    public IntArrayQue(){
        this.que = new Integer[0];
    }

    public boolean isEmpty(){
        if (que.length == 0)
            return true;
        else
            return false;
    }

    public void clear(){
        que = new Integer[0];
    }

    public boolean enqueue(Integer el){
        int queSize = que.length;
        Integer newQue[] = new Integer[queSize + 1];
        
        for (int i = 0; i < queSize; i++){
            newQue[i] = que[i];
        }

        newQue[queSize] = el;
        que = newQue;

        return true;
    }

    public Integer dequeue() {
        int queSize = que.length;
        Integer firstEl;
        if (queSize == 0)
            return null;
        else if (queSize == 1){
            firstEl = que[0];
            clear();
            return firstEl;
        }else{
            firstEl = que[0];
            Integer newQue[] = new Integer[queSize - 1];
            for (int i = 0; i < queSize-1; i++){
                newQue[i] = que[i+1];
            }

            que = newQue;

            return firstEl;
        }
    }

    public Integer peek(){
        if (que.length == 0)
            return null;
        else
            return que[0];
    }


    public int size(){
        return que.length;
    }

    public Integer get(int index){
        if (index < 0)
            throw new IndexOutOfBoundsException("Invalid index " + index + " must be greater than 0");
        else if (size() == 0)
            throw new IllegalStateException("Can't get an element from an empty list.");
        else if (index > size())
            throw new IndexOutOfBoundsException("Invalid index " + index + " max index is " + (size() - 1));
        else
            return que[index];
    }

}
