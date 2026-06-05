import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";
        
        for(int i=0;i<a.length(); i++) {
            char b = a.charAt(i); //char를 이용하여 한글자 한글자를 length(인덱스)로 하나하나 확인
        
            if(Character.isLowerCase(b)) {
                //소문자라면 대문자로
                answer += Character.toUpperCase(b);
            } else {
                //대문자라면 소문자로
                answer += Character.toLowerCase(b);
            }
        }
        System.out.println(answer);
    }
}