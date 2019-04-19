package effective;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@Slf4j
public class Max {
    static public <E extends Number> E max(E n1, E n2){
        return n1.doubleValue() > n2.doubleValue() ? n1 : n2;
    }

    static public void main(String... args){
        log.info("{}", Max.max(1, 222222));
        log.info("{}", Max.max(1.22, 2.3333333));
    }
}