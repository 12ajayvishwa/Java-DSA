
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class RomanToInteger {

    public int romanToInt(String s) {
        Map<Character, Integer> m = new HashMap<>();

        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);
        //Parenthesis Checker
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && m.get(s.charAt(i)) < m.get(s.charAt(i + 1))) {
                ans -= m.get(s.charAt(i));
            } else {
                ans += m.get(s.charAt(i));
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Roman number : ");

        RomanToInteger converter = new RomanToInteger();
        String romanNumeral = myObj.nextLine();  // Example input
        int result = converter.romanToInt(romanNumeral);
        System.out.println("The integer value of " + romanNumeral + " is: " + result);
    }

}
