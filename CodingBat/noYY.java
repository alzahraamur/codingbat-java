import java.util.ArrayList;
import java.util.List;

public class noYY {
    public List<String> noYY(List<String> strings) {
        List<String> result = new ArrayList<>();
        for(String s: strings) {
            String temp = s+"y";

            if(!temp.contains("yy")) {
                result.add(temp);
            }
        }
        return result;
    }

}
