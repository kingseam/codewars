package angmagun;

import java.util.List;
import java.util.concurrent.Callable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Opstrings {

    public static String vertMirror (String strng) {
        // your code
        return Stream.of(strng.split("\n")).map(s->new StringBuilder(s).reverse().toString()).collect(Collectors.joining("\n"));
    }
    public static String horMirror (String strng) {
        String[] names = strng.split("\n");
        return IntStream.rangeClosed(1, names.length).mapToObj(i -> names[names.length - i]).collect(Collectors.joining("\n"));
    }
    public static String oper(Function<String, String> operator, String s) {
        return operator.apply(s);
    }
}