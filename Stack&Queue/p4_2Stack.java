public class p4_2Stack {
   
    private int maxSize;
    private int[] stackArray;
    private int top1, top2;
    
    public p4_2Stack(int s) {
      maxSize = s;
      stackArray = new int[maxSize];
      top1 = -1;
      top2 = maxSize; 
  }
  

    public boolean isFull() {
        return (top1 + 1 == top2);
     }

    public void push1(int j) {
        if(isFull()){
            System.out.println("Stack is full");
            return;
        }
       stackArray[++top1] = j;
    }
    public void push2(int k) {
        if(isFull()){
            System.out.println("Stack is full");
            return;
        }
       stackArray[--top2] = k;
    }
    public int pop1() {
       if(top1 == -1){
        System.out.println("Stack1 is empty");
        return -1;
       }
       return stackArray[top1--];
    }
    public int pop2() {
       if(top2 == maxSize){
        System.out.println("Stack2 is empty");
        return -1;
       }
       return stackArray[top2++];
    }
    
    public static void main(String[] args) {
      p4_2Stack theStack = new p4_2Stack(10);
      theStack.push1(1);
      theStack.push2(2);
      System.out.println(theStack.pop1()); // Output: 1
      theStack.push1(3);
      System.out.println(theStack.pop1()); // Output: 3
      System.out.println(theStack.pop1()); // Output: -1 (stack1 is empty)
  }
 }

