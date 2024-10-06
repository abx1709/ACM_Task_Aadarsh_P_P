## Problem Overview
Implement pre-order traversal of a binary tree, printing the node values in a single line, separated by spaces.

## Initialization
The function takes a pointer to the root of the binary tree as a parameter.

## Looping Through Nodes
The pre-order traversal is performed recursively:

1. **Base Case**: If `root` is `NULL`, return immediately.

2. **Recursive Steps**:
   - Print the current node's value (`root->data`) followed by a space.
   - Call `preOrder` on the left subtree (`root->left`).
   - Call `preOrder` on the right subtree (`root->right`).

## Final Result
Output the node values in pre-order sequence (root-left-right) as a single line of space-separated values.
