package P0169;

import java.util.HashSet;

class Solution {
    public int majorityElement(int[] nums) {

        HashSet<Integer> elements = new HashSet<>();
        for (int num: nums) {
            elements.add(num);
        }
        int counter = 0;
        int majorityElement = 0;
        int majorityElementCounter = 0;
        for (Integer element: elements) {
            for (int num: nums) {
                if (element == num) {
                    counter++;
                }
            }
            if (counter > majorityElementCounter) {
                majorityElementCounter = counter;
                majorityElement = element;
            }
            counter = 0;
        }
        return majorityElement;
    }
}
