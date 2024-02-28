package P2515;

class Solution {
    public int closetTarget(String[] words, String target, int startIndex) {
        int rightStepsCount = 0;
        int leftStepsCount = 0;

        for (int i = startIndex; i < words.length; i++) {
            if (words[i].equals(target)) break;
            rightStepsCount++;
            if (i == words.length-1) i = -1;
            if (rightStepsCount == words.length) {
                rightStepsCount = -1;
                break;
            }
        }

        for (int i = startIndex; i >= 0; i--) {
            if (words[i].equals(target)) break;
            leftStepsCount++;
            if (i == 0) i = words.length;
            if (leftStepsCount == words.length) {
                leftStepsCount = -1;
                break;
            }
        }
        return Math.min(rightStepsCount, leftStepsCount);
     }
}