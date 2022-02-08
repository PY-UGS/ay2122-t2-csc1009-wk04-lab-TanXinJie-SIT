public class StackMain {
    public static void main(String[] args) {
        StackOfIntegers stack = new StackOfIntegers();
        
        for(int i = 0; i < 10; i++)
        {
            stack.Push(i);
        }
        while(!stack.isEmpty())
        {
            System.out.print(stack.Pop() + " ");
        }
    }
}
