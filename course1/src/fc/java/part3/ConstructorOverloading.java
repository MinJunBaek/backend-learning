package fc.java.part3;

import fc.java.model.PersonVO;

public class ConstructorOverloading {
    public static void main(String[] args) {
        PersonVO vo = new PersonVO();
        PersonVO vo1 = new PersonVO("나길동", 60, "010-2222-2222");
        PersonVO vo2 = new PersonVO("조길동", 50, "010-3333-3333");

        System.out.println(vo.getName() + "\t" + vo.getAge() + "\t" + vo.getPhone());
        System.out.println(vo1.getName() + "\t" + vo1.getAge() + "\t" + vo1.getPhone());
        System.out.println(vo2.getName() + "\t" + vo2.getAge() + "\t" + vo2.getPhone());
    }
}