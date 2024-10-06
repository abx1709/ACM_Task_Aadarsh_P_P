## Problem Overview
The task is to merge two sorted singly linked lists into a single sorted linked list. Each list is represented by a pointer to its head, and either pointer may be `NULL`, indicating an empty list.

## Initialization
A temporary node is initialized to facilitate the merging process:

- **head**: A dummy node to build the new sorted list.
- **tail**: A pointer to keep track of the last node in the merged list, initialized to point to `head`.

## Looping Through Input
A while loop is used to traverse both linked lists until one of them is exhausted:

- **Comparison**: Compare the current nodes of both lists. 
  - If `head1`'s data is less than or equal to `head2`'s data, append `head1` to the merged list and move `head1` to the next node.
  - Otherwise, append `head2` to the merged list and move `head2` to the next node.
  
After the loop, if one list is not fully traversed, the remaining nodes are attached to the merged list.

## Final Result
The merged sorted linked list is returned, starting from `head.next` to skip the dummy node.

## Example
### Input
Given two linked lists:  
List 1: `1 -> 3 -> 5 -> NULL`  
List 2: `2 -> 4 -> 6 -> NULL`

### Steps Taken
1. Compare `1` and `2`. Append `1` to the merged list.
2. Compare `3` and `2`. Append `2`.
3. Compare `3` and `4`. Append `3`.
4. Append `4` and continue until both lists are merged.

### Expected Output
The merged linked list: `1 -> 2 -> 3 -> 4 -> 5 -> 6 -> NULL`.

## Conclusion
This method merges two sorted linked lists with a time complexity of O(n + m), where n and m are the lengths of the two lists. The space complexity is O(1) as it uses a fixed amount of extra space.
