package effective;

public class Holder {
    private Object obj;
    public void set(Object obj) { this.obj = obj; }
    public Object get() {return obj;}

    public static void main(String... args){
        Holder hd = new Holder();
        hd.set("test");
        String a = (String)hd.get();
    }
}
