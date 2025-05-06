import java.util.Scanner;



/*Find Equilibrium Point
You are given a 
0
−
i
n
d
e
x
e
d
0−indexed integer array 
n
u
m
s
nums. Your task is to find the leftmost equilibrium index in the array. An equilibrium index is defined as an index 
i
i such that the sum of the elements to the left of 
i
i is equal to the sum of the elements to the right of 
i
i.

Formally, the equilibrium index 
i
i satisfies the condition:

s
u
m
(
n
u
m
s
[
0
]
+
n
u
m
s
[
1
]
+
.
.
.
+
n
u
m
s
[
i
−
1
]
)
=
s
u
m
(
n
u
m
s
[
i
+
1
]
+
n
u
m
s
[
i
+
2
]
+
.
.
.
+
n
u
m
s
[
n
u
m
s
.
l
e
n
g
t
h
−
1
]
)
sum(nums[0]+nums[1]+...+nums[i−1])=sum(nums[i+1]+nums[i+2]+...+nums[nums.length−1])

Conditions:

If 
i
i is 
0
0, the left sum is considered 
0
0.
If 
i
i is 
(
n
−
1
)
(n−1), the right sum is considered 
0
0.
Input Format
The first line of input will contain a single integer 
T
T, denoting the number of test cases.
Each test case consists of two lines of input:
The first line contains an integer 
N
N, length of array.
The next line contain an array 
n
u
m
s
nums of length 
N
N. */
public class t13 {
    public static int Equilibrium(int arr[]){
        
        int sum = 0;
        int left = 0;
        for(int i = 0 ; i < arr.length ;i++){
            sum += arr[i];
        }
        
        
        for( int i = 0 ; i < arr.length ; i++){
            
            sum -= arr[i];
            if(left == sum){
                return i;
            }
            left += arr[i];
        }
        
        return -1;
    }

    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t > 0){
        int n = sc.nextInt();
          int arr[] = new int[n];
          for(int i = 0 ; i < arr.length ; i++){
              arr[i] = sc.nextInt();
          }
          
          System.out.println(Equilibrium(arr));
          t--;
        }
    }
}


