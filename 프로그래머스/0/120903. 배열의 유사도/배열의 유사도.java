class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for(int i = 0; i < s1.length; i++){
            for(int j = 0; j < s2.length; j++){
                if(s1[i].equals(s2[j])){
                    answer++;
                }
                // System.out.println("s1의 값: " + s1[i] + " /s2의 값: "+ s2[j] + "/answer : " + answer);
            }
        }
        return answer;
    }
}