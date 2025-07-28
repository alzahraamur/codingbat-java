import java.util.ArrayList;
import java.util.List;

public class rightDigit {
    public List<Integer> rightDigit(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        for (int n: nums) {
            result.add (n%10);
        }
        return result;
    }

}
