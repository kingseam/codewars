package effective;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NotHashCode {
    private final boolean zero;
    private final int one;
    private final long two;
    private final float three;

    public NotHashCode(boolean zero, int one, long two, float three){
        log.info(this.getClass().getName());
        this.zero = zero;
        this.one = one;
        this.two = two;
        this.three = three;
        log.info("hashcode={}",this.hashCode());
    }

    @Override
    public boolean equals(Object obj) {
        return (this.hashCode() == obj.hashCode());
    }
}