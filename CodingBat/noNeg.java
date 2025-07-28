import java.util.ArrayList;
import java.util.List;

public class noNeg {
    public List<Integer> noNeg(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        for(Integer n: nums) {
            if (n >=0) {
                result.add(n);
            }
        }
        return result;
    }

}
