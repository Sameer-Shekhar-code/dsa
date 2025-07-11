package Stack_Queues;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_VALUE = 10;

    int ptr = -1;

    public CustomStack(){
        this(DEFAULT_VALUE);
    }

    public CustomStack(int size){
        this.data = new int[size];
    }

    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is full");
            return false;
        }
        ptr++;
        data[ptr]=item;
        return true;
    }
    public int pop() throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot pop! stack empty");
        }
        return data[ptr--];
    }
    public int peek() throws StackException{
        if(isEmpty()){
            throw new StackException("Stack empty! add items");
        }
        return data[ptr];
    }
    public boolean isFull(){
        return ptr == data.length-1;
    }
    public boolean isEmpty(){
        return ptr == -1;
    }

}

