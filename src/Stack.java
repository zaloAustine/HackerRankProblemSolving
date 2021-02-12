import java.util.Arrays;
import java.util.stream.IntStream;

class Stack {
    private int arr[];
    private int top;
    private int capacity;

    Stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public static void main(String[] args) {
        Stack stack = new Stack(3);

        stack.push(1);        // Inserting 1 in the stack
        stack.push(2);        // Inserting 2 in the stack

        stack.pop();        // removing the top 2
        stack.pop();        // removing the top 1

        stack.push(3);        // Inserting 3 in the stack

        System.out.println("Top element is: " + stack.peek());
        System.out.println("Stack size is " + stack.size());

        stack.pop();        // removing the top 3

        // check if stack is empty
        if (stack.isEmpty())
            System.out.println("Stack Is Empty");
        else
            System.out.println("Stack Is Not Empty");
    }

    public void push(int x) {
        if (isFull()) {
            System.out.println("OverFlow\nProgram Terminated\n");
            System.exit(1);
        }

        System.out.println("Inserting " + x);
        arr[++top] = x;

    }

    public int pop() {
        // check for stack underflow
        if (isEmpty()) {
            System.out.println("UnderFlow\nProgram Terminated");
            System.exit(1);
        }

        System.out.println("Removing " + peek());

        // decrease stack size by 1 and (optionally) return the popped element
        return arr[top--];
    }

    // return the top most element in stack
    public int peek() {
        if (!isEmpty())
            return arr[top];
        else
            System.exit(1);
        return -1;
    }

    public Boolean isEmpty() {
        return top == -1;
    }

    public Boolean isFull() {
        return top == capacity - 1;
    }

    public int size() {
        return top + 1;
    }

    private void search() {
        int[] arr = {4,5,6,76,1,43,446,57,56,45,7,8,9,98,6};
        Arrays.sort(arr);
        print(Arrays.toString(arr));
    }

    void print(String value) {
        System.out.println(value);
    }
}
