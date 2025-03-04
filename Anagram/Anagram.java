
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {
        Scanner ran = new Scanner(System.in);
        String Str1 = ran.nextLine();
        String Str2 = ran.nextLine();
        boolean ret = CheckAnagram(Str1, Str2);
        if (ret == true) {
            System.out.println("Anagram");
        } else if (ret == false) {
            System.out.println("Not Anagram");
        }
    }

    public static boolean CheckAnagram(String s1, String s2) {
        int l1 = s1.length();
        int l2 = s2.length();
        if (l1 != l2) {
            return false;
        }
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        int[] charCount = new int[26];
        for (int i = 0; i < l1; i++) {
            charCount[s1.charAt(i) - 'a']++;
            charCount[s2.charAt(i) - 'a']--;
        }
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}
