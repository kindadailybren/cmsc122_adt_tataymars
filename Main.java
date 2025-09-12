public class Main {
  public static void main(String[] args) {
    // LinkedList demonstration
    LinkedList list = new LinkedList();

    list.pushNode(1);
    list.pushNode(2);
    list.pushNode(3);
    list.pushNode(4);

    System.out.println(list.countNodes());
    list.printAllNodes();

    System.out.println("");

    list.deleteNode(2);
    list.printAllNodes();

    System.out.println("");

    list.insertNode(2, 1);
    list.printAllNodes();
    System.out.println();

    // Stack demonstration
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
  }
}
