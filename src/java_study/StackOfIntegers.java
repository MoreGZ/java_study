package java_study;

public class StackOfIntegers {

    private int[] elements;
    private int size = 0;

    public static final int DEFAULT_CAPACITY = 16;

    public StackOfIntegers(){
        this(DEFAULT_CAPACITY);
    }

    public StackOfIntegers(int capacity){
        elements = new int[capacity];
    }

    public void push(int value){
        if(size >= DEFAULT_CAPACITY){
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size++] = value;
    }

    public int pop(){
        return elements[--size];

    }

    public int peek(){
        return elements[size-1];
    }

    public boolean empty(){
        return size == 0;
    }

    public int getSize(){
        return size;
    }

    public static void main(String[] args){
        StackOfIntegers stack = new StackOfIntegers();

        stack.push(12);
        stack.push(334);
        System.out.println(stack.getSize());
        int x = stack.pop();

        int y = stack.peek();

        int z = stack.pop();

        System.out.printf("%d %d %d", x, y, z);
        System.out.println();
        System.out.println(stack.empty());
        System.out.println(stack.getSize());
    }
}
