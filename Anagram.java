
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {
        Scanner ran = new Scanner(System.in);
        String str1 = ran.nextLine();
        String str2 = ran.nextLine();
        boolean ret = CheckAnagram(str1, str2);
        if (ret == true) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }

    public static boolean CheckAnagram(String str1, String str2) {
        int l1 = str1.length();
        int l2 = str2.length();

        if (l1 != l2) {
            return false;
        }
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        int[] charCount = new int[26];
        for (int i = 0; i < l1; i++) {
            charCount[str1.charAt(i) - 'a']++;
            charCount[str2.charAt(i) - 'a']--;
        }
        for (int word : charCount) {
            if (word != 0) {
                return false;
            }
        }
        return true;
    }
}
