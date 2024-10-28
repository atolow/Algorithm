import java.util.*;

public class Solution {
    public int solution(int n) {
        
        int answer=0;
        int temp = 0;
        String num= String.valueOf(n);
        
        
         for (char a : num.toCharArray()) { 
            if (Character.isDigit(a)) { //숫자가 아니거나 0일경우
                temp=Character.getNumericValue(a);
            }
            System.out.println("temp = " + temp);
            answer+=temp;
        }
        System.out.println("answer = " + answer);

        return answer;
    }
}