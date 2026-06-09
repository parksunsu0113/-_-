class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        int abc1 = a+b+c;
        int abc2 = abc1*(a*a+b*b+c*c);
        int abc3 = abc2*(a*a*a+b*b*b+c*c*c);
        
        
        if(a == b && a == c && b == c){
            answer = abc3;
        } else if ((a != b && b == c) || (a != b && a == c)||(a == b && a != c)) {
            answer = abc2;
        } else {
            answer = abc1;
        }
        return answer;
    }
}