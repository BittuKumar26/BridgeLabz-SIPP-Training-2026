import java.util.*;
public class LC_9_PalindromeNumber {
    public static void main(String args[]){
        int x=-121;
        System.out.println(isPalindrome(x));
    }
    public static boolean isPalindrome(int x){
        String str=String.valueOf(x);
        int left=0;
        int right=str.length()-1;
        while(left<right){
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }   
}
