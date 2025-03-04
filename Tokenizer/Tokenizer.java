
import java.util.Scanner;

public class Tokenizer {

    public static void main(String[] args) {
        Scanner ran = new Scanner(System.in);
        String Str = ran.nextLine();
        MakeStringToken(Str);
    }

    public static void MakeStringToken(String string) {
        String[] token = string.trim().split("[^a-zA-Z]+");

        if (token.length == 1 && token[0].isEmpty()) {
            System.out.println(0);
            return;
        }
        System.out.println(token.length);
        for (String tokens : token) {
            System.out.println(tokens);
        }
    }
}
