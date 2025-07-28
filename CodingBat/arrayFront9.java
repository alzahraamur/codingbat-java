public class arrayFront9 {
    public boolean arrayFront9(int[] nums) {

        int limit = Math.min(4, nums.length);

        for (int i = 0; i < limit; i++) {
            if (nums[i] == 9) {
                return true;
            }
        }

        return false;
    }

}
