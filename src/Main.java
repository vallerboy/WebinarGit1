import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

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
        showMe(new Nameator() {
            @Override
            public String getName(String s) {
                return s.concat(" a to jest z klasy anonimowej");
            }
        }, "hejOasd!!");
    }


    public static void showMe(Nameator nameator, String name){
        System.out.println(nameator.getName(name));
    }
}
