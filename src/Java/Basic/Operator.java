package Java.Basic;

/**
 * [연산자 우선순위]
 * 최우선연산자 ( ., [], () )
 * 단항연산자 ( ++,--,!,~,+/-   : 부정, bit변환>부호>증감)
 * 산술연산자 ( *,/,%,+,-,shift) < 시프트연산자 ( >>,<<,>>> ) >
 * 비교연산자 ( >,<,>=,<=,==,!= )
 * 비트연산자 ( &,|,^ )
 * 논리연산자 (&& , || , !)
 * 삼항연산자 (조건식) ? :
 * 대입연산자 =,*=,/=,%=,+=,-=
 */

public class Operator {

    public static void main(String[] args) {

        int i1, i2, i3, i4, i5, i6, i7, i, j;    // 피연산자 선언

        i1 = -5;                    // 대입연산자 '=', 부호연산자 '+', '-'
        i2 = +i1;                   // -5 대입
        i3 = -i1;                   // 5 대입

        i4 = ++i3;                  // 증감연산자 ++, --. i3이 6이 되고 i4에 6 대입
        i5 = i3++;                  // i5에 6 대입하고 i3이 7이 됨
        i6 = --i3;                  // i3이 6이 되고 i6에 6 대입
        i7 = i3--;                  // i7에 6 대입하고 i3이 5가 됨

        System.out.println(i3);     // 5
        System.out.println(i4);     // 6
        System.out.println(i5);     // 6
        System.out.println(i6);     // 6
        System.out.println(i7);     // 6

        i = 1;
        j = 10;

        System.out.println(i + j);    // 산술연산자. 11
        System.out.println(i - j);    // -9
        System.out.println(i * j);    // 10
        System.out.println(i / j);    // 나눈 몫. 0으로 출력되고, 피연산자가 실수형일시 소수점 이하 값 출력
        System.out.println(i % j);    // 나눈 나머지.

        System.out.println(i == j);    // 비교연산자. false
        System.out.println(i != j);    // true
        System.out.println(i < j);    // true
        System.out.println(i <= j);    // true
        System.out.println(i > j);    // false
        System.out.println(i >= j);   // false

        i += 10;                    // 복합 대입 연산자. i = i + 10과 같은 의미
        // -=, +=, *=, %=, /= 등 여러가지가 있음

        i = 7;
        j = 4;
        int k = i & j;              // k = 4가 됨
        // &, |, ^ : 비트 연산자 (순서대로 and, or, xor)
        // 연산과정 : 7 = 0000 0000 0000 0000 0000 0000 0000 0111 (2)
        //          4 = 0000 0000 0000 0000 0000 0000 0000 0100 (2)
        // 7 & 4 는 비트별 곱한 값 반환
        int l = i | j;              // 7 | 4 는 비트별 더한 값 반환
        int m = i ^ j;              // 7 ^ 4 는 비트별 비교 후 같으면 0, 다르면 1 반환
        // 즉, 7 & 4 = 4, 7 | 4 = 7, 7 ^ 4 = 3

        int x = 10;
        int y = 20;
        boolean z = ++x > y && x < ++y; // 이 문장 실행 후, x는 11이 되지만 y는 20 그대로임
        // 그 이유는, 논리연산자 '&&'는 앞의 구문이 false이면 뒤의 구문을 실행하지 않고 바로 false를 return하기 때문
        // 마찬가지로, '||'또한 앞의 구문이 true면 뒤의 구문을 실행하지 않고 바로 true를 반환함
        // 뒤의 구문도 실행시키고 싶으면 논리연산자'&', '|'를 쓰면 되는데(비트연산자와 다름)
        // '&'와 '|'보다 '&&', '||'의 실행속도가 더 빠르다. (자바에서만 쓰이는 단락회로 방식)

        short a = 10;
        short b = 20;
        short c = a > b ? a : b;    // 삼항연산자 ? : 구문
                                    // 조건문 ? true일 시 반환값 : false일 시 반환값



    }




}