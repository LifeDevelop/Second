package Java.VariousTools;

// RuntimeException 클래스를 상속하면 Unchecked Exception이 된다.
// Unchecked Exception은 예외처리를 해주지 않아도 컴파일 오류가 발생하지는 않는다.
// Unchecked Exception은 개발자의 실수가 있을 수 있는 부분에 사용하곤 하는 편이다.
public class ExceptionDefinedByUser_Unchecked extends RuntimeException{

    public ExceptionDefinedByUser_Unchecked(String msg){
        super(msg);
    }

    public ExceptionDefinedByUser_Unchecked(Exception e){
        super(e);
    }

}
