## Problem Overview
Implement post-order traversal of a binary tree, printing the node values in a single line, separated by spaces.

## Initialization
The function takes a pointer to the root of the binary tree as a parameter.

## Looping Through Nodes
The post-order traversal is performed recursively:

1. **Base Case**: If `root` is `NULL`, return immediately.

2. **Recursive Steps**:
   - Call `postOrder` on the left subtree (`root->left`).
   - Call `postOrder` on the right subtree (`root->right`).
   - Print the current node's value (`root->data`) followed by a space.

## Final Result
Output the node values in post-order sequence (left-right-root) as a single line of space-separated values.
