class Solution {
    public int solution(String num_str) {
        int answer = 0;
        int a = 0;
        for(int i = 0; i < num_str.length(); i++) {
            a = Integer.valueOf (String.valueOf((num_str.charAt(i))));
            answer += a;
        }
        return answer;
    }
}