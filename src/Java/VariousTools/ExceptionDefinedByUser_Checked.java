package Java.VariousTools;

// Exception 클래스를 상속받으면 Checked Exception이 된다.
// Checked Exception은 try-catch구문, 혹은 throws를 통해 예외처리가 되지 않으면 컴파일 오류를 발생시킨다.
// Checked Exception은 개발자의 실수가 아닌 네트워크, 권한 등에 의한 예외 발생 시 사용하곤 한다.
public class ExceptionDefinedByUser_Checked extends Exception{

    public ExceptionDefinedByUser_Checked(String msg){
        super(msg);                     // String을 매개변수로 받는 생성자 정의 => 부모클래스 생성자로 넘김
    }

    public ExceptionDefinedByUser_Checked(Exception e){
        super(e);                       // 예외상황을 받는 생성자를 정의하여 부모클래스 생성자로 넘김
    }

}
