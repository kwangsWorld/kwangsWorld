class Solution {
    public int solution(String s) {
        int answer = 0;
        int lastAdded = 0;
        String[] str = s.split(" ");
        for(int i = 0; i < str.length; i++){
            int number = 0;
            try{
                number = Integer.parseInt(str[i]);
                answer += number;
                lastAdded = number;
            }catch(Exception e) {
            if(str[i].equals("Z")){
                answer -= lastAdded;
            }
            }
        }
        return answer;
    }
}