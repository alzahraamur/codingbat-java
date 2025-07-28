public class squareUp {
    public int[] squareUp(int n) {
        int [] result =new int [n *n];

        for(int i=1; i<=n; i++) {
            int index = i*n -1;
            for (int j=1 ; j<=i; j++) {
                result[index--] =j;
            }
        }
        return result;
    }

}
