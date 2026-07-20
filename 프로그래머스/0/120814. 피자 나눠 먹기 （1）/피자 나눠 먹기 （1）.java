class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if(n % 7 == 0) { //n을 7(피자갯수)로 나눴을때 나머지가 없다면)
            answer = n/7; //피자(한판) 의 갯수는 변하지 않음(조각이 따로 필요 없기 때문)
        } else { //n을 7(피자갯수)로 나눴을때 나머지가 있다면)
            answer = n/7 + 1; //피자조각이 모자르기 때문에 한판이 추가로 필요해 +1
        }
        return answer;
    }
}