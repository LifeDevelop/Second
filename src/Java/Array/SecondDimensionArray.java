package Java.Array;

public class SecondDimensionArray {

    public static void main(String[] args) {

        //정수를 4개씩 저장할 수 있는 3개의 배열 선언 후, 하나씩 초기화하는 방법
        int[][] array4 = new int[3][4];         // 3행 4열의 행렬을 이미지하면 편하다
        array4[0][0] = 0;
        array4[0][1] = 1;

        //가변 크기의 2차원 배열을 선언하는 방법
        int[][] array5 = new int[3][];

        array5[0] = new int[1];                 // array5의 0번 index 배열의 크기 : 1
        array5[1] = new int[2];                 // array5의 1번 index 배열의 크기 : 2
        array5[2] = new int[3];                 // array5의 2번 index 배열의 크기 : 3

        //선언과 동시에 초기화하는 방법
        int[][] array6 = {{1}, {2,3}, {4,5,6}};

    }

}
