public class makeChocolate {
    public int makeChocolate(int small, int big, int goal) {
        int maxBig= goal /5;
        if (maxBig >big) {
            maxBig = big;
        }

        int remaining =goal - (maxBig*5);

        if (remaining <= small) {
            return remaining;
        }
        else{
            return -1;
        }
    }

}
