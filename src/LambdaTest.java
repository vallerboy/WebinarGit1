import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaTest {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("oskar", "damian", "Ada", "Kamila", "Tomek", "Dorota"));

        names.sort((s, s1) -> s1.compareTo(s));
    }
}
