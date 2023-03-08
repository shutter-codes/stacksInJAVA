package stackEx;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    // initialising the by default size
    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    // initialising the custom size
    public CustomStack(int size) {
        this.data = new int[size];
    }

    //insertion in stack
    public boolean push(int item) {
        if (isFull()) {
            System.out.println("Stack is Full");
            return false;
        }

        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is already Empty");
        }

        int removed = data[ptr];
        ptr--;
        return removed;

    }

    private boolean isFull() {
        return ptr == data.length - 1;  //ptr is at last index
    }

    private boolean isEmpty() {
        return ptr == -1;
    }

}
