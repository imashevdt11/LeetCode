package P2011;

class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int sum = 0;

        for (String operation: operations) {
            if (operation.equals("X++") || operation.equals("++X")) sum++;
            else sum--;
        }
        return sum;
    }
}
