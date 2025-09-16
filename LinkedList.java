class LinkedList {
  LinkedList() {
  }

  Node head; // Declare Head Node

  class Node { // Node Structure with Constructor
    int data;
    Node next;

    Node(int data) { // Constructor
      this.data = data;
      this.next = null;
    }
  }

  void pushNode(int data) { // Push node to head
    Node newNode = new Node(data);
    newNode.next = head;
    head = newNode;
    System.out.println("Pushed a node with data " + data);
  }

  void insertNode(int data, int index) { // insert node at specified index
    Node currNode = head;
    if (index == 0) {
      pushNode(data);
      return;
    }
    if (currNode == null) {
      return; // list is empty, do nothing
    }
    for (int i = 0; currNode != null && i < index - 1; i++) {
      currNode = currNode.next;
    }

    Node newNode = new Node(data);
    newNode.next = currNode.next;
    currNode.next = newNode;
    System.out.println("Inserted " + data + " at index " + index);
  }

  void appendNode(int data) { // append node at the tail of the list
    Node currNode = head;
    Node newNode = new Node(data); // This will be the node that will be appended

    if (currNode == null) {
      head = newNode; // Set head as the new node
      return;
    }
    for (; currNode.next != null;) {
      currNode = currNode.next;
    }

    currNode.next = newNode;
    System.out.println("Appended " + data);
  }

  void deleteNode(int index) { // Delete node at a specified index
    Node currNode = head;
    if (head == null) { // If the head is empty, just return
      return;
    }
    if (index == 0) {
      head = head.next; // Make the next node the head
      return;
    }
    for (int i = 0; currNode != null && i < index - 1; i++) { // Traverses the list
      currNode = currNode.next; // Moves to the next node
    }
    currNode.next = currNode.next.next; // Make the next node be the one after it, essentially deleting it
    System.out.println("Delete Node at index: " + index);
  }

  void printNodeAtIndex(int index) {
    Node currNode = head;
    if (head == null) { // Print Nothing
      return;
    }
    for (int i = 0; i < index; i++) { // Traverse the list until the index
      if (currNode == null) // If nothing, return
        return;
      currNode = currNode.next;
    }
    System.out.println("Index " + index + ": " + currNode.data);
  }

  void printAllNodes() {
    Node currNode = head;
    System.out.print("List: ");
    while (currNode != null) { // Traverse the list
      if (currNode.next != null) {
        System.out.print(currNode.data + ", ");
      } else {
        System.out.print(currNode.data);
      }
      currNode = currNode.next;
    }
    System.out.println();
    System.out.println();
  }
}
