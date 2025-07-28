import java.util.ArrayList;
import java.util.List;

public class noZ {
    public List<String> noZ(List<String> strings) {
        List<String> result = new ArrayList<>();
        for(String s: strings) {
            if(!s.contains("z")) {
                result.add(s);
            }
        }
        return result;
    }

}
