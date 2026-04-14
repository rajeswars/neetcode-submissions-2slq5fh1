/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */

class Solution {
public:
    void reorderList(ListNode* head) 
    {
        ListNode* curr = head;

        while(curr != NULL && curr->next != NULL)
        {
            ListNode* last = curr;
            while(last -> next != NULL && last -> next -> next != NULL)
            {
                last = last -> next;
            }

            ListNode* tail = last -> next;
            if(tail == NULL) break;
            last -> next = NULL;

            tail -> next = curr -> next;
            curr -> next = tail;

            curr = tail -> next;
        }
    }
};
