package fc.java.part4;

public class Employee extends Object{
    private String name;
    private int age;
    private String phone;
    private String empDate;
    private String dept;
    private boolean marriage;
//    protected String name;
//    protected int age;
//    protected String phone;
//    protected String empDate;
//    protected String dept;
//    protected boolean marriage;

    public Employee(){
        /*
        생성자는 기본적으로 super();가 생략되어있다.
        이 생성자는 자신의 상위클래스의 생성자를 호출한다.
        최상위 부모클래스는 Object가 되며, 기본적으로 상속이 된다.
        */
        super();
    }

    public Employee(String name, int age, String phone, String empDate, String dept, boolean marriage){
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.empDate = empDate;
        this.dept = dept;
        this.marriage = marriage;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", empDate='" + empDate + '\'' +
                ", dept='" + dept + '\'' +
                ", marriage=" + marriage +
                '}';
    }
}
