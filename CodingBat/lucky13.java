public class lucky13 {
    public boolean lucky13(int[] nums) {
        for (int n: nums) {
            if (n==1 || n==3) {
                return false;
            }
        }
        return true;
    }

}
