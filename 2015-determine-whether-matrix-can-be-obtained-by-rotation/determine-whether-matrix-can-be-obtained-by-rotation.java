class Solution {

    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;

        for (int r = 0; r < 4; r++) {

            if (areEqual(mat, target)) return true;

            // Rotate 90° clockwise

            // Transpose
            for (int i = 0; i < n; i++) {
                for (int j = i; j < n; j++) {
                    int temp = mat[i][j];
                    mat[i][j] = mat[j][i];
                    mat[j][i] = temp;
                }
            }

            // Reverse each row
            for (int k = 0; k < n; k++) {
                reverse(mat[k]);
            }
        }

        return false;
    }

    public boolean areEqual(int[][] a, int[][] b) {
        int n = a.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] != b[i][j]) return false;
            }
        }
        return true;
    }

    public static void reverse(int[] row) {
        int l = 0, r = row.length - 1;

        while (l < r) {
            int temp = row[l];
            row[l] = row[r];
            row[r] = temp;
            l++;
            r--;
        }
    }
}