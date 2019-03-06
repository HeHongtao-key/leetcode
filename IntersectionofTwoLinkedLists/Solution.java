package IntersectionofTwoLinkedLists;

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
        int aLen = 0, bLen = 0;
        ListNode temp = headA;
        while(temp != null){
            aLen++;
            temp = temp.next;
        }

        temp = headB;
        while(temp != null){
            bLen++;
            temp = temp.next;
        }

        if(aLen > bLen){
            for(int i = 0; i < aLen - bLen; i++){
                headA = headA.next;
            }
        }else{
            for(int i = 0; i < bLen - aLen; i++){
                headB = headB.next;
            }
        }

        while (headA != headB){
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }

    /**
     定义两个指针, 第一轮让两个到达末尾的节点指向另一个链表的头部, 最后如果相遇则为交点(在第一轮移动中恰好抹除了长度差)
     两个指针等于移动了相同的距离, 有交点就返回, 无交点就是各走了两条指针的长度
     **/
    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
        ListNode pA = headA, pB = headB;
        while( pA != pB){
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }
        return pA;
    }
}
