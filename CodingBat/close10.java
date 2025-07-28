public class close10 {
    public int close10(int a, int b) {
        int DiffA= Math.abs (a-10);
        int DiffB= Math.abs (b- 10);

        if (DiffA< DiffB){
            return a;
        }
        if (DiffB< DiffA){
            return b;
        }
        return 0;
    }

}
