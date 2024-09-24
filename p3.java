/*Given two arrays arr1[] and arr2[], the task is to find the number of elements in the union between these two arrays.

The Union of the two arrays can be defined as the set containing distinct elements from both arrays. If there are repetitions, then only one element occurrence should be there in the union.

Note: Elements are not necessarily distinct.*/



class Solution {
    public static int doUnion(int arr1[], int arr2[]) {
        // Your code here
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    
    int i = 0 , j = 0 ;
    int lastadd = Integer.MIN_VALUE ;
    int count = 0;
    
    while(i < arr1.length && j < arr2.length){
        if(arr1[i] < arr2[j]){
            if(arr1[i] != lastadd){
                count++ ;
                lastadd = arr1[i];
            }
            i++;
        }else if(arr1[i] > arr2[j]){
            if(arr2[j] != lastadd){
                count++ ;
                lastadd = arr2[j];
            }
            j++;
        }
        else{
            if(arr1[i] != lastadd){
                count++;
                lastadd = arr1[i];
            }
            i++;
            j++;
        }
        }
        while(i < arr1.length){
            if(arr1[i] != lastadd){
                count++;
                lastadd = arr1[i];
            }
            i++;
        }
          while(j < arr2.length){
            if(arr2[j] != lastadd){
                count++;
                lastadd = arr2[j];
            }
            j++;
        }
        return count;
    }

        }
