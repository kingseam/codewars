package effective;

import lombok.extern.slf4j.Slf4j;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;

@Slf4j
public class HashCodeTest {
    @Test
    public void 존경합니다_갓생_해시코드(){
        log.info("== make hashcode eq");
        // hashcode override
        Assert.assertEquals(new HashCode(false, 1, 1l, 1f),new HashCode(false, 1, 1l, 1f));
        log.info("== make hashcode ne");
        Assert.assertNotSame(new HashCode(false, 1, 1l, 2f),new HashCode(false, 1, 1l, 1f));
        log.info("== not make hashcode ne");
        // hashcode not exist
        Assert.assertNotSame(new NotHashCode(false, 1, 1l, 1f),new NotHashCode(false, 1, 1l, 1f));

        HashCode cloneObj = new HashCode(true,11,11,11);
        Assert.assertThat(cloneObj.clone(), CoreMatchers.is(cloneObj));
        Assert.assertThat(cloneObj.clone().getClass(), CoreMatchers.sameInstance(cloneObj.getClass()));
        Assert.assertThat(cloneObj.clone().equals(cloneObj), CoreMatchers.is(true));

        Optional<String> a= Optional.empty();
    }
}
