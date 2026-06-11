class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int all_num1 = 0;
        int all_sum1 = 1;
        int all_sum2 = 0;
        int all_sum22 = 0;
        
        for(int i = 0; i<num_list.length; i++){
            all_num1 = num_list[i];
            all_sum1 *= all_num1; //곱한거
            all_sum2 += all_num1;
            all_sum22 = all_sum2*all_sum2; //더하고 제곱한거
            
            if(all_sum1>all_sum22) {
                answer = 0;
            }else {
                answer = 1;
            }
        }
        return answer;
    }
}