class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = new int[arr.length];
        
        if(arr.length % 2 == 1) {
            for(int i = 0; i < arr.length; i++) {
                arr[i] += n;
                i++;
            }
        } else {
            for(int i = 1; i < arr.length; i++) {
                arr[i] += n;
                i++;
            }   
        }
        
        for(int i = 0; i < arr.length; i++) {
            answer[i] = arr[i];
        }
        
            
            
        return answer;
    }
}