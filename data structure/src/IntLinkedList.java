public class IntLinkedList{
    private IntNode head;
    private int manyItems;

    public IntLinkedList(){
        this.head = null;
    }

    public boolean add(Integer data){
        IntNode temp = new IntNode(data);
        //if link list is empty
        if (head == null)
            head = temp;
        else {
            IntNode curr = head;
            //keep iterating until we are on last node of list (which has a link of null)
            while(curr.getLink() != null)
                curr = curr.getLink();
            //setting the link of the last node to the new last node.
            curr.setLink(temp);
        }
        manyItems++;
        return true;
    }

    public boolean addFront(Integer data){
        head = new IntNode(data, head);
        manyItems++;
        return true;
    }

    public boolean add(int index, Integer data){
        if (index > manyItems)
            throw new IndexOutOfBoundsException("index " + index + " is not allowed, max index is " + manyItems);
  
        if (index == 0)
            addFront(data);
        else {
            IntNode curr = head;
            //getting the node before the node at the specified index. this way we can set the prior node's link to the new node we are adding, putting the new node at the correct posiiton
            for (int i = 0; i<index - 1; i++){
                //once the loop is done, curr will be set to the node at the specified index.
                curr = curr.getLink();
            }
            
            //at curr (the node at the index), linking it to a new node that has data the user specified and has a link of the node that was originally after the node at the index.
            curr.setLink(new IntNode(data, curr.getLink()));
            manyItems++;
        }
        
        return true;
    }

    public boolean isEmpty(){
        return head == null;
    }


    public boolean viewLinkedList(){
        IntNode curr = head;
        for (int i = 0; i<size(); i++){
            System.out.println(curr.getData());
            curr = curr.getLink();
        }

        return true;
    }

    public int size() {
        return manyItems;
    }

    public Integer remove(Integer data){
        //setting head to the node the original head was linked to
        if (head != null && head.getData() == data){
            head = head.getLink();
            manyItems--;
            return data;
        }else{
            IntNode curr = head;
            //finding the node the user wants to remove
            while(curr.getLink() != null && curr.getLink().getData() != data){
                curr = curr.getLink();
            }

            //curr is the node before the node the user wants to remove
            if (curr.getLink() != null){
                //set the link of curr to the node after the node the user wants to remove
                curr.setLink(curr.getLink().getLink());
                manyItems--;
                return data;
            //if the link of curr (the node before the node the user wants to remove) is null, that means that we are at the end of the link list so the item the user wants to remove does not exist
            }else{
                return null;
            }
        }
    }
}