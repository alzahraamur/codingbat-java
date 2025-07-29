public class commonTwo {
    public int commonTwo(String[] a, String[] b) {
        int i = 0, j = 0, count = 0;
        String lastCounted = "";

        while (i < a.length && j < b.length) {
            int cmp = a[i].compareTo(b[j]);

            if (cmp == 0) {

                if (!a[i].equals(lastCounted)) {
                    count++;
                    lastCounted = a[i];
                }
                i++;
                j++;
            } else if (cmp < 0) {
                i++;
            } else {
                j++;
            }
        }

        return count;
    }

}
