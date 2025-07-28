import java.util.ArrayList;
import java.util.List;

public class doubling {
    public List<Integer> doubling(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        for (int n: nums) {
            result.add( n*2);
        }
        return result;
    }
}
