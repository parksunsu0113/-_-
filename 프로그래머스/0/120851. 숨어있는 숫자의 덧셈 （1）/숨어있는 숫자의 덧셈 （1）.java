class Solution {
    public int solution(String my_string) {
        int answer = 0;
        for(int i = 0; i < my_string.length(); i++) {
            if('1' <= my_string.charAt(i) && my_string.charAt(i) <= '9') {
                answer += my_string.charAt(i) - '0'; //(int) 로 변환하는것은 아스키코드가 나온다 '0'을 빼주면 그 ''안에 온전한 값이 나온다 ㅎㅎ..
            }
        }
        return answer;
    }
}