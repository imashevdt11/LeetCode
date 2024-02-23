package P0997;

import java.util.*;

class Solution {
    public int findJudge(int n, int[][] trust) {
        if (trust.length == 0 && n == 1) {
            return n;
        } else if (trust.length == 0 && n > 1) {
            return -1;
        }
        List<Integer> judgeCandidates = new ArrayList<>();

        for (int[] indTrust : trust) {
            if (!judgeCandidates.contains(indTrust[1])) judgeCandidates.add(indTrust[1]);
        }
        for (int[] indTrust : trust) {
            if (judgeCandidates.contains(indTrust[0])) judgeCandidates.remove((Object) indTrust[0]);
        }

        if (!judgeCandidates.isEmpty()) {
            HashMap<Integer, Boolean> arePeopleTrustToTheSamePerson = new HashMap<>();
            for (int i = 1; i <= n; i++) {
                if (i == judgeCandidates.get(0)) continue;
                arePeopleTrustToTheSamePerson.put(i, false);
            }
            for (int[] row: trust) {
                if (row[1] == judgeCandidates.get(0)) arePeopleTrustToTheSamePerson.put(row[0], true);
            }
            for (Map.Entry<Integer, Boolean> entry: arePeopleTrustToTheSamePerson.entrySet()) {
                if (!entry.getValue()) return -1;
            }
        } else return -1;
        return judgeCandidates.get(0);
    }
}
