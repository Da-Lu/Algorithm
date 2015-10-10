/*author: dalu*/
/*date: 10/10/15*/
public int removeDuplicates(int[] A) {

        if(A.length==0) return 0;
        
        int insertIndex = 1;
        for(int i = 0; i < A.length; i++)
        {
            if(A[i]!=A[insertIndex-1]) A[insertIndex++] = A[i];
        }
        return insertIndex;
}

