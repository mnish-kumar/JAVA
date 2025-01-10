package String.String_Project;

public class Project_76 {
    public static void main(String[] args) {
        //Question -> 76- Toggle each alphabet of String
        //            In - AcgDfD Output - aCGdFd

        String letter = "AcgDfD";
       // char array[] = letter.toCharArray();

        String ans = " ";
        for (char ch : letter.toCharArray()) {
            if (ch >= 'a' && ch <= 'z')
                ans += (char) (ch - 32);
            else
                ans += (char) (ch + 32);
        }
        System.out.println(ans);
    }
}
