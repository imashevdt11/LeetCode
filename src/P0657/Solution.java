package P0657;

class Solution {
    public boolean judgeCircle(String moves) {
        int left = 0;
        int right = 0;
        int up = 0;
        int down = 0;

        for (int i = 0; i < moves.length(); i++) {
            switch (moves.charAt(i)) {
                case 'L' -> left++;
                case 'R' -> right++;
                case 'U' -> up++;
                case 'D' -> down++;
            }
        }
        return left == right && up == down;
    }
}
