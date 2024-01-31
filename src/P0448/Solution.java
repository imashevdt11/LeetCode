package P0448;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> numbers = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, 1);
        }

        for(int i = 1; i <= nums.length; i++) {
            if(!map.containsKey(i)) {
                numbers.add(i);
            }
        }
/*        for (int num : nums) {
//            numbers.add(num);
//        }
//        for (int i = 1; i <= nums.length; i++) {
//            if (numbers.contains(i)) {
//                while ((numbers.contains(i))) {
//                    numbers.remove((Object) i);
//                }
//            } else numbers.add(i);
//        }
*/        return numbers;
    }
}