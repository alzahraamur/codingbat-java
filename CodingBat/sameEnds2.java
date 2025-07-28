public class sameEnds2 {
    public String sameEnds(String string) {
        int len = string.length();
        String result="";

        for (int i=0; i<len /2 +1; i++) {
            String prefix= string.substring(0,i);
            String suffix= string.substring (len-i) ;

            if (prefix.equals(suffix)) {
                result= prefix;
            }
        }
        return result;
    }

}
