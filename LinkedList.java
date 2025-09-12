class LinkedList {
  LinkedList() {
  }

  Node head;

  class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  void pushNode(int data) {
    Node newNode = new Node(data);
    newNode.next = head;
    head = newNode;
  }

  void insertNode(int data, int index) {
    if (index == 0) {
      pushNode(data);
      return;
    }
    Node currNode = head;
    if (currNode == null) {
      return; // index out of bounds, do nothing (or throw an exception)
    }
    for (int i = 0; currNode != null && i < index - 1; i++) {
      currNode = currNode.next;
    }

    Node newNode = new Node(data);
    newNode.next = currNode.next;
    currNode.next = newNode;
  }

  void appendNode(int data) {
    Node currNode = head;
    Node newNode = new Node(data);

    if (currNode == null) {
      head = newNode; // index out of bounds, do nothing (or throw an exception)
      return;
    }
    for (; currNode.next != null;) {
      currNode = currNode.next;
    }

    currNode.next = newNode;
  }

  void deleteNode(int index) {
    if (head == null) {
      return;
    }
    if (index == 0) {
      head = head.next;
      return;
    }
    Node currNode = head;
    for (int i = 0; currNode != null && i < index - 1; i++) {
      currNode = currNode.next;
    }
    currNode.next = currNode.next.next;
  }

  void printNodeAtIndex(int index) {
    Node currNode = head;
    if (head == null) {
      return;
    }
    for (int i = 0; i < index; i++) {
      if (currNode == null)
        return;
      currNode = currNode.next;
    }
    if (currNode == null)
      return;
    System.out.println("Index " + index + ": " + currNode.data);
  }

  void printAllNodes() {
    Node currNode = head;
    while (currNode != null) {
      if (currNode.next != null) {
        System.out.print(currNode.data + ", ");
      } else {
        System.out.print(currNode.data);
      }
      currNode = currNode.next;
    }
  }

  int countNodes() {
    int nodesCount = 0;
    Node currNode = head;
    while (currNode != null) {
      nodesCount++;
      currNode = currNode.next;
    }
    return nodesCount;
  }

}
