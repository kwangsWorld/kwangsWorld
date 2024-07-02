class Solution {
    public int[] solution(int n) {
        int[] answer = new int[10000];
        int number = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                answer[number] = i;
                number++;
            }
        }
        
        int[] realAnswer = new int[number];
        for(int i = 0; i < number; i++){
            realAnswer[i] = answer[i];
        }
        
        return realAnswer;
    }
}