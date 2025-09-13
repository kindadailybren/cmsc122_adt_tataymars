public class Main {
  public static void main(String[] args) {
    // LinkedList demonstration
    LinkedList list = new LinkedList();

    System.out.println("=====(Linked) List demonstration=====");
    list.pushNode(1);
    list.pushNode(2);
    list.pushNode(3);
    list.pushNode(4);

    System.out.println("Nodes Count: " + list.countNodes());
    list.printAllNodes();

    list.deleteNode(2);
    list.printAllNodes();

    list.pushNode(56);
    list.printAllNodes();

    list.insertNode(2, 2);
    list.printAllNodes();

    list.appendNode(69);
    list.printAllNodes();

    list.printNodeAtIndex(1);
    list.printNodeAtIndex(5);

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
  }
}
