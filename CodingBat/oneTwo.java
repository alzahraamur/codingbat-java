public class oneTwo {
    public String oneTwo(String str) {
        StringBuilder result =new StringBuilder();

        for (int i= 0; i+2 <str.length(); i+=3) {
            result.append(str.charAt(i +1))
                    .append(str.charAt(i+2)) .append(str.charAt(i));
        }
        return result.toString();
    }

}
