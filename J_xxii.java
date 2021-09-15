class node {
    int data;
    node next;
    node prev;
}

class LinkedList {
    node head;
    node tail;
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
        node newnode = new node();
        newnode.data = data;
        newnode.next = null;
        newnode.prev = null;
        if (head == null) {
            head = newnode;
            tail = newnode;
        } else {
            tail.next = newnode;
            newnode.prev = tail;
            tail = newnode;
        }
        size++;
    }
    public void printList() {
        node current = head;
        while (current != null) {
            System.out.print(current.data + " <--> ");
            current = current.next;
        }
        System.out.println();
    }
    public void remove(int data) {
        node current = head;
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
        node newnode = new node();
        newnode.data = data;
        if (index == 0) {
            newnode.next = head;
            newnode.prev = null;
            head = newnode;
            if (head.next != null) {
                head.next.prev = newnode;
            } else {
                tail = newnode;
            }
            size++;
            return;
        }
        node current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        newnode.next = current.next;
        newnode.prev = current;
        current.next = newnode;
        if (newnode.next != null) {
            newnode.next.prev = newnode;
        } else {
            tail = newnode;
        }
        size++;
    }
}

public class J_xxii {
    public static void main(String[] args) {

    }
}
