public class max1020 {
    public int max1020(int a, int b) {
        if (a< 10|| a> 20){
            a=0;
        }

        if (b< 10 || b> 20){
            b=0;
        }
        return Math.max(a, b);
    }

}
