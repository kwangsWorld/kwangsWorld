import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        int numberCount = 0;
        
        
        for(int i = 0; i < my_string.length(); i++){
            char testChar = my_string.charAt(i);
            if( testChar >= '0' && testChar <= '9'){
                numberCount++;
            }
        }
        
        int[] answer = new int[numberCount];
        int answerIndex = 0;
        
        for(int i = 0; i < my_string.length(); i++){
            char testChar = my_string.charAt(i);
            if( testChar >= '0' && testChar <= '9'){
                answer[answerIndex] = Character.getNumericValue(testChar);
                answerIndex++;
            }
        }
        Arrays.sort(answer);
        
        return answer;
    }
}