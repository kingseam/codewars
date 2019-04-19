package effective;

import lombok.extern.slf4j.Slf4j;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Slf4j
public enum StringToEnum {
    PLUS("+") {
        public double apply(double x, double y) {
            return x + y;
        }
    },
    MINUS("-") {
        public double apply(double x, double y) {
            return x - y;
        }
    };
    private final String symbol;
    private static final Map<String, StringToEnum> method = Stream.of(values()).collect(Collectors.toMap(Object::toString, e -> e));

    public static Optional<StringToEnum> fromString(String symbol) {
        return Optional.ofNullable(method.get(symbol));
    }

    StringToEnum(String symbol) {
        this.symbol = symbol;
    }

    public abstract double apply(double x, double y);

    @Override
    public String toString() {
        return symbol;
    }

    static public void main(String... args) {
        double x = 1.2;
        double y = 0.3;
        for (StringToEnum op : StringToEnum.values()) {
            log.info("{} {} {} = {}", x, op, y, op.apply(x, y));
        }

        log.info("{}", StringToEnum.fromString("+"));
        log.info("{}", StringToEnum.fromString("*"));

        StringBuilder str = new StringBuilder("abc");
        str.append("def", 0, 3);
        log.info("{}", str);

        StringBuilder str2 = new StringBuilder("abc");
        str2.append("def", 1, 2);
        log.info("{}", str2);
    }
}


