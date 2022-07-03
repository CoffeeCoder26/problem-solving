package EasyProblems;

public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        int lenWord = 0;
        boolean isTrue =false;
        String str = s.trim();
        for (int i =str.length()-1; i>=0;i--){
            if (Character.isLetter(str.charAt(i))){
               isTrue = true;
               lenWord++;
            }else{
                if(isTrue){
                    return lenWord;
                }
            }
        }
        return lenWord;

    }

    public static void main(String[] args) {
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
        System.out.println(lengthOfLastWord.lengthOfLastWord("   fly me   to   the moon  "));
    }
}
