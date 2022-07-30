package leetcode.easyproblems;

public class PalindromeNumber {
    public boolean isPalindrome(int x){

        int sum = 0, r, temp;
        temp = x;
        while (x>0){
            sum =sum * 10 +(x%10);
            x/=10;
        }
        if(temp ==sum){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        PalindromeNumber palindromeNumber = new PalindromeNumber();
        System.out.println(palindromeNumber.isPalindrome(121));
    }
}
