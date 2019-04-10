package effective;

import lombok.Builder;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@ToString
public class HashCode implements Cloneable{
    private final boolean zero;
    private final int one;
    private final long two;
    private final float three;

    @Builder
    public HashCode(boolean zero, int one, long two, float three){

        this.zero = zero;
        this.one = one;
        this.two = two;
        this.three = three;
    }

    @Override
    public int hashCode() {
        int result = zero ? 1 : 0;
        result = result + one;
        result = result + (int)two>>>32;
        result = result + Float.floatToIntBits(three);

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        return (this.hashCode() == obj.hashCode());
    }

    @Override
    public HashCode clone() {
        try {
            return (HashCode)super.clone();
        } catch (CloneNotSupportedException e){
            throw new AssertionError();
        }
    }
}