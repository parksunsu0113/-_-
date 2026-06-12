class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = -1;
        int sum1 = 0;
        for(int i = 0; i<num_list.length; i++){
            if(num_list[i] < 0) {
                sum++;
                sum1++;
                answer = sum;
                break;
            } else if(num_list[i] > 0){
                sum++;
                if (sum1 == 0){
                answer = -1;
                }
            } 
        }
        return answer;
    }
}