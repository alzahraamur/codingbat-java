import java.util.ArrayList;
import java.util.List;

public class copies3 {
    public List<String> copies3(List<String> strings) {
        List<String> result = new ArrayList<>();
        for (String s: strings) {
            result.add (s+ s+ s);
        }
        return result;
    }

}
