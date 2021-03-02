package Java.Array;

public class FirstDimensionArray {

    public static void main(String[] args) {

        //정수를 저장할 수 있는 배열의 크기를 정해준 후, 초기화하는 방법
        int[] array1 = new int[4];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        array1[3] = 4;

        //배열의 선언과 동시에 초기화하는 방법
        int[] array2 = new int[]{1,2,3,4,5};

        //배열에 저장된 값을 꺼내서 사용하는 방법
        int value = array1[2];
        //array1 이 참조하는 배열의 2번 인덱스에 해당하는 값 3을 꺼내서 int형 변수 value에 담는다.

    }

}
