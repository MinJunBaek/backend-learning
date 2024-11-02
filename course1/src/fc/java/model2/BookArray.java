package fc.java.model2;

import java.util.Arrays;

public class BookArray {
    private static final int DEFAULT_CAPACITY = 5; // 수정불가(final) -> 상수
    private Book[] elements;
    private int size = 0;

    // 생성 동작
    public BookArray() {
        elements = new Book[DEFAULT_CAPACITY];
    }

    // 저장 동작
    public void add(Book element) {
        // 크기체크
        if (size == elements.length) {
            ensureCapacity();
        }
        elements[size++] = element;
    }

    // 가져오는 동작
    public Book get(int index) {
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