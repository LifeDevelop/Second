package Java.Repeat;

public class For {

    public static void main(String[] args) {

        /**
         * <for문 문법>
         *     for(초기화식; 조건식; 증감식){
         *         실행문;
         *         실행문;
         *     }
         */

        //exmaple, 1부터 100까지 짝수의 합 구하는 예제
        int total = 0;
        for(int i = 1; i <= 100; i++){
            if(i % 2 != 0){  // 2로 나눈 나머지가 0이 아니라는것은 홀수를 의미한다.
                continue; // 홀수일 경우 뒤의 문장들이 실행되지 않고 증감식 실행 후 다음 반복 실행
            }
            total = total + i;
        }
        System.out.println(total);

        //배열을 사용하는 for-each 구문 예제 (자바 1.5버전부터 추가)
        int[] iarr = {10,20,30,40,50};

        for(int value:iarr){               // value에 배열의 값이 0번 인덱스부터 차례대로 반환되고,
                                           // 배열의 길이만큼 반복문이 실행된다.
            System.out.println(value);     // 10 20 30 40 50이 순서대로 출력
        }

    }

}
