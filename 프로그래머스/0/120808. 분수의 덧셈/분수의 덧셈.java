class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int mulNum;
        int numer;
        int denom;
        int maxNum = 1;
        if(denom1 % denom2 == 0 || denom2 % denom1 == 0){
            if(denom1 > denom2){
                mulNum = denom1 / denom2;
                denom = denom1;
                numer2 *= mulNum;
                numer = numer1 + numer2;
            }else{
                mulNum = denom2 / denom1;
                denom = denom2;
                numer1 *= mulNum;
                numer = numer1 + numer2;
            }
        }else{
            denom = denom1 * denom2;
            numer = (numer1 * denom2) + (numer2 * denom1);
        }
        
        for(int i = 1; i <= denom; i++){
            if(denom % i == 0 && numer % i == 0){
                maxNum = i;
            }
        }
        
        answer[0] = numer/maxNum;
        answer[1] = denom/maxNum;
        return answer;
    }
}