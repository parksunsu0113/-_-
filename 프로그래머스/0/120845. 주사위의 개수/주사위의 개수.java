class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        int[] sum = new int[3];
        int[] cnt = new int[3];
        
        while(true) {
            if(box[0] - sum[0] >= n) {
                
                sum[0]+=n;
                cnt[0]++;
            } else {
                break;
            }
        }
        while(true) {
            if(box[1] - sum[1] >= n) {
                
                sum[1]+=n;
                cnt[1]++;
            } else {
                break;
            }
        }
        while(true) {
            if(box[2] - sum[2] >= n) {
                
                sum[2]+=n;
                cnt[2]++;
            } else {
                break;
            }
        }
        answer = cnt[0] * cnt[1] * cnt[2];
        return answer;
    }
}