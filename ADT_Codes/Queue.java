class Queue {
  int[] arrayQueue;
  int count, front, rear;

  public Queue() {
    arrayQueue = new int[5];
    count = 0;
    front = 0;
    rear = -1;
  }

  public void enqueue(int x) {
    if (count == arrayQueue.length) {

      int[] newQueue = new int[arrayQueue.length * 2];

      for (int i = 0; i < arrayQueue.length; i++) {
        newQueue[i] = arrayQueue[(front + i) % arrayQueue.length];
      }
      arrayQueue = newQueue;
      front = 0;
      rear = count - 1;
    }
    rear = (rear + 1) % arrayQueue.length;
    arrayQueue[rear] = x;
    count++;
    System.out.println(x + " has been enqueued!");

  }

  public void dequeue() {
    if (isEmpty()) {
      System.out.println("Queue is empty, cannot dequeue!");
    } else {
      int removed = arrayQueue[front];
      front = (front + 1) % arrayQueue.length;
      count--;
      System.out.println(removed + " has been dequeued!");

    }
  }

  public void peek() {
    if (isEmpty()) {
      System.out.println("Queue is empty, nothing to peek!");
    } else {
      System.out.println("The front is " + arrayQueue[front]);

    }
  }

  public boolean isEmpty() {
    if (count == 0) {
      return true;
    } else {
      return false;
    }
  }

}
