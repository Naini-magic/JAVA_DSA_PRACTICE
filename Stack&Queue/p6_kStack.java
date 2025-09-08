public class p6_kStack {
    int arr[];
    int top[];
    int next[];
    int k, n;
    int free;

    p6_kStack(int k, int n) {
        this.k = k;
        this.n = n;
        arr = new int[n];
        top = new int[k];
        next = new int[n];

        // Initialize all stacks as empty
        for (int i = 0; i < k; i++) {
            top[i] = -1;
        }

        // Initialize the next array
        for (int i = 0; i < n - 1; i++) {
            next[i] = i + 1;
        }
        next[n - 1] = -1; // -1 means no more free slots

        // First free slot is at index 0
        free = 0;
    }

    // Check if stack is full
    boolean isFull() {
        return free == -1;
    }

    // Check if a stack is empty
    boolean isEmpty(int sn) {
        return top[sn] == -1;
    }

    void push(int x , int sn){
        if(isFull()){
            System.out.println("stack overflow");
            return;
        }

          // Get the first free index
          int i = free;
        
          // Update free to the next available free index
          free = next[i];
  
          // Insert element into the array
          arr[i] = x;
  
          // Update next array to link the previous top of stack
          next[i] = top[sn];
  
          // Update the top of stack
          top[sn] = i;
    }

    int pop(int sn){
        if(isEmpty(sn)){
            System.out.println("Stck Underflow");
            return -1;
        }

         // Get the index of top element of stack
         int i = top[sn];

         // Update top of stack to the previous element
         top[sn] = next[i];
 
         // Attach the popped index to free list
         next[i] = free;
         free = i;
 
         return arr[i];
    }

     // Function to get the top element of a specific stack
     int peek(int sn) {
        if (isEmpty(sn)) {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top[sn]];
    }

    public static void main(String[] args) {
        int k = 3, n = 10;
        p6_kStack ks = new p6_kStack(k, n);

        ks.push(10, 0);
        ks.push(20, 0);
        ks.push(30, 1);
        ks.push(40, 1);
        ks.push(50, 2);
        ks.push(60, 2);

        System.out.println("Popped from stack 0: " + ks.pop(0)); // 20
        System.out.println("Popped from stack 1: " + ks.pop(1)); // 40
        System.out.println("Popped from stack 2: " + ks.pop(2)); // 60

        System.out.println("Top of stack 0: " + ks.peek(0)); // 10
        System.out.println("Top of stack 1: " + ks.peek(1)); // 30
        System.out.println("Top of stack 2: " + ks.peek(2)); // 50
    }
}
