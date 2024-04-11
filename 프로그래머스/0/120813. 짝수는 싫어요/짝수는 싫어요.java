class Solution {
    public int[] solution(int n) {
        int cnt;
        if(n % 2 == 0){
            cnt = n / 2;
        }else{
            cnt = (n / 2) + 1;
        }
        int[] answer = new int[cnt];
        for(int i = 0; i < cnt; i++){
            answer[i] = (2*i) + 1;
        }
        
        return answer; 
    }
}