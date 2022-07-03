package EasyProblems;

public class ReverseString {
    public static void reverseString(char[] s) {

        for (int i = s.length-1; i>=0;i--){
            System.out.print("["+s[i] +",]");
        }
    }

    public static void main(String[] args) {
        char[] letters = {'H', 'e', 'l', 'l', 'o'};
        reverseString(letters);
    }
}
