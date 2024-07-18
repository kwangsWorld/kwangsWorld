class Solution {
    public int solution(int[] numbers) {
        int answer = -1000000000;
        int mulNum = 0;
        for(int i = 0; i < numbers.length; i++){
            for(int j = i+1; j < numbers.length; j++){
                mulNum = numbers[i] * numbers[j];
                // System.out.println("i : " + i + ", j : " + j + ", mulNum = " + mulNum + ", answer = " + answer);
                if(mulNum > answer){answer = mulNum;}
            }
        }
        return answer;
    }
}