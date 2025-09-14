class Queue {
  int[] arrayQueue;
  int size;
  int count, front, rear;

  public Queue(int size) {
    this.size = size;
    arrayQueue = new int[size];
    count = 0;
    front = 0;
    rear = -1;
  }

  public void enqueue(int x) {
    if (isFull()) {
      System.out.println("Queue is full, cannot enqueue " + x);
    } else {
      rear = (rear + 1) % size;
      arrayQueue[rear] = x;
      System.out.println(x + " has been enqueued!");
      count++;
    }
  }

  public void dequeue() {
    if (isEmpty()) {
      System.out.println("Queue is empty, cannot dequeue!");
    } else {
      int removed = arrayQueue[front];
      front = (front + 1) % size;
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

  public boolean isFull() {
    if (size == count) {
      return true;
    } else {
      return false;
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
