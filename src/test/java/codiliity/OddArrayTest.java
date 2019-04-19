package codiliity;

import angmagun.codillity.OddoArray;
import angmagun.codillity.Rotation;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class OddArrayTest {

    @Test
    public void test() {
        OddoArray oddArray = new OddoArray();
        Assert.assertThat(oddArray.solution(new int[]{9, 3, 9, 3, 9, 7, 9}), CoreMatchers.is(7));
    }
}
