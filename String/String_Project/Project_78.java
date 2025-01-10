package String.String_Project;

public class Project_78 {
    public static void main(String[] args) {
        //78- Accept a space seperated sentence and split in into words. Print each word on a new line with first letter capitalized.
        //      IN-      Hello bhai kaise ho
        //      OP-     Hello
        //                 Bhai
        //                 Kaise
        //                 Ho

        String input = "Bolo bhaI kaise ho";
        String[] ans = input.split(" ");

        for (String word : ans) {
            String temp = "";
            temp += (char) (word.charAt(0) - 32) ;
            temp += word.substring(1);
            System.out.println(temp);
        }

        // Method II
//        String[] word = input.split(" ");
//        for (String words : word){
//            String captalizedWord = words.substring(0,1).toUpperCase() + words.substring(1);
//            System.out.println(captalizedWord);
//        }
    }
}
