class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        int element = 0;
        for(int i = 0; i < (num_list.length/n); i++){
            for(int j = 0; j < n; j++){
                answer[i][j] = num_list[element];
                element++;
                System.out.println("answer[" + i +"]"+"[" + j + "]" + " = " + answer[i][j]);
            }
        }
        return answer;
    }
}