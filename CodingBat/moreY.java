import java.util.ArrayList;
import java.util.List;

public class moreY {
    public List<String> moreY(List<String> strings) {
        List<String> result = new ArrayList<>();

        for (String s: strings) {
            result.add("y"+ s+ "y");
        }
        return result;
    }

}
