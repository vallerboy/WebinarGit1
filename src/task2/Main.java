package task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(Arrays.asList(1,2,23,4,5,6));
        System.out.println(map(integers, s -> s + 5));
    }

    public static  List<Integer> map(List<Integer> list, IntUnaryOperator operator){
        List<Integer> newList = new ArrayList<>();
        list.forEach(s -> newList.add(operator.applyAsInt(s)));

        return  newList;
    }
}
