package String;

import java.util.Arrays;
import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        //71- Accept a string from user and print its each character on a new line
//        String sc = "shrey";
//        for (int i = 0; i < sc.length(); i++) {
//            System.out.println(sc.charAt(i));
//        }

//        System.out.println("\nReverse form ");
//        for (int i = sc.length()-1; i >=0 ; i--) {
//            System.out.println(sc.charAt(i));
//        }

//        String s = "aba";
//        String rev ="";
//        for (int i = s.length()-1; i >=0 ; i--) {
//            rev = rev  + s.charAt(i);
//        }
//        System.out.println(s == rev ? "Yes" : "No");


//        String m = "manish";
//        // String to Array
//        char ch[] = m.toCharArray();
//        //System.out.println(Arrays.toString(ch));
//        int i = 0;
//        int j = ch.length - 1;
//        while (i < j) {
//            char temp = ch[i];
//            ch[i] = ch[j];
//            ch[j] = temp;
//            i++;
//            j--;
//        }
//        System.out.println(Arrays.toString(ch));


//        // Array to string
//        String rev = "";
//        for (char chr : ch)
//            rev = rev + chr;
//        System.out.println(rev);


//        String Alphabet = "aeiofdgb";
//        int v = 0;
//        int c = 0;
//        for (char ch : Alphabet.toCharArray()) {
//            switch (ch) {
//                case 'a', 'e', 'i', 'o', 'u' -> v++;
//                default -> c++;
//            }
//        }


//        String firstName = "Manish";
//        String Lastname = "Kumar";
//        System.out.println(firstName.concat(Lastname));


        // 76- Toggle each alphabet of String
        // In - AcgDfD Output - aCGdFd

        //77-> 97=a , 65=A , 0=
//        String s = "aBcD";
//        char arr[] = s.toCharArray();
//
//        String ans = "";
//        for (char ch : arr) {
//            if (ch >= 'a' && ch <= 'z')
//                ans += (char) (ch - 32);
//            else
//                ans += (char) (ch + 32);
//        }
//        System.out.println(ans);


        // 77
//        String[] array = {"pay", "attention", "practice", "attend"};
//        String pref = "at";
//        int c = 0;
//        for (String s1 : array) {
//            if (s1.indexOf(pref) == 0) ; // (s1.startsWith(pref)) give to boolean answer
//            c++;
//        }
//        System.out.println(c);


        // 78 - split method
//        String s = "Hello bhai kaise ho";
//        String[] ans = s.split(" ");
//        String temp = "";
//        for (String word : ans) {
//            temp = "";
//            temp += (char) (word.charAt(0) - 32);    // Character.toUpperCase(word.charAt(0) + word.substring(1)
//            temp += word.substring(1);
//            System.out.println(temp + " ");
//        }


        //82
        Scanner sc = new Scanner(System.in);
//        String s1 = sc.nextLine();
//        String s2 = sc.nextLine();
//        if (s1.length() != s2.length()){
//            System.out.println("Not anagram");
//        }
//        else {
//            char arr1[] = new char[][26];
//            int arr2[] = new int [26];
//            for (int i = 0; i < s1.length(); i++) {
//               char ch = s1.charAt(i);
//               char ch2 = s2.charAt(i);
//               arr1[ch - 97]++;
//               arr1[ch - 97]++;
//            }
//        }

        String s = sc.nextLine();
        String[] arr = s.split(" ");

        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[j] .equals(arr[i + 1])){
                    String temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));


    }
}
