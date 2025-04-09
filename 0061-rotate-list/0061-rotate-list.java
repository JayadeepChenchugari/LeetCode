/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||k==0){
            return head;
        }
        Node temp=head;
        Node tail=head;
        int length=1;
        while(tail.next!=null){
            tail=tail.next;
            length++;
        }
        if(k%length==0){
            return head;
        }
        k=k%length;
        tail.next=head;
        ListNode newNode=findkthNode(head,length-k);
        head=newNode.next;
        newNode.next=null;
        return head;
    }

    public ListNode findkthNode(ListNode head,int k){
        int cnt=1;
        ListNode temp=head;
        while(temp!=null){
            if(cnt==k){
                return temp;
            }
            cnt++;
            temp=temp.next;
        }
        return temp;
    }
}