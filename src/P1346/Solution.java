package P1346;

class Solution {
    public boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j != i; j++) {
                if (j == arr.length) {
                    j = -1;
                    continue;
                }
                if (arr[i] == 2 * arr[j]) return true;
            }
        }
        return false;
    }
}
