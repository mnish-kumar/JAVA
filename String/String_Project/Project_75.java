package String.String_Project;

public class Project_75 {
    public static void main(String[] args) {
        // Question -> 75- Count vowels and consonants in a string
        String Alphabet = "abecdegohd";
        int vowel = 0;
        int consonant = 0;

        for (char count : Alphabet.toCharArray()) {
            switch (count) {
                case 'a', 'e', 'i', 'o', 'u' -> vowel++;
                default -> consonant++;
            }
        }
        System.out.println("Vowel : " + vowel + "\n" + "Consonant : " + consonant);
    }
}
