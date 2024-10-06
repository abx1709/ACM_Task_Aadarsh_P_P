## Problem Overview
Implement in-order traversal of a binary tree, printing the node values in a single line, separated by spaces.

## Initialization
The function takes a pointer to the root of the binary tree as a parameter.

## Looping Through Nodes
The in-order traversal is performed recursively:

1. **Base Case**: If `root` is `NULL`, return immediately.
  
2. **Recursive Steps**:
   - Call `inOrder` on the left subtree (`root->left`).
   - Print the current node's value (`root->data`) followed by a space.
   - Call `inOrder` on the right subtree (`root->right`).

## Final Result
Output the node values in in-order sequence (left-root-right) as a single line of space-separated values.
