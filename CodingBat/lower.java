import java.util.ArrayList;
import java.util.List;

public class lower {
    public List<String> lower(List<String> strings) {
        List<String> result = new ArrayList<>();
        for (String s: strings) {
            result.add(s.toLowerCase());
        }
        return result;
    }

}
