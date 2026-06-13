class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        int[] a = new int[numbers.length];
        
        for(int i = 0;i<numbers.length; i++){
            a[i] = numbers[i]*2;
        }
        answer = a;
        return answer;
    }
}