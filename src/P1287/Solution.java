package P1287;

import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public int findSpecialInteger(int[] arr) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        ArrayList<Integer> numbersInArray = new ArrayList<>();
        for (int integer : arr) {
            if (!hashMap.containsKey(integer)) {
                hashMap.put(integer, 1);
                numbersInArray.add(integer);
            } else {
                hashMap.put(integer, hashMap.get(integer) + 1);
            }
        }
        int specialInt = numbersInArray.get(0);
        for (int i = 1; i < hashMap.size(); i++) {
            if (hashMap.get(specialInt) < hashMap.get(numbersInArray.get(i))) {
                specialInt = numbersInArray.get(i);
            }
        }
        return specialInt;
    }
}
