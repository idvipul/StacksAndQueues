package Queue;

public class MyQueue {
    private String[] queueArray;
    private int queueSize;
    private int noOfItems, front, rear = 0;

    // default constructor
    public MyQueue() {
        queueSize = 50;
        queueArray = new String[queueSize];
    }

    // custom constructor
    public MyQueue(int queueSize) {
        this.queueSize = queueSize;
        queueArray = new String[this.queueSize];
    }

    public void enqueue (String item) {
        if(!isFull()) {
            queueArray[rear] = item;
            rear++;
            noOfItems++;
            System.out.println( item + " was inserted into the queue");
        } else {
            System.out.println("Queue is Full");
        }
    }

    public void dequeue() {
        if (!isEmpty()) {
            String item = queueArray[front];
            front++;
            noOfItems--;
            System.out.println(item + " was removed from the queue");
        } else {
            System.out.println("Queue is empty");
        }
    }

    public String peek() {
        System.out.println("The first element in the Queue is " + queueArray[front]);
        return queueArray[front];
    }

    public boolean isFull() {
        if(queueSize == noOfItems) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (noOfItems == 0 ) {
            return true;
        } else {
            return false;
        }
    }
}
