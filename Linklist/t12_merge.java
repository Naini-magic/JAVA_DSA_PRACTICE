

class Solution {
    // Function to sort the given linked list using Merge Sort.
    static Node mergeSort(Node head) {
        // add your code here
        
        if(head == null || head.next == null){
            return head;
        }
        
        Node mid = middle(head);
        
       Node lefthead = head , righthead = mid.next;
       mid.next = null;
       
       
      lefthead =  mergeSort(lefthead);
      righthead = mergeSort(righthead);
        
    return  merge2(lefthead , righthead);
    }
    
    static Node merge2(Node left , Node right){
         if (left == null) return right;
        if (right == null) return left;
        
        Node result;
        
        
            if(left.data < right.data){
             result = left;
            result.next = merge2(left.next, right);
            }
            else{
            result = right;
            result.next = merge2(left, right.next);
            }
          return result;
    }
    static Node middle(Node head){
          if (head == null) return head;
          Node slow = head;
          Node fast = head;
         while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}