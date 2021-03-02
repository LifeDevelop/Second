package Java.Conditions;

public class Switch {

    public static void main(String[] args) {

        int i = 4;
        switch(i){                                  // JDK7버전 이전은 변수로 정수만 받을 수 있었으나
                                                    // JDK7 이후는 문자열 String 변수도 사용 가능
            case 1 :
                System.out.println("1 실행");
                break;
            case 2 :
                System.out.println("2 실행");
                break;                              // break가 있기 때문에 "2 실행"만 출력
                                                    // 만약 case2부터 아래 다 순차적으로 실행시키고 싶으면
                                                    // break를 빼면 됨
            case 3, 4 :
                System.out.println("3 실행");
                break;
            default :                               //변수가 케이스와 매치되는 값이 없을 경우 실행
                System.out.println("default 실행");
        }

    }

}
