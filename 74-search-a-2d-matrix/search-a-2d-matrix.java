class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       
        for(int i=0;i<matrix.length;i++){
        int ans=(Arrays.binarySearch(matrix[i],target));
        if(ans>=0)
        return true;
        }
        
        return false;
    }
}