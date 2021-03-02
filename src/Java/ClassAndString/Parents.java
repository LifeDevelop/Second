package Java.ClassAndString;

public class Parents {
    protected void parentsMethod(){                    // 자식 클래스에서 접근가능하게 하려면 public, default,
                                                       // protected를 이용하면 된다. private는 접근 못함
        System.out.println("부모 클래스의 메서드 실행");

        }

        public Parents(String str){
            System.out.println( str + "을 매개변수로 받는 부모클래스 생성자입니다.");
    }
}
