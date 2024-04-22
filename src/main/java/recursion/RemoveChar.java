package recursion;

public class RemoveChar {
    public static void main(String args[])
    {
        String str = "Scaler by InterviewBit";

        //remove the specified character.
        System.out.println("String after removing 'e' = "+str.replace("e", ""));
        //remove the first occurrence of the specified character.
        System.out.println("String after removing First 'e' = "+str.replaceFirst("e", ""));

        //remove all occurrences of the specified character.
        System.out.println("String after replacing all small letters = "+str.replaceAll("([A-Z])", ""));
    }
}
