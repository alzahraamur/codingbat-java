public class withoutTen {
    public int[] withoutTen(int[] nums) {
        int writeIndex=0;

        for(int i=0; i< nums.length; i++) {
            if (nums[i] !=10) {
                nums[writeIndex]= nums[i];
                writeIndex++;
            }
        }
        for (int i=writeIndex; i<nums.length; i++) {
            nums[i]=0;
        }
        return nums;
    }

}
