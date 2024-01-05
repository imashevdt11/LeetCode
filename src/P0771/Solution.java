package P0771;

class Solution {
    public int numJewelsInStones(String jewels, String stones) {

        int jewelsCounter = 0;
        String[] jewelsArray = jewels.split("");
        String[] stonesArray = stones.split("");
        for (String jewel: jewelsArray) {
            for (String stone: stonesArray) {
                if (jewel.equals(stone)) {
                    jewelsCounter++;
                }
            }
        }
        return jewelsCounter;
    }
}
