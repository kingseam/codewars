package effective;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class InnerClassGenerator {
    private InnerClassGenerator() {
    }

    public static Generator<InnerClassGenerator> generator() {
        return () -> new InnerClassGenerator();
    }

    public static Generator<InnerClassGenerator> generator2() {
        return new Generator<>() {
            @Override
            public InnerClassGenerator next() {
                return new InnerClassGenerator();
            }
        };
    }


    public static void main(String... args) {
        log.info("{}", InnerClassGenerator.generator());
        log.info("{}", InnerClassGenerator.generator2());
    }
}

interface Generator<T> {
    T next();
}