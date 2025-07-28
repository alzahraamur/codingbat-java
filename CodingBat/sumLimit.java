public class sumLimit {
    public int sumLimit(int a, int b) {
        int sum= a+b;
        int aLength =String.valueOf(a).length();
        int sumLength = String.valueOf(sum).length();

        if (sumLength >aLength) {
            return a;
        }
        return sum;
    }

}
