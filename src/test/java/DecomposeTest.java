import static org.junit.jupiter.api.Assertions.assertEquals;

import angmagun.Decompose;
import org.junit.jupiter.api.Test;


public class DecomposeTest {

    @Test
    public void test1() throws Exception{
        Decompose d = new Decompose();


        long n = 11;
        assertEquals("1 2 4 10",  d.decompose(818283838382939393l));


    }
}
