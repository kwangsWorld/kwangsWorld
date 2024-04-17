class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        int temp = 0;
        
        for(int i = 0; i < (num_list.length / 2) +1; i++){
            temp = num_list[i];
            answer[i] = num_list[num_list.length - (i+1)];
            answer[num_list.length - (i+1)] = temp; 
        }
        return answer;
    }
}