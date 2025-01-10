package String;

public class Basic {
    public static void main(String[] args) {

        // true print hoga kyunki same name store hai memory me
//        String m = "Manish";
//        String m1="Manish";
//        System.out.println(m==m1);


        // s variable me hi do name save hai but print second wala hoga -> Extra details visit to copy
//        String s= "Shrey";
//        s="Manish";
//        System.out.println(s);

        String m = "MANISH";
        System.out.println(m.length());  // for size = 6
        System.out.println(m.toLowerCase());    // for all character convert into small letter = manish
        System.out.println(m.charAt(0));        // print which letter is present at index 0 = m
        System.out.println(m.indexOf("IS"));     // letter are which index have present I = 3 starting
        System.out.println(m.lastIndexOf("H"));  // H have which index have present
        String m1 = "Priyanka    ";
        System.out.println(m1.trim());                // Clean space starting and end like = "    MANISH   " => "MANISH"
        System.out.println(m.compareTo(m1));            // compare to value true and false answer
        System.out.println(m.equals(m1));             // compare the value
        System.out.println(m.substring(0, 4));         // 0 to 4th index print value which is given
        System.out.println(m.substring(6));     // index is 5 and size is 6 in String not print out of index till size of 6
        System.out.println(m == m1);                      // value compare and memory address
        //System.out.println(m.substring(7));     // string out of bond

        // equals to -> value compare
        // compare to => value compare true or false
        // == -> memory address and value compare
    }
}
