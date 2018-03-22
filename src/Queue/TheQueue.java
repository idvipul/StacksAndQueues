package Queue;

public class TheQueue {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();

        myQueue.enqueue("10");
        myQueue.enqueue("20");
        myQueue.enqueue("30");

        myQueue.dequeue();
        myQueue.peek();

    }
}
