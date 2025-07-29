public class copyEndy {
    public int[] copyEndy(int[] nums, int count) {

        int[] result = new int[count];
        int idx = 0;

        for (int n : nums) {
            if (isEndy(n)) {
                result[idx] = n;
                idx++;
                if (idx == count) {
                    break;
                }
            }
        }
        return result;
    }
    public boolean isEndy(int n) {
        return (n >= 0 && n <= 10) || (n >= 90 && n <= 100);
    }


}
