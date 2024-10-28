package fc.java.model;

public class PersonVO {
    private String name;
    private int age;
    private String phone;

    // 기본적으로 생성자 메서드가 있다. => 기본생성자

    public PersonVO() {
        // 객체를 생성하는 코드는 내부에서 만들어진다.
        // 객체의 초기화를 한다.
        this.name = "홍길동";
        this.age = 50;
        this.phone = "010-1111-2222";
    }

    public PersonVO(String name, int age, String phone) {
        // 오버로딩된 생성자가 있으면 기본생성자가 만들어지지 않는다.
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getPhone() {
        return phone; // this.phone과 같다.
    }

    // toString()메서드를 생략해도 println()이 객체의 내용을 출력하기위해 toString()메서드를 찾고 출력하세된다.
    // 현재 오버라이딩이 된 toString()을 출력하게 된다.
    @Override
    public String toString() {
        return name + "\t" + age + "\t" + phone;
    }
}