package P2678;

class Solution {
    public int countSeniors(String[] details) {
        int seniorsCounter = 0;

        for (String detail : details) {
            if (Integer.parseInt(detail.substring(11, 13)) > 60) {
                seniorsCounter++;
            }
        }
        return seniorsCounter;
    }
}
