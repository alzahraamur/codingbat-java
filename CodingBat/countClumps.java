public class countClumps {
    public int countClumps(int[] nums) {
        int count=0;
        int i=0;

        while (i< nums.length) {
            int current =nums[i];
            int length=0;

            while (i<nums.length && nums[i] == current) {
                length++;
                i++;
            }
            if (length>=2) {
                count++;
            }
        }
        return count;
    }

}
