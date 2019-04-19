package codiliity;

import angmagun.codillity.FrogJump;
import angmagun.codillity.PermMissingElem;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import java.util.stream.IntStream;

public class PermMissingElemTest {
    @Test
    public void test() {
        PermMissingElem perm = new PermMissingElem();
        Assert.assertThat(perm.solution(new int[]{2, 3, 1, 5}), CoreMatchers.is(4));
    }
}
