import java.util.ArrayList;
import java.util.List;

public class no9 {
    public List<Integer> no9(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        for (Integer n: nums) {
            if (n% 10 !=9) {
                result.add(n);
            }
        }
        return result;
    }

}
