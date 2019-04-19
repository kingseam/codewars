package effective;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GenericsHolder<T extends String> {
    private T obj;
    public void set(T obj) { this.obj = obj; }
    public T get() {return obj;}
    static public void test(String... str){
        log.info("length={}", str.length);

    }
    static public void test2(String[] a){

    }

    public static void main(String... args){
        GenericsHolder<String> hd = new GenericsHolder();
        hd.set("test");
        String a = hd.get();

        Object[] objs = new Integer[20];
        //
        Integer[] obj = new Integer[20];

        Object b = 3;
        System.out.println(b);

        test("a");
        test("a","2");
        test("a","2","2","3","4");
        test2(new String[]{"a"});
    }
}
