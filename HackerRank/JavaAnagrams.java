import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class JavaAnagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function

        a = a.replace(" ", "").toLowerCase();
        b = b.replace(" ", "").toLowerCase();

        char [] arr1 = a.toCharArray();
        char [] arr2 = b.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1,arr2)){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );

    }
}
