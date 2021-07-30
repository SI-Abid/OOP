class Node {
    int data;
    Node next;
    Node prev;
}

class LinkedList {
    Node head;
    Node tail;
    int size;
    public LinkedList() {
        head = null;
        tail = null;
        size = 0;
    }
    public LinkedList(int ... nums) {
        head = null;
        tail = null;
        size = 0;
        for (int i = 0; i < nums.length; i++) {
            add(nums[i]);
        }
    }
    public void add(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;
        newNode.prev = null;
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " <--> ");
            current = current.next;
        }
        System.out.println();
    }
    public void remove(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                } else {
                    tail = current.prev;
                }
                size--;
                return;
            }
            current = current.next;
        }
    }
    public void insert(int data, int index) {
        Node newNode = new Node();
        newNode.data = data;
        if (index == 0) {
            newNode.next = head;
            newNode.prev = null;
            head = newNode;
            if (head.next != null) {
                head.next.prev = newNode;
            } else {
                tail = newNode;
            }
            size++;
            return;
        }
        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        newNode.next = current.next;
        newNode.prev = current;
        current.next = newNode;
        if (newNode.next != null) {
            newNode.next.prev = newNode;
        } else {
            tail = newNode;
        }
        size++;
    }
}

public class J_xxii {
    public static void main(String[] args) {

    }
}
