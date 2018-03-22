package Stack;

public class TheStack {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();

        myStack.push("10");
        myStack.push("20");
        myStack.push("30");
        myStack.push("40");

        myStack.peek();

        myStack.pop();

        myStack.peek();

        myStack.pushMany("50 60 70");

        myStack.peek();

        myStack.pop();

        myStack.peek();
    }
}
