/**
 * What are the pros and cons of doing this in two for-loops? Would it have been
 * more efficient to do it in place using a quicksort algorithm and is that something we should
 * already know how to do?
 * 
 * Time Estimate: 20 minutes
 */
class Solution {
    public int[] sortArrayByParity(int[] A) {
        int[] result = new int[A.length];
        int counter = -1;
        
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                result[++counter] = A[i];
            }
        }
        
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 != 0) {
                result[++counter] = A[i];
            }
        }
        
        return result;
    }
}