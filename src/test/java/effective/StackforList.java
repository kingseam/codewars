package effective;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class StackforList<E> {
    private List<E> elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 20;

    public StackforList() {
        elements = new ArrayList<>(DEFAULT_INITIAL_CAPACITY);
    }

    public void push(E e) {
        ensureCapacity();
        size++;
        elements.add(e);
    }

    public E pop() {
        if(size == 0) throw new RuntimeException("stack is empty");
        E result = elements.get(--size);
        elements.remove(size);
        return result;
    }

    public boolean isEmpty(){
        return elements.size() == 0;
    }

    private void ensureCapacity() {
        if(elements.size() == DEFAULT_INITIAL_CAPACITY){
            log.info("test={}", DEFAULT_INITIAL_CAPACITY + (DEFAULT_INITIAL_CAPACITY >>1));
            List<E> tempList = List.copyOf(elements);
            elements = new ArrayList<>(DEFAULT_INITIAL_CAPACITY + (DEFAULT_INITIAL_CAPACITY >>1));
            elements.addAll(tempList);
        }
    }

    public static void main(String... args){
        StackforList<String> stack = new StackforList<>();
        stack.push("asd1");
        stack.push("asd2");
        stack.push("asd3");
        for(int i=0; i<20; i++) {
            stack.push("asd4");
        }

        /* 아래의 선언은 컴파일 오류가 발생하지만 <String> 시 새로운 객체를 할당은 가능. 해당 클래스가 불변이 아니기 때문. 형변환이 되진않는다.
         * 타입안정성을 지킬순있음.. 컴파일러가 타입을 가이드해주지만 실제 런타임시에는 소거자때문에 Object형으로 변한다.
         */
        //stack.elements = new ArrayList<Integer>();

        while(!stack.isEmpty()){
            log.info("stack={}",stack.pop());
        }
    }
}
