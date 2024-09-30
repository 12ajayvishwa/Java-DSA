
import java.util.Scanner;

public class ReversedWord {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.err.println("Enter a String : ");
        String str = scanner.nextLine();

        String[] words = str.split("");
        StringBuilder reversedString = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversedString.append(words[i]);

            if (i != 0) {
                reversedString.append(".");
            }
        }

        System.out.println("Reversed string: " + reversedString.toString());

        scanner.close();
    }
}
