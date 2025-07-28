public class sum67 {
    public int sum67(int[] nums) {
        int sum =0;
        boolean inSection= false;

        for (int n: nums) {
            if(n==6){
                inSection =true;
            }
            else if(inSection && n==7) {
                inSection= false;
            }
            else if(!inSection) {
                sum+=n;
            }

        }

        return sum;
    }
}
