class Solution {
    public int solution(int hp) {
        int answer = 0;
        
        for(int i = 5; i >= 1; i-=2){
            answer += (hp / i);
            hp -=  (hp / i) * i;
            if(hp == 0){break;}
            
        }
        return answer;
    }
}