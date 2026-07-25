class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int Max = sides[0];
        int MaxN = 0;
        
        for(int i = 0; i < 2; i++) {
            if(Max < sides[i+1]) {
                MaxN += Max;
                Max = sides[i+1];
            } else {
                MaxN += sides[i+1];
            }
        }
        if(Max >= MaxN) {
            answer = 2;
        } else {
            answer = 1;
        }
        
        
        return answer;
    }
}