package Stack;

public class MyStack {
    private String[] stackArray;
    private int stackSize;
    private int top = -1; // -1 indicate stack isEmpty

    //default constructor
    public MyStack () {
        stackSize = 50;
        stackArray = new String[50];
    }

    public MyStack(int stackSize) {
        stackSize = this.stackSize;
        stackArray = new String[stackSize];

    }

    public void push (String item) {
        if(!isFull()) {
            top++;
            stackArray[top] = item;
        } else {
            System.out.println("Stack is Full");
        }
        System.out.println("Item " + item + " was pushed to the stack");
    }

    public void pushMany (String multipleValues){
        if(!isFull()){
        String[] tempString = multipleValues.split(" ");

        for(int i = 0; i < tempString.length; i++) {
            push(tempString[i]);
        }
        }
    }

    public String pop(){
        if(!isEmpty()){
            System.out.println("Popped " + stackArray[top] + " was removed from the stack");
            return stackArray[top--];
        } else {
            System.out.println("Stack is Empty");
            return "=1";
        }
    }

    public String peek() {
        System.out.println("Peek " + stackArray[top] + " is at top of the stack");
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull(){
        return (top == stackArray.length - 1);
    }

}
