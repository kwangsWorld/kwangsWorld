class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        int min = 0;
        int min2 = 0;
        int max = 0;
        
        if(sides[0] < sides[1]){
            min = sides[0];
            if(sides[1] < sides[2]){
                min2 = sides[1];
                max = sides[2];
            }else{
                min2 = sides[2];
                max = sides[1];
            }
        }else{
            min = sides[1];
            if(sides[0]< sides[2]){
                min2 = sides[0];
                max = sides[2];
            }else{
                min2 = sides[2];
                max = sides[0];
            }
        }
        
        if(max - (min + min2) >= 0){answer = 2;}
        else{answer = 1;}
        
        
        return answer;
    }
}