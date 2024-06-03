class Solution {
    public int solution(int order) {
        int answer = 0;
        String num = Integer.toString(order);
        for(int i = 0; i < num.length(); i++){
            System.out.println(num.charAt(i));
            int judge = (int)num.charAt(i);
            if(judge == 51 || judge == 54 || judge == 57){
                answer++;
                
            }
        }
        return answer;
    }
}