import java.util.ArrayList;
import java.util.List;

public class noX {
    public List<String> noX(List<String> strings) {
        List<String> result = new ArrayList<>();
        for (String s: strings) {
            result.add(s.replace ("x", ""));
        }
        return result;
    }

}
