package Java.VariousTools;

public class ExceptionExam {

        public static void main(String[] args) {
            int i = 10;
            int j = 0;

            //try-catch-finally 구문
            try{                                // 먼저 실행되는 블록
                int k = i / j;                  // 10/0 이기 때문에 수학적 예외상황 발생
                System.out.println(k);
            }catch(ArithmeticException e){      // 수학적 예외상황 발생시 객체e에 예외상황 저장 후 다음 코드 실행
                                                // Exception e로 하면 모든 예외상황을 처리할 수 있음
                System.out.println("0으로 나눌 수 없습니다. : " + e.toString());
                                                // e.toString() : 예외원인을 나타내주는 메서드
            }finally {                          // 예외상황이 발생하든, 발생하지 않든 실행되는 블록
                System.out.println("오류가 발생하든 안하든 무조건 실행되는 블록입니다.");
            }

            //throws-try-catch 구문 : 한 예외에서 여러가지 처리 방법이 필요할 때,
            // 함수를 통해 소스를 단순화시키고 싶을 때,
            // 그리고 예외가 생길것같은 부분 명시화시켜주기 위해 사용
            try{
                int k = devide(i, j);
                System.out.println(k);
            }

            catch(ArithmeticException e) {
                System.out.println("0으로 나눌 수 없습니다.");
            }

            // throw(throws와 다름!!)-try-catch 구문
            // 의도적으로 예외를 설정하는 방법
            try{
                int k = divide2(i, j);
                System.out.println(k);
            }catch(IllegalArgumentException e){
                System.out.println("0으로 나누면 안됩니다.");
            }

        }
                            // "야 던진다! 함수 호출되는곳에서 예외처리 해!" 떠넘기는 늭낌으로다가...
        public static int devide(int i, int j) throws ArithmeticException{
            int k = i / j;
            return k;
        }

        public static int divide2(int i, int j) throws IllegalArgumentException{

            if(j==0){
                throw new IllegalArgumentException("0으로 나눌 수 없습니다.");
            }
            int k = i / j;              // 예외문에서 catch로 넘어가므로 else를 쓸 필요가 없다.
            return k;
        }

}
