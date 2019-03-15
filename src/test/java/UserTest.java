
import angmagun.User;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.jupiter.api.Test;


public class UserTest {
    @Test
    public void test() {
        //-8
        //-7
        //-6
        //-5
        //-4
        //-8
        //1

        User user = new User();
        Assert.assertThat(user.rank, CoreMatchers.is(-8));
        user.incProgress(-8);
        Assert.assertThat(user.progress, CoreMatchers.is(3));
        user.incProgress(-7);
        Assert.assertThat(user.progress, CoreMatchers.is(13));
        user.incProgress(-6);
        Assert.assertThat(user.progress, CoreMatchers.is(53));
        user.incProgress(-5);
    }
}
