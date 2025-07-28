import java.util.ArrayList;
import java.util.List;

public class noTeen {
    public List<Integer> noTeen(List<Integer> nums) {
        List<Integer>result = new ArrayList<>();
        for (Integer n: nums) {
            if (n<13 || n>19) {
                result.add(n);
            }
        }
        return result;
    }

}
