class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        if(n % slice == 0) { //손님의 수와 조각수가 같다면
            answer = n/slice; //조각의 수와 손님의 수가 나누어 떨어지기에 추가판 x
        } else { //손님의 수와 조각의 수가 다르다면
            answer = n/slice + 1; //조각의 수와 손님의 수가 나누어 떨어지지않기에 추가 한판 + 1
        }
        return answer;
    }
}