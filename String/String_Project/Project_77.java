package String.String_Project;

public class Project_77 {
    public static void main(String[] args) {
        //77- Take an array of strings words and a String Prefix. Print the number of strings in words that contain pref as a prefix.
        //       Example - Input: words = ["pay", "attention", "practice", "attend"], pref = "at"
        //                        Output: 2

        String[] array = {"pay", "attention", "practice", "attend"};
        String pref = "at";
        int count = 0;

        for (String s : array) {
           //if (s.indexOf(pref) == 0) ;
            if (s.startsWith(pref))
            count++;
        }

        System.out.println("Output : " + count);

    }
}
