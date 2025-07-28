public class frontBack {
    public String frontBack(String str) {
        int len= str.length();
        if (len<=1){
            return str;
        }
        String first= str.substring (0, 1);
        String last= str.substring (len -1);
        String middle= str.substring (1, len-1);

        return last +middle+ first;

    }

}
