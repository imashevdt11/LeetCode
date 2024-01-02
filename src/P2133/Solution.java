package P2133;

import java.util.HashSet;

class Solution {
    public boolean checkValid(int[][] matrix) {

        boolean isValid = true;
        for (int i = 0; i < matrix.length; i++) {
            HashSet<Integer> integers = new HashSet<>();
            for (int j = 0; j < matrix[i].length; j++) {
                integers.add(matrix[i][j]);
            }
            for (int[] ints : matrix) {
                if (integers.contains(ints[i])) {
                    integers.remove(ints[i]);
                } else {
                    isValid = false;
                    break;
                }
            }
            if (!integers.isEmpty()) {
                isValid = false;
                break;
            }
        }
        return isValid;
    }
}