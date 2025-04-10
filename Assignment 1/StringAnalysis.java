import java.util.Scanner;

public class StringAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int vowels = 0, consonants = 0, digits = 0, specialChars = 0;

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                if (isVowel(c)) {
                    vowels++;
                } else {
                    consonants++;
                }
            } else if (Character.isDigit(c)) {
                digits++;
            } else {
                specialChars++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Special characters: " + specialChars);
    }

    private static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
