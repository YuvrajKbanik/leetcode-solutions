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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode lp = head;
        ListNode p = head.next;
        ListNode np=head.next.next;
        int firstcp=-1 ;
        int lastcp=-1 ;
        int i=0;
        int min=100000;
        while(np!=null)
        {
            if(lp.val<p.val && np.val<p.val || lp.val>p.val && np.val>p.val)
            {
                if(firstcp==-1)
                {
                    firstcp=i;
                }
                else 
                {
                    min=Math.min(min,i-lastcp);
                }
                lastcp=i;
                
             
            }
            i++;
            lp=lp.next;
            p=p.next;
            np=np.next;

        }
        if(firstcp==lastcp)
        {
            return new int[]{-1,-1};
        }
        else
        {
            return new int[]{min,lastcp-firstcp};
        }
    }
}