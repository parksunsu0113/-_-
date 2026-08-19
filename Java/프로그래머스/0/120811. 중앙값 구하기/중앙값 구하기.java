class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int temp = 0;
        for(int j = 0; j < array.length-1; j++) {
            for(int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
        }
        int a = array.length/2;
        answer = array[a];
        return answer;
    }
}