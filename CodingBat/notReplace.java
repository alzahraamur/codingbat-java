public class notReplace {
    public String notReplace(String str) {
        StringBuilder result = new StringBuilder();
        int i=0;

        while (i<str.length()) {
            if (i +1 <str.length() && str.substring(i, i+2).equals("is")) {
                boolean before = (i >0 && Character.isLetter(str.charAt(i-1)));
                boolean after =(i +2 <str.length() && Character.isLetter(str.charAt(i+2)));

                if (!before && ! after) {
                    result.append("is not");
                    i+=2;
                    continue;
                }
            }
            result.append(str.charAt(i));
            i++;
        }
        return result.toString();
    }

}
