import java.util.ArrayList;
import java.util.List;

public class square56 {
    public List<Integer> square56(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        for (Integer n: nums) {
            int value = n*n+10;
            if (value %10 !=5 && value %10 !=6) {
                result.add(value);
            }
        }
        return result;
    }

}
