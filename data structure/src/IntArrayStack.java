import java.lang.reflect.Array;

public class IntArrayStack {
    private int manyItems;
    private Integer top;
    private Integer stack[];
    
    public IntArrayStack(){
        this.top = -1;
        this.stack = new Integer[0];
    }

    public Integer[] push(Integer data){
        int stackSize = stack.length;
        Integer newStack[] = new Integer[stackSize + 1];
        
        for (int i = 0; i < stackSize; i++){
            newStack[i] = stack[i];
        }

        newStack[stackSize] = data;

        top = data;
        manyItems++;
        stack = newStack;

        return newStack;


    }

    public Integer[] pop(){
        if (stack.length != 0){
            int stackSize = stack.length;
            Integer newStack[] = new Integer[stackSize - 1];

            for (int i = 0; i < stackSize-1; i++){
                newStack[i] = stack[i];
            }

            top = newStack[newStack.length - 1];
            manyItems--;
            stack = newStack;

            return newStack;
        }else{
            return null;
        }
    }


    public Integer peek(){
        if (stack.length != 0)
            return stack[0];
        else
            return null;
    }

    public Integer search(Integer data){
        if (stack.length != 0){
            int stackSize = stack.length;
            int i = 0;
    
            while (i < stackSize) {
                if (stack[i] == data) {
                    return i+1;
                }
                i++;
            }

            return null;

        }else{
            return null;
        }
        
    }

    public boolean isEmpty(){
        if (stack.length == 0)
            return true;
        else
            return false;
    }


    public String toString(){
        String result = "{";

        for (int i = 0; i < stack.length; i++) {
            result += stack[i] + ", ";
        }

        //getting rid of extra comma and space assuming the list isn't empty
        if (!isEmpty()){
            result = result.substring(0, result.length()-2);
        }

        result += "}";

        return result;
    }

    public int size(){
        return stack.length;
    }

    public Integer get(int index){
        if (index < 0)
            throw new IndexOutOfBoundsException("Invalid index " + index + " must be greater than 0");
        else if (size() == 0)
            throw new IllegalStateException("Can't get an element from an empty list.");
        else if (index > size())
            throw new IndexOutOfBoundsException("Invalid index " + index + " max index is " + (size() - 1));
        else
            return stack[index];
    }


}
