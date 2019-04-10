package effective;

public class GenericsHolder<T extends String> {
    private T obj;
    public void set(T obj) { this.obj = obj; }
    public T get() {return obj;}

    public static void main(String... args){
        GenericsHolder<String> hd = new GenericsHolder();
        hd.set("test");
        String a = hd.get();
    }
}
