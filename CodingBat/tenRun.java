public class tenRun {
    public int[] tenRun(int[] nums) {
        int current= 0;
        boolean hasCurrent= false;

        for (int i=0; i<nums.length; i++) {
            if (nums[i] %10 ==0){

                current= nums[i];
                hasCurrent=true;
            }
            else if (hasCurrent) {
                nums[i] = current;
            }
        }
        return nums;
    }
}
