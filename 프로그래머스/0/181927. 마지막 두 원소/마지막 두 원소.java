class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length+1];
        int n = num_list.length;
        int a = 0;
        
        if(num_list[n-1] > num_list[n-2] ) { //마지막 방번호 = (배열 방갯수) -1
            a = num_list[n-1] - num_list[n-2];
        } else {
            a = num_list[n-1] * 2;
        }
        
        for(int i = 0; i <= n; i++) {
            if(i < n) {
                answer[i] = num_list[i];
            }
            if(i == n) {
                answer[i] = a;
            }
        } 
        return answer;
    }
}