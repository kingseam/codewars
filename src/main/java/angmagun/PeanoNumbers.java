package angmagun;

/**
 * !!MENTION!!
 * You can't use the following characters:
 * + - * / % > <
 *
 * please delete this comment when submit
 */
public final class PeanoNumbers {
    interface Peano {
        final class Zero implements Peano {
            static Zero INSTANCE = new Zero();
            private Zero() {}
        }

        final class Succ implements Peano {
            final Peano peano;
            Succ(Peano peano) {
                this.peano = peano;
            }
        }
    }

    enum Ordering {GT, LT, EQ}

    static Peano add(Peano a, Peano b) {
        return a;
    }

    /**
     * @throws ArithmeticException if return value is negative
     *                             message should be 'negative number'
     * delete this when submit
     */
    static Peano sub(Peano a, Peano b) {
        return a;
    }

    static Peano mul(Peano a, Peano b) {
        return a;
    }

    /**
     * @throws ArithmeticException if divided by 0
     *                             message should be 'divide by 0'
     * delete this when submit
     */
    static Peano div(Peano a, Peano b) {
        return a;
    }

    static boolean even(Peano peano) {
        return true;
    }

    static boolean odd(Peano peano) {
        return true;
    }

    static Ordering compare(Peano a, Peano b) {
        return Ordering.EQ;
    }
}
