public class loneTeen {
    public boolean loneTeen(int a, int b) {
        boolean isTeenA =(a>=13 && a<=19);
        boolean isTeenB =(b>=13 && b<=19);

        return isTeenA ^ isTeenB;
    }

}
