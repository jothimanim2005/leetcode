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
    public boolean isPalindrome(ListNode h) {
        List<Integer> a=new ArrayList<>();
        while(h!=null){
            a.add(h.val);
            h=h.next;

        }
        int l=0;
        int r=a.size()-1;
        while(l<r){
            if(a.get(l)!=a.get(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}