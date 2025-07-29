public class dividesSelf {
    public boolean dividesSelf(int n) {
        int originalNumber = n;
        while (n > 0) {
            int digit = n % 10;
            if (digit == 0 || originalNumber % digit != 0) {
                return false;
            }
            n /= 10;
        }
        return true;
    }

}
