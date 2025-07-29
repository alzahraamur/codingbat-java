public class noX1 {
    public String noX(String str) {
        if (str.isEmpty()) {
            return str;
        }
        if (str.charAt(0) == 'x') {
            return noX(str.substring(1));
        }
        return str.charAt(0) + noX(str.substring(1));
    }

}
