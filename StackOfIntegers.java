import java.util.ArrayList;
import java.util.List;

public class StackOfIntegers {
    private List<Integer> elements = new ArrayList<>();
    private int size;
    
    public int getSize() {
        return size;
    }
    
    public StackOfIntegers() {
    }
    
    public StackOfIntegers(int size) {
        this.size = size;
    }
    
    public boolean isEmpty(){
        return size == 0 ? true : false;
    }
    
    public int Peek(){
        return elements.get(size - 1);
    }
    
    public void Push(int i) {
        elements.add(i);
        size++;
    }
    
    public int Pop(){
        int result = this.Peek();
        elements.remove(this.Peek());
        size--;
        return result;
    }
}
