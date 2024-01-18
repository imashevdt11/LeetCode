package P1295;

class Solution {
    public int findNumbers(int[] nums) {
        int counter = 0;

        for (int num: nums) {
            String string = String.valueOf(num);
            if (string.length() % 2 == 0) counter++;
        }
        return counter;
    }
}
