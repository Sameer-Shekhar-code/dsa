package Stack_Queues;

public class CustomQueue {
    protected int[] data;
    private static final int DEFAULT_VALUE = 10;

    int end = 0;

    public CustomQueue(){
        this(DEFAULT_VALUE);
    }

    public CustomQueue(int size){
        this.data = new int[size];
    }

    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end]=item;
        end++;
        return true;
    }

    public int remove() throws Exception{
        if(isFull()){
            throw new Exception("Queue empty!");
        }
        int removed = data[0];
        for(int i=1; i<data.length; i++){
            data[i-1] = data[i];
        }
        end--;
        return removed;
    }
    public boolean isFull(){
        return end == data.length-1;
    }
    public boolean isEmpty(){
        return end == 0;
    }
}
