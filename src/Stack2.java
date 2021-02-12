class Stack2 {
    private final int[] arr;
    private int top;
    private final int capacity;

    Stack2(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    private void push(int item) {
        if (isFull()) {
            System.out.println("stack is full");
        } else {
            System.out.println("Inserting" + item);
            arr[++top] = item;
        }
    }

    private int pop() {
        if (isEmpty()) {
            System.out.println("stack is Empty");
            System.exit(1);
        }

        System.out.println("Popping" + arr[top]);
        return arr[top--];
    }

    private Boolean isFull() {
        return size() == capacity;
    }

    private Boolean isEmpty() {
        return top == -1;
    }

    private void peek() {
        if(!isEmpty()){
            System.out.println("top most" + arr[top]);
        }else {
            System.out.println("No peek item");
        }
    }

    // number of elements in array
    private int size() {
        System.out.println("Size" + (top + 1));
        return top + 1;
    }

    public static void main(String[] args) {
        Stack2 s1 = new Stack2(4);
        for (int i = 0; i < 5; i++) {
            s1.push(i);
        }

        for (int i = 0; i < 5; i++) {
            s1.pop();
        }

        s1.peek();
        System.out.println("hell peeking");
    }

}
