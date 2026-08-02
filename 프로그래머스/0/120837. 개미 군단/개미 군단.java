class Solution {
    public int solution(int hp) {
        int answer = 0;
        int n = 0;
        answer += hp/5;
        n = hp%5;
        answer += n/3;
        n = n%3;
        answer += n;
        
        
        return answer;
    }
}