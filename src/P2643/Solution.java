package P2643;

class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] indexOfRowAndNumberOfOnes = {0, 0};

        int onesCount = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    onesCount++;
                }
            }
            if (onesCount > indexOfRowAndNumberOfOnes[1]) {
                indexOfRowAndNumberOfOnes[0] = i;
                indexOfRowAndNumberOfOnes[1] = onesCount;
            }
            onesCount = 0;
        }
        return indexOfRowAndNumberOfOnes;
    }
}
