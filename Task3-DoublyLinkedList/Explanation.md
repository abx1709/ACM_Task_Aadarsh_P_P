## Overview
A doubly linked list is a data structure that consists of nodes, where each node contains a data element and pointers to both the next and previous nodes. This allows traversal in both directions (forward and backward). The following functions are implemented in this doubly linked list:

## Functionalities

1. **Insertion**:
   - **`insertAtStart(int data)`**: 
     - This function adds a new node with the specified `data` at the beginning of the list. 
     - If the list is empty, it initializes the `head` and `tail` to point to the new node. 
     - If the list is not empty, it adjusts the pointers of the new node and the current `head` to insert the new node at the start.

   - **`insertAtEnd(int data)`**: 
     - This function adds a new node with the specified `data` at the end of the list. 
     - If the list is empty, it initializes the `head` and `tail` to point to the new node. 
     - Otherwise, it adjusts the pointers of the current `tail` and the new node to link them together.

   - **`insertAt(int data, int index)`**: 
     - This function allows inserting a node with the specified `data` at a specific `index` in the list. 
     - If the `index` is 0, it calls the `insertAtStart` function. 
     - If the `index` position is immediately after the `tail`, the `insertAtEnd` method is called.
     -  If the `index` is out of bounds, an **IndexOutOfBoundsException** is thrown. 
     - It traverses the list to find the specified index and adjusts the pointers to insert the new node.

2. **Deletion**:
   - **`popStart()`**: 
     - This function removes the node at the beginning of the list. 
     - It updates the `head` to point to the next node and, if the list becomes empty, it also updates the `tail` to null. 
     - If the list is already empty, it throws an **EmptyListException**.

   - **`popEnd()`**: 
     - This function removes the node at the end of the list. 
     - It updates the `tail` to point to the previous node and, if the list becomes empty, it also updates the `head` to null. 
     - If the list is empty, it throws an **EmptyListException**.

   - **`pop(int index)`**: 
     - This function removes a node at a specific `index`. 
     - If the `index` is 0, it calls the `popStart` function. 
     - If the `tail` is at `index`, it calls `popEnd` function.
     - If the `index` is out of bounds, an **IndexOutOfBoundsException** is thrown. 
     - It traverses the list to find the specified index and adjusts the pointers to remove the node.

3. **Traversal**:
   - **`printFromStart()`**: 
     - This function traverses the list from `head` to `tail`, collecting the data of each node and printing them in order. 
     - If the list is empty, it indicates that the list is empty.

   - **`printFromEnd()`**: 
     - This function traverses the list from `tail` to `head`, collecting the data of each node and printing them in reverse order. 
     - It also indicates if the list is empty.


## Exception Handling
- The implementation uses **IndexOutOfBoundsException** for invalid index access and a custom exception, **EmptyListException**, for operations on an empty list during insertion or deletion.

## Summary
This implementation provides an efficient way to manage a doubly linked list, allowing for easy insertion, deletion, and movement through nodes in both directions.
