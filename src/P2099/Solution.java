package P2099;

import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int[] temp = new int[nums.length];
        System.arraycopy(nums, 0, temp, 0, nums.length);
        int[] result = new int[k];
        Arrays.sort(temp);
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = temp.length-1; i >= nums.length-k ; i--) {
            if (hashMap.containsKey(temp[i])) {
                hashMap.put(temp[i], hashMap.get(temp[i]) + 1);
            } else {
                hashMap.put(temp[i], 1);
            }
        }

        int j = 0;
        for (int num : nums) {
            if (j == k) break;
            if (hashMap.containsKey(num)) {
                if (hashMap.get(num) == 1) hashMap.remove(num);
                else hashMap.put(num, hashMap.get(num) - 1);
                result[j] = num;
                j++;
            }
        }
        return result;
    }
}
