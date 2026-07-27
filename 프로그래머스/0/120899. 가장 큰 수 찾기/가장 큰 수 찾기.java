class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int max = array[0];
        int maxIdx = 0;
        for(int i = 0; i < (array.length)-1; i++) {
            if(array[i] <array[i+1]) {
                max = array[i+1];
                maxIdx = i+1;
            }
        }
        answer[0] = max;
        answer[1] = maxIdx;
        return answer;
    }
}