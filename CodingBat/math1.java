import java.util.ArrayList;
import java.util.List;

public class math1 {
    public List<Integer> math1(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        for (int n:nums) {
            result.add ((n+1) *10);
        }
        return result;
    }

}
