package dynamic_stack;

public class DStack {
    int capcity = 2;
    int[] stack = new int[capcity];
    int top = 0;

    public void push(int data) {
        if (size() == capcity)
            expand();
        stack[top] = data;
        top++;

    }

    private void expand() {
        int length = size();
        int[] newStack = new int[capcity * 2];
        System.arraycopy(stack, 0, newStack, 0, length);
        stack = newStack;
        capcity *= 2;
    }

    public int pop() {
        int data = 0;
        if (isEmpty()) {
            System.out.println("Stack is Empty");
        } else {
            top--;
            data = stack[top];
            stack[top] = 0;
            shrink();
        }
        return data;
    }

    private void shrink() {
        int length = size();
        if (length <= (capcity / 2) / 2)
            capcity = capcity / 2;
        int[] newStack = new int[capcity];
        System.arraycopy(stack, 0, newStack, 0, length);
        stack = newStack;
    }

    public int peek() {
        int data;
        data = stack[top - 1];
        return data;
    }

    public int size() {
        return top;
    }

    public boolean isEmpty() {
        return top <= 0;
    }

    public void show() {
        for (int n : stack) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}

