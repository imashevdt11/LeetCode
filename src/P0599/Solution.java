package P0599;

import java.util.ArrayList;

class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        ArrayList<String> strings = new ArrayList<>();
        int sum = 0;

        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (list1[i].equals(list2[j])) {
                    if (strings.isEmpty()) {
                        strings.add(list1[i]);
                        sum = i + j;
                        break;
                    } else {
                        if (i + j == sum) {
                            strings.add(list1[i]);
                        } else if (i + j < sum) {
                            strings.clear();
                            strings.add(list1[i]);
                            sum = i + j;
                        }
                    }
                }
            }
        }
        String[] returnStrings = new String[strings.size()];

        for (int i = 0; i < returnStrings.length; i++) {
            returnStrings[i] = strings.get(i);
        }

        return returnStrings;
    }
}
