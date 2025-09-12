class Stack {
  int[] stackArray;
  int size;
  int top = 0;

  // Constructor
  public Stack(int size) {
    this.size = size; // sets the maximum size of the stack
    stackArray = new int[size];
  }

  // Append on the top of stack
  public void push(int x) {
    if (isFull()) {
      System.out.println("Stack is full, cannot push " + x);
    } else {
      stackArray[top] = x;
      top++;
      System.out.println(x + " has been pushed");
    }
  }

  // Removes the last added element
  public void pop() {
    if (isEmpty()) {
      System.out.println("Stack is empty, cannot pop");
    } else {
      top--;
      System.out.println("Stack popped");
    }
  }

  // Display the last element added
  public void peek() {
    if (isEmpty()) {
      System.out.println("Stack is empty");
    } else {
      System.out.println("The top is " + stackArray[top - 1]);
    }
  }

  // Checks if the stack is full
  public boolean isFull() {
    if (top == size) {
      return true;
    } else {
      return false;
    }
  }

  // Checks if the stack is empty
  public boolean isEmpty() {
    if (top == 0) {
      return true;
    } else {
      return false;
    }
  }
}
