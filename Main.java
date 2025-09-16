public class Main {
  public static void main(String[] args) {
    // Stack demonstration
    System.out.println();
    System.out.println("=====Stack demonstration=====");
    Stack stack = new Stack(3);
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.pop();
    stack.peek();
    stack.pop();
    stack.pop();
    stack.pop();

    // Queue demonstration
    System.out.println();
    System.out.println("=====Queue demonstration=====");
    Queue queue = new Queue();
    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);
    queue.enqueue(4);
    queue.enqueue(5);
    queue.enqueue(6);
    queue.dequeue();
    queue.peek();
    queue.dequeue();
    queue.peek();
    queue.dequeue();
    queue.dequeue();
    queue.dequeue();
    queue.dequeue();
    queue.dequeue();

    String[] Cards = { "W", "F", "G", "S", "L", "C", "I", "B" };
    CRDeck deck = new CRDeck(Cards);
    deck.printCards();
  }
}
