package Java.VariousTools;

public class ExceptionDefinedExam {

    class Experiment{
        public void experimentUnchecked(int i) throws ExceptionDefinedByUser_Unchecked{
            System.out.println("Unchecked 실험을 시작합니다.");
            if(i<0)
                throw new ExceptionDefinedByUser_Unchecked("매개변수는 0이상이어야 합니다.");
            System.out.println("Unchecked 실험을 종료합니다.");
        }

        public void experimentChecked(int i) throws ExceptionDefinedByUser_Checked{
            System.out.println("Checked 실험을 시작합니다.");
            if(i<0)
                throw new ExceptionDefinedByUser_Checked("매개변수는 0이상이어야 합니다.");
            System.out.println("Checked 실험을 종료합니다.");
        }

    }

    public static void main(String[] args) {

        ExceptionDefinedExam t = new ExceptionDefinedExam();
        ExceptionDefinedExam.Experiment exp = t.new Experiment();

        exp.experimentUnchecked(4);
        exp.experimentUnchecked(-5);

//        exp.experimentChecked(4);               => 컴파일 오류
//        exp.experimentChecked(-5);              => 컴파일 오류

        try {
            exp.experimentChecked(4);
        } catch (ExceptionDefinedByUser_Checked e) {
            e.printStackTrace();                            // 오류원인을 출력해주는 메서드
        }
        try {
            exp.experimentChecked(-5);
        } catch (ExceptionDefinedByUser_Checked e) {
            e.printStackTrace();
        }
    }

}
