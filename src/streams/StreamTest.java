package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Maja", "Kaja", "Oskar", "Tomek", "Tadek", "Karolina");


        List<Integer> integers = new ArrayList<>();

        System.out.println(list.parallelStream()
                .filter(s -> !s.endsWith("a"))
                .sorted()
                .distinct()
                .limit(2)
                //.mapToInt(s -> s.length())
                //.reduce((s, s1) -> s1 + s)
                //.boxed()
                .collect(Collectors.joining(", ", "Imiona: ", ".")));

        System.out.println(IntStream.of(1, 2, 3, 4, 5, 6).summaryStatistics());

        IntStream.range(0, 100)
                .filter(s -> s % 2 != 0)
                .mapToObj(String::valueOf)
                .forEach(System.out::println);
    }
}
