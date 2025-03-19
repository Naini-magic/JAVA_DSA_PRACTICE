import java.util.Stack;

public class p9_minElement {
    class stack{
    
    Stack<Integer> minStack = new Stack<>();
	public void push(int a,Stack<Integer> s)
	{
	    //add code here.
	    s.push(a);
	    if(minStack.isEmpty() || a <= minStack.peek()){
	        minStack.push(a);
	    }
	}
	public int pop(Stack<Integer> s)
        {
            //add code here.
            if(s.isEmpty()) return -1;
            int removed = s.pop();
            if(removed == minStack.peek()){
                minStack.pop();
            }
                return removed;
	}
	public int min(Stack<Integer> s)
        {
           //add code here.
           if(minStack.isEmpty()){
               return -1;
           }else{
              return minStack.pop();
           }
	}
	public boolean isFull(Stack<Integer>s, int n)
        {
           //add code here.
          return s.size() == n;
	}
	public boolean isEmpty(Stack<Integer>s)
        {
           //add code here.
           return s.isEmpty();
           
	}
}
    public static void main(String[] args) {
        
    }
}
