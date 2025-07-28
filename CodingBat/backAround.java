public class backAround {
    public String backAround(String str) {
        String lasts = str.substring(str.length()-1);
        return lasts+str+lasts;
    }

}
