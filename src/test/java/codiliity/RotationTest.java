package codiliity;

import angmagun.codillity.Rotation;
import org.junit.Assert;
import org.junit.Test;
import org.hamcrest.CoreMatchers;

public class RotationTest {

    @Test
    public void test() {
        Rotation rotation = new Rotation();
        Assert.assertThat(rotation.solution(new int[]{3, 8, 9, 7, 6}, 1), CoreMatchers.is(new int[]{6, 3, 8, 9, 7}));
        Assert.assertThat(rotation.solution(new int[]{3, 8, 9, 7, 6}, 3), CoreMatchers.is(new int[]{9, 7, 6, 3, 8}));
        Assert.assertThat(rotation.solution(new int[]{2, 3, 4, 5, 6, 7, 1}, 7), CoreMatchers.is(new int[]{2, 3, 4, 5, 6, 7, 1}));
        Assert.assertThat(rotation.solution(new int[]{2, 3, 4, 5, 6, 7, 1}, 9), CoreMatchers.is(new int[]{7, 1, 2, 3, 4, 5, 6}));
        Assert.assertThat(rotation.solution(new int[]{-1000, 5}, 1), CoreMatchers.is(new int[]{5,-1000}));

    }
}
