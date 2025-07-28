public class bigDiff {
    public int bigDiff(int[] nums) {

        int min =nums[0];
        int max= nums [0];

        for (int n: nums) {
            max= Math.max(max, n);
            min= Math.min(min, n);
        }

        return max -min;
    }

}
