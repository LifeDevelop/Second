package Java;

import java.util.Scanner;

public class Solution{
public void input(){
    Scanner s = new Scanner(System.in);
    while(true) {
        try {
            int tmp = s.nextInt();
            if (tmp < 1 || tmp > 10000) {
                System.out.println("N은 1부터 10000사이의 정수를 입력해야 합니다.");
            }
            else if(tmp >= 1 || tmp <= 10000){
                int n = tmp;
            }
            else{

            }
        }
        catch(Exception e){

        }
    }
}


}