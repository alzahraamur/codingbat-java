import java.util.ArrayList;
import java.util.List;

public class noLong {
    public List<String> noLong(List<String> strings) {
        List<String> result = new ArrayList<>();
        for (String s: strings) {
            if (s.length() <4) {
                result.add(s);
            }
        }
        return result;
    }

}
