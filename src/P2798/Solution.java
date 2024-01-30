package P2798;

class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int counter = 0;
        for (int hour: hours) {
            if (hour >= target) counter++;
        }
        return counter;
    }
}
