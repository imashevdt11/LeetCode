package P0013;

class Solution {
    public int romanToInt(String s) {

        String[] sCharacters = s.split("");
        int result = 0;
        for (int i = 0; i < sCharacters.length; i++) {
            switch (sCharacters[i]) {
                case "M" -> result += 1000;
                case "D" -> result += 500;
                case "C" -> {
                    if (i < sCharacters.length-1) {
                        switch (sCharacters[i + 1]) {
                            case "M" -> {
                                result += 900;
                                i++;
                            }
                            case "D" -> {
                                result += 400;
                                i++;
                            }
                            case "C" -> {
                                if (i < sCharacters.length-2) {
                                    if (sCharacters[i + 2].equals("C")) {
                                        result += 300;
                                        i += 2;
                                    } else {
                                        result += 200;
                                        i++;
                                    }
                                } else {
                                    result += 200;
                                    i++;
                                }
                            }
                            default -> result += 100;
                        }
                    } else {
                        result += 100;
                    }
                }
                case "L" -> result += 50;
                case "X" -> {
                    if (i < sCharacters.length-1) {
                        if (sCharacters[i + 1].equals("C")) {
                            result += 90;
                            i++;
                        } else if (sCharacters[i + 1].equals("L")) {
                            result += 40;
                            i++;
                        } else {
                            result += 10;
                        }
                    } else {
                        result += 10;
                    }
                }
                case "V" -> result += 5;
                case "I" -> {
                    if (i < sCharacters.length-1) {
                        if (sCharacters[i + 1].equals("X")) {
                            result += 9;
                            i++;
                        } else if (sCharacters[i + 1].equals("V")) {
                            result += 4;
                            i++;
                        } else {
                            result += 1;
                        }
                    } else {
                        result += 1;
                    }
                }
            }
        }
        return result;
    }
}
