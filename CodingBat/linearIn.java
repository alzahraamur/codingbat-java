public class linearIn {
    public boolean linearIn(int[] outer, int[] inner) {
        int i=0;
        int j=0;

        while (i< outer.length && j< inner.length) {
            if (outer[i] == inner[j]) {
                j++;
            }
            else if (outer [i] >inner[j]){
                return false;
            }
            i++;
        }
        return j==inner.length;
    }

}
