public class fix45 {
    public int[] fix45(int[] nums) {
        int j=0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] ==4) {
                if (nums[i+1] !=5) {
                    while (j< nums.length && (nums [j] !=5 || (j>0 && nums [j-1] ==4))) {
                        j++;
                    }
                    int temp =nums[i +1];
                    nums [i+1] =nums[j];
                    nums[j] =temp;
                }
            }
        }
        return nums;
    }

}
