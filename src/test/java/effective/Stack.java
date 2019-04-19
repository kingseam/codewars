package effective;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
public class Stack<E> {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {
        elements = (E[])new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(E e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public E pop() {
        if(size == 0) throw new RuntimeException("stack is empty");
        E result = (E)elements[--size];
        elements[size] = null;
        return result;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    private void ensureCapacity() {
        if(elements.length == size){
            elements = Arrays.copyOf(elements, 2*size+1);
        }
    }

    public static void main(String... args){
        Stack<String> stack = new Stack<>();
        stack.push("asd1");
        stack.push("asd2");
        stack.push("asd3");
        stack.push("asd4");

        /* 제너릭 배열을 선언하게 되면 배열은 공변의 성질을 가지기 때문에 타입안정성을 해칠수 있음.
         * 프로그래머가 접근이 불가능하게 하거나 List<E>로 선언하는것이 타입안정성을 지킬수있다.
         */
        stack.elements = new Integer[]{1,2,3,4};

        while(!stack.isEmpty()){
            log.info("stack={}",stack.pop());
        }
    }
}
