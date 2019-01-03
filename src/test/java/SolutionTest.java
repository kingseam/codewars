import static org.junit.jupiter.api.Assertions.assertEquals;

import comm.ReverseWordsImpl;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;



public class SolutionTest {
    @Test
    public void testSomething() {
        for(ReverseWordsImpl clazz : this.init()) {
            System.out.println(clazz.getClass().getName());
            assertEquals("eating like I", clazz.reverseWords("I like eating"));
            assertEquals("flying like I", clazz.reverseWords("I like flying"));
            assertEquals("nice is world The", clazz.reverseWords("The world is nice"));
            System.out.println("pass");
        }
    }

    public List<ReverseWordsImpl> init() {
        Class<?>[] classList = {
            hkd.ReverseWords.class,
            jhkim.ReverseWords.class,
            suhyeon.ReverseWords.class,
            angmagun.ReverseWords.class
        };
        List<ReverseWordsImpl> clazzList = new ArrayList<>();
        ReverseWordsImpl impl = null;
        for (Class clazz : classList) {
            Constructor cons = null;
            try {
                cons = clazz.getConstructor(new Class[] {});
                impl = (ReverseWordsImpl) cons.newInstance();
                clazzList.add(impl);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return clazzList;
    }
}
