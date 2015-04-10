public class Solution {
    public int removeDuplicates(int[] A) {
        if(A.length == 0) return 0;
        if(A.length == 1) return 1;
        
        int insertIndex = 2;
        for(int i = 2; i< A.length; i++)
        {
            if(A[i]!=A[insertIndex-2]) A[insertIndex++] = A[i];
        }
        return insertIndex;
    }
}