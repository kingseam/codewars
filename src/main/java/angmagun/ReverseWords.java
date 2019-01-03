package angmagun;


import comm.ReverseWordsImpl;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseWords implements ReverseWordsImpl {
    public String reverseWords(String str){
        return Stream.of(str.split(" ")).collect(Collectors.collectingAndThen(Collectors.toList(), lst -> {Collections.reverse(lst); return lst.stream();})).collect(Collectors.joining(" "));
    }
}
