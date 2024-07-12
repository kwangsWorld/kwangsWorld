class Solution {
    public int solution(int n, int t) {
        int answer = 0;
        int hour = 0;
        while(true){
            n *= 2;
            hour++;
            if(hour == t){break;}
        }
        return n;
    }
}