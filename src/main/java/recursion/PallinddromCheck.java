package recursion;

public class PallinddromCheck {
    public static void main (String[] args)
    {
//        String str1 = "rotator";
//        String revstr = reverseString(str1); //revstr=reverse string
//        if (str1.equals(revstr))
//        {
//            System.out.println("The string" + str1 + " is a Palindrome String.");
//        }
//        else
//        {
//            System.out.println("The string" + str1 + " is not a Palindrome String.");
//        }

        testIntern();
        tricky();
    }
    // a method for reversing a string
    public static String reverseString(String str2)
    {
        String revstr = "";
        for (int i = str2.length() - 1; i >= 0; i--)
        {
            revstr += str2.charAt(i);
        }
        return revstr;
    }


    static void testIntern(){
        String str1 = "scaler";                          //Line1
        String str2 = new String("scaler");      //Line2
        str2.intern();
        // this will print false since we didn't assign it back to str2,//Line 3
        System.out.println(str1 == str2);
        str2 = str2.intern();
        System.out.println(str1 == str2);
         System.out.println(str1 == str2);
         System.out.println(str1 == str2);

    }

    static void tricky(){
        String str1 = new String("interviewbit");
        String str2 = new String("INTERVIEWBIT");
        System.out.println(str1 = str2); // it will print INTERVIEWBIT

    }
}
