import static org.junit.jupiter.api.Assertions.assertEquals;

import hoho.Opstrings;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import lombok.extern.slf4j.Slf4j;
import org.hamcrest.Matcher;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.hamcrest.CoreMatchers;

@Slf4j
public class OpstringsTest {

    private static void testing(String actual, String expected) {
        assertEquals(expected, actual);
    }
    @Test
    public void test() {

        System.out.println("Fixed Tests vertMirror");
        String s = "hSgdHQ\nHnDMao\nClNNxX\niRvxxH\nbqTVvA\nwvSyRu";
        String r = "QHdgSh\noaMDnH\nXxNNlC\nHxxvRi\nAvVTqb\nuRySvw";
        testing(Opstrings.oper(Opstrings::vertMirror, s), r);
        s = "IzOTWE\nkkbeCM\nWuzZxM\nvDddJw\njiJyHF\nPVHfSx";
        r = "EWTOzI\nMCebkk\nMxZzuW\nwJddDv\nFHyJij\nxSfHVP";
        testing(Opstrings.oper(Opstrings::vertMirror, s), r);

        System.out.println("Fixed Tests horMirror");
        s = "lVHt\nJVhv\nCSbg\nyeCt";
        r = "yeCt\nCSbg\nJVhv\nlVHt";
        testing(Opstrings.oper(Opstrings::horMirror, s), r);
        s = "njMK\ndbrZ\nLPKo\ncEYz";
        r = "cEYz\nLPKo\ndbrZ\nnjMK";
        testing(Opstrings.oper(Opstrings::horMirror, s), r);
    }

    @Test
    public void 중복제거테스트(){
        Assert.assertThat(distinct("aaaaaaaaaaaabbbbbbbbccccccccca"), CoreMatchers.is("abca"));
        Assert.assertThat(distinct("aabbcascasdasvbbbssss"), CoreMatchers.is("abcascasdasvbs"));
        Assert.assertThat(distinct("csad"), CoreMatchers.is("csad"));
        Assert.assertThat(distinct("abcdddees"), CoreMatchers.is("abcdes"));
        Assert.assertThat(distinct("aaaaaaaaaaaaaaaaaaaaa"), CoreMatchers.is("a"));
    }

    public String distinct(String str){
        String text = str;
        int size = text.length();
        StringBuffer sb = new StringBuffer();
        IntStream.rangeClosed(0, size).mapToObj(c->{
            if(c+1 < size && text.charAt(c) != text.charAt(c+1)){
                return text.charAt(c);
            }else{
                if(c+1 == size){
                    return text.charAt(c);
                }
                return "";
            }
        }).forEach(c->sb.append(c));
        return sb.toString();

    }
}
