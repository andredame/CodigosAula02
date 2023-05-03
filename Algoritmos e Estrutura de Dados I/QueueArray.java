public class QueueArray {
    private final int valueINitial=5;
    private Integer[] queue;
    private int count;

    //FIFO -First in First Out
    public QueueArray(){
        queue=new Integer[valueINitial];
        count=0;
    }
    public QueueArray(int capacity){
        queue= new Integer[capacity];
        count=0;
    }
    public int size(){
        return count;
    }
    public boolean isEmpty(){
        return (count==0);
    }
    public void clear (){
        count=0;
        queue= new Integer[valueINitial];
        //queue =null;
    }
    public void enqueue(int element){
        if (count==queue.length){
            throw new IndexOutOfBoundsException(element);
        }
        
        queue[count++]=element;
        //ou 
        //queue[count]= element;
        //count++;
    }   
}
