public class centeredAverage {
    public int centeredAverage(int[] nums) {
        int sum= 0;
        int min= nums[0];
        int max= nums[0];

        for (int n: nums) {
            sum+= n;
            max = Math.max(max ,n);
            min =Math.min(min, n);
        }
        return (sum-min-max) /(nums.length-2);
    }

}
