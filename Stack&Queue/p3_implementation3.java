// implementation by array

// public class p3_implementation3 {
    
// }

public class p3_implementation3 {
    private int maxSize;
    private long[] stackArray;
    private int top;
    
    public p3_implementation3(int s) {
       maxSize = s;
       stackArray = new long[maxSize];
       top = -1;
    }
    public void push(long j) {
       stackArray[++top] = j;
    }
    public long pop() {
       return stackArray[top--];
    }
    public long peek() {
       return stackArray[top];
    }
    public boolean isEmpty() {
       return (top == -1);
    }
    public boolean isFull() {
       return (top == maxSize - 1);
    }
    public static void main(String[] args) {
      p3_implementation3 theStack = new p3_implementation3(10); 
       theStack.push(10);
       theStack.push(20);
       theStack.push(30);
       theStack.push(40);
       theStack.push(50);
       
       while (!theStack.isEmpty()) {
          long value = theStack.pop();
          System.out.print(value);
          System.out.print(" ");
       }
       System.out.println("");
    }
 }
