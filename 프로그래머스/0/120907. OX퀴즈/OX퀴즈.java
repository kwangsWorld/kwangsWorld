class Solution {
    public String[] solution(String[] quiz) {
        
        String[] answer = new String[quiz.length];
        
        for(int i = 0; i < quiz.length; i++){
            String str = quiz[i];
            String[] splitStr = str.split(" ");
            int pre = Integer.parseInt(splitStr[0]);
            int post = Integer.parseInt(splitStr[2]);
            int result = Integer.parseInt(splitStr[4]);
            if(splitStr[1].equals("+")){
                if(pre + post == result){
                    answer[i] = "O";
                }else{
                    answer[i] = "X";
                }
            }else{
                if(pre - post == result){
                    answer[i] = "O";
                }else{
                    answer[i] = "X";
                }
            }
            
            // for(int j = 0; j < splitStr.length; j++){
            //     System.out.println(splitStr[j]);
            // }
        }
        return answer;
    }
}