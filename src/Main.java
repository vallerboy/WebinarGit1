import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("oskar", "damian", "Ada", "Kamila", "Tomek", "Dorota"));



        showMe(s -> s.toLowerCase(), "HEJO!!");
        showMe(s -> s.toUpperCase(), "hejO!!");
        showMe(s -> s.concat(" - to doklejka z lambdy hehe"), "hejO!!");

        //lambda z zapisem skróconym (sama dodaje ciało i sama dodaje return jeśli konieczny)
        showMe(s -> String.valueOf(s.charAt(0)), "hejO!!");

        // lambda bez zapisu skróconego
        showMe((String s)  -> {
            return String.valueOf(s.charAt(0));
            }, "hejO!!");


        // == klasa anonimowa z przesłonięciem metody

    }


    public static void showMe(Function<String, String> nameator, String name){
        System.out.println(nameator.apply(name));
    }
}
