

import angmagun.PeanoNumbers.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PeanoNumbersTest {


    public static void main(String argc[]) throws Exception {

        System.out.println(10 >> 1);
        System.out.println(Apple11.get());
    }

}

class MyThreadTask implements Runnable {
    @Override
    public void run() {
        System.out.println("apple2=" + Apple2.get());
    }

}

class Apple1{
    static Apple1 get(){
        return new Apple1();
    }
}

class Apple11 extends Apple1{
    static Apple1 get(){

        return null;
    }
}

class Apple2{
    static Apple2 apple = new Apple2();
    static Apple2 get(){
        return apple;
    }
}

class Apple3{
    static Apple3 apple;
    static Apple3 get(){
        if(apple == null){
            apple = new Apple3();
        }
        return apple;
    }
}