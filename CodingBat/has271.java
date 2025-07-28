public class has271 {
    public boolean has271(int[] nums) {

        for (int i = 0; i < nums.length - 2; i++) {
            int x = nums[i];
            int second = nums[i + 1];
            int third = nums[i + 2];

            if (second == x + 5 && (third >= x - 1 - 2 && third <= x - 1 + 2)) {
                return true;
            }
        }
        return false;
    }

}

