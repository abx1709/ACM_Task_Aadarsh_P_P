class Node {
    
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class DoublyLinkedList {
    
    Node head;
    Node tail;

    public DoublyLinkedList() {
        head = null;
        tail = null;
    }

    public void insertAtStart(int data) {
        if (head == null) {
            head = new Node(data);
        } else {
            Node node = new Node(data);
            node.next = head;
            head.prev = node;
            head = node;
        }
        if (tail == null) {
            tail = head;
        }
    }

    public void insertAtEnd(int data) {
        if (tail == null) {
            tail = new Node(data);
        } else {
            Node node = new Node(data);
            node.prev = tail;
            tail.next = node;
            tail = node;
        }
        if (head == null) {
            head = tail;
        }
    }

    public void insertAt(int data, int index) {
        if (index == 0) {
            this.insertAtStart(data);
            return;
        }

        Node node = new Node(data);
        Node temp = head;
        for (int i = 0; i < index; i++) {
            if (temp == null) {
                throw new IndexOutOfBoundsException("Index " + index + " is out out bound for inserting into list of size " + this.size());
            }
            temp = temp.next;
        }

        if (temp == null) {
            this.insertAtEnd(data);
            return;
        }

        node.prev = temp.prev;
        node.next = temp;
        if (temp.prev != null) {
            temp.prev.next = node;
        }
        temp.prev = node;
    }

    public void popStart() {
        if (head == null) {
            throw new EmptyListException("Cannot pop from an empty list");
        }
        Node newHead = head.next;
        if (newHead != null) {
            newHead.prev = null;
        }

        head.next = null;
        head.prev = null;
        head = newHead;
        if (head == null) {
            tail = null;
        }
    }

    public void popEnd() {
        if (tail == null) {
            throw new EmptyListException("Cannot pop from an empty list");
        }
        Node newTail = tail.prev;
        if (newTail != null) {
            newTail.next = null;
        }

        tail.next = null;
        tail.prev = null;
        tail = newTail;
        if (tail == null) {
            head = null;
        }
    }

    public void pop(int index) {
        if (index == 0) {
            this.popStart();
            return;
        }

        Node temp = head;
        for (int i = 0; i < index; i++) {
            if (temp == null) {
                throw new IndexOutOfBoundsException("Index " + index + " is out out bound for popping from list of size " + this.size());
            }
            temp = temp.next;
        }

        if (temp == null) {
            throw new IndexOutOfBoundsException("Index " + index + " is out out bound for popping from list of size " + this.size());
        }
        if (temp == tail) {
            this.popEnd();
            return;
        }

        if (temp.prev != null) {
            temp.prev.next = temp.next;
        }
        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }
        temp.next = null;
        temp.prev = null;
    }

    private int size() {
        int count = 0;
        Node currentNode = head;
        while (currentNode!=null) {
            count++;
            currentNode = currentNode.next;
        }
        return count;
    }

    public void printFromStart() {
        if (head == null) {
            System.out.println("List is EMPTY");
            return;
        }

        Node currentNode = head;
        StringBuilder output = new StringBuilder();

        while (currentNode != null) {
            output.append(currentNode.data);
            currentNode = currentNode.next;
            if (currentNode != null) {
                output.append(" -> ");
            }
        }

        System.out.println("List from start: " + output);
    }

    public void printFromEnd() {
        if (tail == null) {
            System.out.println("List is EMPTY");
            return;
        }

        Node currentNode = tail;
        StringBuilder output = new StringBuilder();

        while (currentNode != null) {
            output.append(currentNode.data);
            currentNode = currentNode.prev;
            if (currentNode != null) {
                output.append(" <- ");
            }
        }

        System.out.println("List from end: " + output);
    }

}

class EmptyListException extends RuntimeException {
     EmptyListException(String message) {
        super(message);
    }
}
