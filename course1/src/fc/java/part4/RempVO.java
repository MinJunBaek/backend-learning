package fc.java.part4;

public class RempVO extends Employee{
    public RempVO() {
        super(); // 생성자가 생략되어있다.
    }

    public RempVO(String name, int age, String phone, String empDate, String dept, boolean marriage){
        // 자식이 부모의 기억공간에 초기화를 하는 경우
        // this.name = name;
        // this.age = age;
        // this.phone = phone;
        // this.empDate = empDate;
        // this.dept = dept;
        // this.marriage = marriage;
        super(name, age, phone, empDate, dept, marriage);
    }
}