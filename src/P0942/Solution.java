package P0942;

class Solution {
    public int[] diStringMatch(String s) {
        int[] array = new int[s.length()+1];
        char[] iANDd = s.toCharArray();

        int max = s.length();
        int min = 0;

        for (int i = 0; i < array.length; i++) {
            if (i == array.length-1) {
                if (max > 0) array[i] = max;
                else if (min > 0) array[i] = min;
            } else {
                if (iANDd[i] == 'I') {
                    array[i] = min;
                    min++;
                } else {
                    array[i] = max;
                    max--;
                }
            }
        }
        return array;
    }
}