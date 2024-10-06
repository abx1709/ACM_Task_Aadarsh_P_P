SinglyLinkedListNode* removeDuplicates(SinglyLinkedListNode* llist) {
    
    if (llist==NULL) {
        return llist;
    }
    
    SinglyLinkedListNode* node = llist;
    
    int lastData = node->data;
    while (node->next!=NULL) {
        if (node->next->data==lastData) {
            node->next=node->next->next;
        } else {
            node = node->next;
            lastData = node->data;
        }
    }
    
    return llist;

}
