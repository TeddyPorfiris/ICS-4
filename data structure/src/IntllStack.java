public class IntllStack {
    private IntNode head;
    private int manyItems = 0;

    public boolean push(Integer el){
        head = new IntNode(el, head);
        manyItems++;

        return true;
    }

 

    public Integer pop() {
        if(head==null){
            return null;
        } else {
            Integer temp = head.getData();
            head = head.getLink();
            manyItems--;
            return temp;

        }

    }

 

    public boolean isEmpty(){
        return head == null;
    }

 

    public Integer peek(){
        if (head==null){
            return null;
        } else {
        Integer temp = head.getData();
        return temp;

        }

    }

 

    public Integer search(Integer data){
        int pft = 0;
        IntNode curr = head;
        if(isEmpty()){
            return -1;
        } else {
            for (int i = 0; i < manyItems; i++) {
                if(curr.getData() == data){
                    return manyItems-pft;
                } else {
                    pft++;
                    curr = curr.getLink();
                }

            }

            return -1;

        }

    }

 

    public String toString() {
        String result = "{";
        IntNode curr = head;

 

        while(curr != null){
            result += curr.getData() + ", ";
            curr = curr.getLink();

        }

 

        if(!isEmpty()){
            result = result.substring(0, result.length()-2);

        }

        result += "}";

        return result;

    }

    public Integer get(int index) {
        if (index < 0)
           throw new IndexOutOfBoundsException("Invalid index " + index + " must be greater than 0");
  
        if (head == null)
           throw new IllegalStateException("Can't get an element from an empty list.");
        else if (index > size()) {
           throw new IndexOutOfBoundsException("Invalid index " + index + " max index is " + (size() - 1));
        }else {
           IntNode curr = head;
           for (int i = 0; i < index; i++) {
              curr = curr.getLink();
           }
  
           return curr.getData();
        }
    }
    
    public int size() {
        return manyItems;
    }

}
