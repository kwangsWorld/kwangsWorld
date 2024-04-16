class Solution {
    public int solution(int[] array) {
        int maxCount = 0;
        int mode = -1;
        int[] count = new int[1001]; // 요소가 1000 이하라고 가정
        
        for(int i = 0; i < array.length; i++){
            count[array[i]]++;
            if(count[array[i]] > maxCount){
                maxCount = count[array[i]];
                mode = array[i];
            } else if(count[array[i]] == maxCount){
                mode = -1;
            }
        }
        return mode;
    }
}
