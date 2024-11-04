package fc.java.model2;

import java.util.Arrays;

public class ObjectArray {
    private static final int DEFAULT_CAPACITY = 5; // 수정불가(final) -> 상수
    private Object[] elements; // 다형성 배열
    private int size = 0;

    // 생성 동작
    public ObjectArray() {
        // elements = new Object[DEFAULT_CAPACITY];
        this(5); // this(5) : 생성자안에서 다른 생성자를 호출할때 사용
    }

    public ObjectArray(int capacity) {
        elements = new Object[capacity]; // 원하는크기의 배열을 생성한다.
    }

    // 저장 동작
    public void add(Object element) {
        // 크기체크
        if (size == elements.length) {
            ensureCapacity();
        }
        elements[size++] = element;
    }

    // 가져오는 동작
    public Object get(int index) {
        // 음수 및 범위를 초과 체크
        if (index < 0 || index >= elements.length) {
            throw new IndexOutOfBoundsException("범위초과");
        }
        return elements[index];
    }

    // 삭제하는 동작(스스로 만들어 본것)
    public void pop(){
        if (size >= 0){
            elements[--size] = null;
        } else {
            size = 0;
            System.out.println("삭제할 요소가 없습니다.");
        }
    }

    // 원소갯수 넘겨주는 동작
    public int size() {
        return size;
    }

    private void ensureCapacity(){
        int newCapacity = elements.length * 2;
        elements = Arrays.copyOf(elements, newCapacity);
    }
}