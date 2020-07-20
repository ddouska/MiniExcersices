package gr.codehub.MiniExcersises.secondExc;

public class Stack {

    //4. 5. Stack - Reverse Stack
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty() {
        return (top < 0);
    }

    Stack(int size) {
        top = -1;
    }

    public boolean push(int x) {
        if (top >= (MAX - 1)) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            a[++top] = x;
            System.out.println(x + " pushed into stack");
            return true;
        }
    }

    public int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = a[top--];
            return x;
        }
    }

    int peek() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = a[top];
            return x;
        }
    }

    public static String reverse(String str) {
        char[] charArr = str.toCharArray();
        int size = charArr.length;
        Stack st = new Stack(size);

        for (int i = 0; i < size; i++) {
            st.push(charArr[i]);
        }

        for (int j = 0; j < size; j++) {
            charArr[j] = (char) st.pop();
        }
        return String.valueOf(charArr);
    }

    public static void main(String[] args) {
        int size = 0;
        Stack s = new Stack(size);
        s.push(5);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");

    }
}
