class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        if(l2==null) return l1;
        ListNode root=null;
        ListNode curr=null;
        while(l1!=null && l2!=null){
            if(l1.val<=l2.val){
                if(root==null) {root=l1;curr=root;}
                else {root.next=l1;root=root.next;}
                l1=l1.next;
            }
            else{
                if(root==null) {root=l2;curr=root;}
                else {root.next=l2;root=root.next;}
                l2=l2.next;
            }
        }
        
        if(l1!=null){
            root.next=l1;
        }
        else if(l2!=null){
            root.next=l2;
        }
        return curr;
    }
}
