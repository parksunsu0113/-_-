class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String a1 = String.valueOf(a);
        
        
        String ab = a1 + b;
        
        
        int ab1 = Integer.valueOf(ab);
        int ab2 = a*b*2;
        
        if(ab1 > ab2) {
            answer = ab1;
        } else if (ab2 > ab1) {
            answer = ab2;
        } else {
            answer = ab1;
        }
        return answer;
    }
}