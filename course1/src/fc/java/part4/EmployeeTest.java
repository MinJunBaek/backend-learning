package fc.java.part4;

public class EmployeeTest {
    public static void main(String[] args) {
        // 일반사원 한명의 객체를 생성하고 데이터를 저장 후 출력을 하세요.
        RempVO vo = new RempVO();
        // 부모 클래스의 속성을 private으로 변경하여 아래 코드는 에러가 발생한다ㅏ.
        /*
        vo.name = "홍길동";
        vo.age = 50;
        vo.phone = "010-1234-5678";
        vo.empDate = "2022-10-10";
        vo.dept = "홍보부";
        vo.marriage = true;

        System.out.println(vo.name + "\t" + vo.age + "\t" +
                vo.phone + "\t" + vo.empDate + "\t" + vo.dept + "\t"
                + vo.marriage);
        System.out.println(vo);
        */
    }
}