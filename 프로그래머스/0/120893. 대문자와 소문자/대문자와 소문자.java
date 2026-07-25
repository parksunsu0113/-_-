class Solution {
    public String solution(String my_string) {
        String answer = "";
        int a = 0;
        
        for(int i = 0; i < my_string.length(); i++) {
            a = (int)(my_string.charAt(i));
            if(a < 97) {
                a += 32;
                answer += (char)a;
            } else {
                a -= 32;
                answer += (char)a;
            }
        }
        
        return answer;
    }
}