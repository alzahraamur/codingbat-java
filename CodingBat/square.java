import java.util.ArrayList;
import java.util.List;

public class square {
    public List<Integer> square(List<Integer> nums) {
        List<Integer> result= new ArrayList<>();
        for (int n:nums) {
            result.add (n*n);
        }
        return result;
    }
}
