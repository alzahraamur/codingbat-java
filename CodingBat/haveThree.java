public class haveThree {
    public boolean haveThree(int[] nums) {
        int count3 =0;

        for (int i=0; i<nums.length; i++) {
            if (nums[i] ==3) {
                count3++;

                if (i+1 <nums.length && nums[i+1] ==3) {
                    return false;
                }
            }
        }
        return count3==3;
    }

}
