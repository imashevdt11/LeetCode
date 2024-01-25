package P2660;

class Solution {
    public int isWinner(int[] player1, int[] player2) {
        int player1Score = player1[0];
        int player2Score = player2[0];

        if (player1.length > 1) {
            for (int i = 1; i < player1.length; i++) {
                if (player1[i - 1] >= 10) player1Score += player1[i] * 2;
                else if (i >= 2 && player1[i - 2] >= 10) player1Score += player1[i] * 2;
                else player1Score += player1[i];

                if (player2[i - 1] >= 10) player2Score += player2[i] * 2;
                else if (i >= 2 && player2[i - 2] >= 10) player2Score += player2[i] * 2;
                else player2Score += player2[i];
            }
        }
        if (player1Score > player2Score) return 1;
        else if (player1Score < player2Score) return 2;
        else return 0;
    }
}
