
class Solution {
    static final int MOD = 1000000007;
public long multiplyTwoLists(Node num1, Node num2) {
    // Code here
    
    int l1 = 0 , l2 = 0;
    
 while(num1 != null){
    l1 = (l1 * 10  + num1.data) % MOD;
    num1 = num1.next;
 }
 
 while(num2 != null){
     l2 = (l2 * 10 + num2.data ) % MOD;
     num2 = num2.next;
 }
 
 return (l1 * l2) % MOD;
}
}