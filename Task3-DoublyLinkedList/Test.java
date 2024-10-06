public class Test {
    public static void main(String[] args) {
        // Create a new DoublyLinkedList instance
        DoublyLinkedList list = new DoublyLinkedList();

        // Test insertion at start
        System.out.println("Inserting 10 at start:");
        list.insertAtStart(10);
        list.printFromStart(); // Expect: 10

        // Test insertion at end
        System.out.println("Inserting 20 at end:");
        list.insertAtEnd(20);
        list.printFromStart(); // Expect: 10 -> 20

        // Test insertion at a specific index
        System.out.println("Inserting 15 at index 1:");
        list.insertAt(15, 1);
        list.printFromStart(); // Expect: 10 -> 15 -> 20

        // Test popping from start
        System.out.println("Popping from start:");
        list.popStart();
        list.printFromStart(); // Expect: 15 -> 20

        // Test popping from end
        System.out.println("Popping from end:");
        list.popEnd();
        list.printFromStart(); // Expect: 15

        // Test inserting at the end again
        System.out.println("Inserting 25 at end:");
        list.insertAtEnd(25);
        list.printFromStart(); // Expect: 15 -> 25

        // Test popping at specific index
        System.out.println("Popping from index 0:");
        list.pop(0);
        list.printFromStart(); // Expect: 25

        // Test inserting multiple elements
        System.out.println("Inserting 30 at start, 35 at end, and 32 at index 1:");
        list.insertAtStart(30);
        list.insertAtEnd(35);
        list.insertAt(32, 1);
        list.printFromStart(); // Expect: 30 -> 32 -> 25 -> 35

        // Test printing from end
        System.out.println("Printing from end:");
        list.printFromEnd(); // Expect: 35 <- 25 <- 32 <- 30

        // Test popping all elements
        System.out.println("Popping all elements:");
        list.pop(0); // Remove 30
        list.pop(0); // Remove 32
        list.pop(0); // Remove 25
        list.pop(0); // Remove 35
        list.printFromStart(); // Expect: List is EMPTY

        // Test popping from empty list
        try {
            System.out.println("Trying to pop from an empty list:");
            list.pop(0); // This should throw an exception
        } catch (EmptyListException e) {
            System.out.println(e.getMessage());
        }
    }
}
