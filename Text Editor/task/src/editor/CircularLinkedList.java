package editor;

public class CircularLinkedList {

    private class Node {
        int value;
        Node nextNode;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node head = null;
    private Node tail = null;
    private Node currentNode = null;

    public void addNode(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            currentNode = head; // track the current node
        } else {
            tail.nextNode = newNode;
        }

        tail = newNode;
        currentNode = tail; // track the current node
        tail.nextNode = head;
    }
}
