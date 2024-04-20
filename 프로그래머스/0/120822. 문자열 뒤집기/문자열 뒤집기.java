class Solution {
    public String solution(String my_string) {
        
        char temp = ' ';
        
        char[] arr = my_string.toCharArray();
        
        for(int i = 0; i < arr.length / 2; i++){
            temp = arr[i];
            arr[i] = arr[arr.length-(i+1)];
            arr[arr.length-(i+1)] = temp;
        }
        
        
        String str = new String(arr);
        return str;
    }
}