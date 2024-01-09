package P0682;

import java.util.ArrayList;

class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> integers = new ArrayList<>();

        for (String operation : operations) {
            if (integers.size() >= 2) {
                if (operation.equals("+")) {
                    integers.add(integers.get(integers.size() - 2) + integers.get(integers.size() - 1));
                    continue;
                }
            }
            if (!integers.isEmpty()) {
                if (operation.equals("C")) {
                    integers.remove(integers.size() - 1);
                    continue;
                } else if (operation.equals("D")) {
                    integers.add(integers.get(integers.size() - 1) * 2);
                    continue;
                }
            }
            integers.add(Integer.parseInt(operation));
        }
        int sum = 0;
        if (!integers.isEmpty()) {
            for (Integer integer : integers) {
                sum += integer;
            }
        }
        return sum;
    }
}
