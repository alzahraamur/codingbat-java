public class post4 {
    public int[] post4(int[] nums) {
        int last4Index= -1;

        for (int i=0; i< nums.length; i++) {
            if (nums[i] ==4) {
                last4Index=i;
            }
        }
        int[] result = new int [nums.length-last4Index -1];
        for (int i=0; i<result.length; i++) {
            result[i]= nums[last4Index+ 1+i];
        }
        return result;
    }
}
