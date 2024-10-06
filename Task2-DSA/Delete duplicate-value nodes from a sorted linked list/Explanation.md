## Problem Overview
The goal is to remove duplicate nodes from a sorted singly linked list. The input is the head of the linked list, and the output is the head of the modified linked list with unique values.

## Initialization
Two variables are initialized before processing:

- **node**: A pointer to iterate through the linked list, starting from the head (`llist`).
- **lastData**: Stores the value of the last unique node, initialized to the head node’s data.

## Looping Through Input
A while loop is used to traverse the linked list until the end is reached:

- **Check for Duplicates**: If the next node's data matches `lastData`, the duplicate node is skipped. Otherwise, move to the next node and update `lastData`.

## Final Result
The head of the modified linked list is returned, containing only unique values.

## Example
### Input
Given the linked list: `1 -> 1 -> 2 -> 3 -> 3 -> 4 -> NULL`.

### Steps Taken
1. Start at `1`. Skip the next `1` (duplicate).
2. Move to `2`. Update `lastData`.
3. Move to `3`. Update `lastData`.
4. Skip the next `3` (duplicate).
5. Move to `4`. Update `lastData`.
6. End of the list reached.

### Expected Output
The modified linked list: `1 -> 2 -> 3 -> 4 -> NULL`.

## Conclusion
This approach efficiently removes duplicates with a time complexity of O(n), where n is the number of nodes. The space complexity is O(1) since no extra data structures are used. Edge cases such as an empty list or all identical values are also handled.
