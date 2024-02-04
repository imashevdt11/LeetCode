package P1736;

class Solution {
    public String maximumTime(String time) {
        StringBuilder maximumTime = new StringBuilder();

        for (int i = 0; i < time.length(); i++) {
            if (i == 0 && time.charAt(i) == '?' && time.charAt(i + 1) == '?') {
                maximumTime.append(23);
                i++;
                continue;
            }
            if (i == 3 && time.charAt(i) == '?' && time.charAt(i + 1) == '?') {
                maximumTime.append(59);
                break;
            }
            if (time.charAt(i) == '?') {
                if (i == 0) {
                    if (Integer.parseInt(time.substring(1, 2)) > 3) maximumTime.append(1);
                    else maximumTime.append(2);
                } else if (i == 1) {
                    if (Integer.parseInt(time.substring(0, 1)) > 1) maximumTime.append(3);
                    else maximumTime.append(9);
                } else if (i == 3) maximumTime.append(5);
                else maximumTime.append(9);
            }
            else {
                maximumTime.append(time.charAt(i));
            }
        }
        return String.valueOf(maximumTime);
    }
}
