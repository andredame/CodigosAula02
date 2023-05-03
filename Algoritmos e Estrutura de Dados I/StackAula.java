/**
 * StackAula
 */
public class StackAula {
    
    private int count;
    private Integer[] data;
    
    
    public StackAula(){
        
        data=new Integer [10];
        count=0;
    }
    public StackAula(int capacity){
        data=new Integer[capacity];
        count =0;   
    }
    public boolean isEmpty(){
        return (count==0);
    }

    public int size(){
        return count;
    }
    public void clear(){ 
        count=0;
        data=new Integer[10];
    }
    public void push(int e){
        if (count== data.length){
            throw new IndexOutOfBoundsException(e);
        }
        data[count]=e;
        count++;
        /*
            data[count++]=e;
         */ 
    
    }

    public Integer pop(){
        if (count ==0)throw new IndexOutOfBoundsException();
        Integer aux= data[count-1];
        data[count-1]=null;
        count--;
        return aux;
    }
    public Integer top(){
        if (count ==0)throw new IndexOutOfBoundsException();
        return data[count-1];

    }
    public static Integer[] reverse(int[] vetor){
        Integer[] reverser= new Integer[vetor.length];
        StackAula aux= new StackAula(vetor.length);
        for(int i=0;i<vetor.length;i++){
            aux.push(vetor[i]);
        }
        for(int i=0;i<vetor.length;i++){
            reverser[i]=aux.pop();
        }
        return reverser;
    }
    
}