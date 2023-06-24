package leetcode.Strings;

public class sortString {
    public static int[] countSort(int[] A) {
        int n = A.length;
        int mx = -1;
        for(int i = 0 ; i < n ; i++){
            mx = Math.max(mx, A[i]);
        }
        int[] freq = new int[mx + 1];
        for(int i = 0 ; i < n ; i++){
            freq[A[i]] += 1;
        }
        int k = 0;
        for(int i = 0 ; i <= mx ; i++){
            for(int j = 0 ; j < freq[i] ; j++){
                A[k] = i;
                k++;
            }
        }
        return A;
    }
    public static void main(String[] args) {
        int[] array = {4, 2, 2, 8, 3, 3, 1};
        int[] sortedArray = countSort(array);
        
        System.out.println("Sorted Array:");
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }
    }
}


/*
 * public class Solution {
    public int[] solve(int[] A) {
        int n = A.length;
        int mx = -1;
        for(int i = 0 ; i < n ; i++){
            mx = Math.max(mx, A[i]);
        }
        int[] freq = new int[mx + 1];
        for(int i = 0 ; i < n ; i++){
            freq[A[i]] += 1;
        }
        int k = 0;
        for(int i = 0 ; i <= mx ; i++){
            for(int j = 0 ; j < freq[i] ; j++){
                A[k] = i;
                k++;
            }
        }
        return A;
    }


            int n = A.length;
        //check the constraints
        int count[] = new int[1000000];
        for(int i = 0;i<n;i++){
            count[A[i]]++;
        }

        int ans[] = new int[n];
        int index =  0;
        for(int i = 0;i<1000000;i++){
            for(int j = 1;j<=count[i];j++){
                ans[index] = i;
                index++;
            }
        }
        return ans;
}
 */
