/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode h1, ListNode h2) {
      int li1=0;
      int li2=0;
      ListNode t1=h1;
      ListNode t2=h2;
      while(t1 !=null){
        li1++;
        t1=t1.next;
      } 
      while(t2 !=null){
        li2++;
        t2=t2.next;
      }
      int l=Math.abs(li1-li2);
      t1=h1;
      t2=h2;
      while(l>0){
        if(li1>li2)
        t1=t1.next;
        if(li2>li1)
        t2=t2.next;
        l--;
      }
      while(t1 !=null&&t2 !=null){
        if(t1==t2)
        return t1;
        t1=t1.next;
        t2=t2.next;
      }
      return null;
    }
}