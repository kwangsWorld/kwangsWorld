class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String str = Integer.toString(num);
        int[] array = new int[str.length()];
        for(int i = 0; i < str.length(); i++){
            array[i] = Character.getNumericValue(str.charAt(i));
        }
        
        for(int i = 0; i < array.length; i++){
            if(array[i] == k){
                answer = i+1;
                break;
            }
            if(answer == 0){
                answer = -1;
            }
        }
        
        return answer;
    }
}