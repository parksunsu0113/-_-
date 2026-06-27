class Solution {
    public int[] solution(int n) {
        int b = 0;
        for(int i = 0; i<= n; i++) {
            if(i%2==1) {
                b++;
            }
        }
        int[] answer = new int[b];
        int a = 0;
        
        for(int i = 0; i <= n; ++i) {
            if(i%2==1) {
                answer[a] = i;
                a++;
            }
        }
        return answer;
    }
}