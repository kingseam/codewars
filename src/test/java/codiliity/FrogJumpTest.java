package codiliity;

import angmagun.codillity.FrogJump;
import angmagun.codillity.OddoArray;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class FrogJumpTest {
    @Test
    public void test() {
        FrogJump frog = new FrogJump();
        Assert.assertThat(frog.solution(10,85,30), CoreMatchers.is(3));
    }
}
