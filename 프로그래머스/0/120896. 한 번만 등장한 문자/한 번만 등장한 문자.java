import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        for(int i = 0; i < s.length(); i++){
            char word = s.charAt(i);
            int count = 0;
            for(int j = 0; j < s.length(); j++){
                if(word == s.charAt(j)){
                    count++;
                }
             }
            if(count == 1){
                answer += s.charAt(i);
            }
        }
        
        char[] charArray = answer.toCharArray();
        Arrays.sort(charArray);
        String sortedAnswer = new String(charArray);
        
        return sortedAnswer;
    }
}