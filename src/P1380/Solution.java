package P1380;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> luckyNumbers = new ArrayList<>();
        int minOrMaxNumberIndex = 0;

        if (matrix.length == 1 && matrix[0].length == 1) luckyNumbers.add(matrix[0][0]);
        else if (matrix.length == 1) {
            int minimumNumber = matrix[0][minOrMaxNumberIndex];
            for (int i = 0; i < matrix[0].length-1; i++) {
                if (matrix[0][minOrMaxNumberIndex] > matrix[0][i+1]) {
                    minOrMaxNumberIndex = i+1;
                    minimumNumber = matrix[0][i+1];
                }
            }
            luckyNumbers.add(minimumNumber);
        }
        else if (matrix[0].length == 1) {
            int maximumNumber = matrix[minOrMaxNumberIndex][0];
            for (int i = 0; i < matrix.length-1; i++) {
                if (matrix[minOrMaxNumberIndex][0] < matrix[i+1][0]) {
                    minOrMaxNumberIndex = i+1;
                    maximumNumber = matrix[i+1][0];
                }
            }
            luckyNumbers.add(maximumNumber);
        } else {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 1; j < matrix[i].length; j++) {
                    if (j == minOrMaxNumberIndex) continue;
                    if (matrix[i][j] < matrix[i][minOrMaxNumberIndex]) minOrMaxNumberIndex = j;
                }
                boolean isLuckyNumber = false;
                for (int j = 0; j < matrix.length; j++) {
                    if (j == i) continue;
                    if (matrix[i][minOrMaxNumberIndex] > matrix[j][minOrMaxNumberIndex]) isLuckyNumber = true;
                    else {
                        isLuckyNumber = false;
                        break;
                    }
                }
                if (isLuckyNumber) luckyNumbers.add(matrix[i][minOrMaxNumberIndex]);
                minOrMaxNumberIndex = 0;
            }
        }
        return luckyNumbers;
    }
}
