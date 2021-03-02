package Java.ClassAndString;

public class StringExam {

    public static void main(String[] args) {

        //new 연산자 이용하지 않고 인스턴스를 만드는 경우
        String str1 = "hello";              // hello 라는 상수로써 인스턴스 생성
        String str2 = "hello";              // str1과 같은 값이므로 이미 만들어진 str1의 인스턴스를 가리킨다.
        if(str1 == str2)
            System.out.println("str1과 str2는 같은 레퍼런스입니다.");

        //new 연산자 이용
        String str3 = new String("Hello");
        String str4 = new String("Hello");      // str3과 같은 값이지만, 인스턴스를 새롭게 생성
        if(str3 != str4)
            System.out.println("str3와 str4는 다른 레퍼런스입니다.");

        // 메모리를 아끼려면 new 연산자를 이용하지 않는 편이 좋다.
        // String은 불변 클래스이다. 인스턴스가 생성될 때 가지고 있던 값을 수정할 수 없다.
        // String은 문자열과 관련된 다양한 메서드를 갖는데, 모두 새로운 String을 생성해서 반환한다.(기존 String 변화x)
        // 자주 쓰이는 메서드
        String str5 = str4.substring(2);    // 결과값은 2번 인덱스부터 llo
        String str6 = str4.substring(0,4);  // Hell
        String str7 = str4.concat(" World"); // Hello World
        str3.equals(str4);                  // 값 비교(boolean type) : true
        int a = str7.length();              // Hello World의 글자수 : 11(공백 포함)

        System.out.println(str4 + str5 + str6 + str7);
        System.out.println(str3.equals(str4));
        System.out.println(a);

    }

}
