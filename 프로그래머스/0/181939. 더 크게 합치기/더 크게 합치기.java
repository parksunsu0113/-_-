class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String a1 = String.valueOf(a);
        String b1 = String.valueOf(b);
        
        String ab = a1 + b;
        String ba = b1 + a;
        
        int ab1 = Integer.valueOf(ab);
        int ba1 = Integer.valueOf(ba);
        
        if(ab1 > ba1) {
            answer = ab1;
        } else if (ba1 > ab1) {
            answer = ba1;
        } else {
            answer = ab1;
        }
        return answer;
    }
}