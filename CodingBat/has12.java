public class has12 {
    public boolean has12(int[] nums) {
        boolean found1 = false;

        for (int n:nums) {
            if (n==1) {
                found1= true;
            }
            if (found1 && n==2) {
                return true;
            }
        }
        return false;
    }

}
