package recursion;

public class StringPermutaion {
    public static void main(String[] args) {
        permute(0,"ABCDEF");

        // 2
        String s = "cat";
        printallPermutns(s, "");
    }

    // Function to display all permutations of the string str
    static void printallPermutns(String str, String str2)
    {
        // check if string is empty or null
        if (str.length() == 0)
        {
            System.out.print(str2 + " ");
            return;
        }

        for (int i = 0; i < str.length(); i++)
        {
            // ith character of str
            char ch = str.charAt(i);
            // Rest of the string after excluding
            // the ith character
            String str3 = str.substring(0, i) + str.substring(i + 1);
            // Recursive call
            printallPermutns(str3, str2 + ch);
        }
    }
    // Driver code


    static String swap(int start, int end ,String s){

        char [] sChar = s.toCharArray();
        char temp =sChar[start];
        sChar[start] = sChar[end];
        sChar[end] = temp;
        return String.valueOf(sChar);

    }
    static void  permute(int index, String s){

        if(index==s.length()){
            System.out.println(s);
            return;
        }
       for(int i= index;i<s.length();i++) {
           s=swap(i,index,s);
           permute(index + 1, s);
           s=swap(i,index,s);
       }
    }
}
