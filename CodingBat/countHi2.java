public class countHi2 {
    public int countHi2(String str) {
        if (str.length() < 2) {
            return 0;
        }
        if (str.length() >= 3 && str.charAt(0) == 'x' && str.substring(1, 3).equals("hi")) {
            return countHi2(str.substring(2));
        }

        if (str.substring(0, 2).equals("hi")) {
            return 1 + countHi2(str.substring(2));
        }

        return countHi2(str.substring(1));
    }

}
