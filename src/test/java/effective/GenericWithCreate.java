package effective;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

class GenericWithCreate<T> {
    private static int i;
    final T element;

    GenericWithCreate(T t) {
        element = t;
    }

    void f() {
        System.out.println(element.getClass());
    }

    static int Factorial(int n) {

        if (n == 1) return 1;


        int result = Factorial(n - 1);

        return n * result;

    }

    static int FactorialTail(int n, int acc)    // acc : accumulator의 약자

    {

        if (n == 1) return acc;

        return FactorialTail(n - 1, acc * n);    //  일반 재귀에서의 n * Factorial(n-1)와 달리 반환값에서 추가 연산을 필요로 하지 않음

    }

    public int getFac(int min,int end){


        if(end < 0){
            return min;
        }else if(end == 0){
            return 1;
        }else if(end == 1){
            return end;
        }

        return getFac(min*end,end-1) ;
    }

    public static void main(String... args) {
        GenericWithCreate<String> s = new GenericWithCreate<>("aa");
        GenericWithCreate<Integer> s2 = new GenericWithCreate<>(55);
        GenericWithCreate s3 = new GenericWithCreate("22");
        List a = new ArrayList();
        List<String> abc = new ArrayList<>();
        int[] aa = new int[30];
        abc.add("aaa");
        a.add("ss");
        a.add(11);
        a.add(true);


        s.f();
        s2.f();
        s3.f();
        for (Object b : a) {
            Object test = new Object();
            if (b instanceof String) {
                test = (String) b;
            }
            if (b instanceof Integer) {
                test = (Integer) b;
            }
            if (b instanceof Boolean) {
                test = (Boolean) b;
            }

            System.out.println(test);
            System.out.println(b.getClass());
        }

        Supplier<String> s1 = () -> new String[]{"apple", "banana", "cherry"}[i++];

        System.out.println(s1.get());
        System.out.println(s1.get());
        System.out.println(s1.get());
        Factorial(5);
        FactorialTail(5, 5);
    }
}
