/*
node is defined as  

struct node {
    
    int data;
    struct node *left;
    struct node *right;
  
};
*/

void postOrder( struct node *root) {
    if (root==NULL) { return; }
    postOrder(root->left);
    postOrder(root->right);
    printf("%d ", root->data);
}
