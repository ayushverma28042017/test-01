public class Palindrome {
    public static void main(String[] args) {
        boolean result = isPallindrom("TEQuiT");
        System.out.println(result);
    }

    static boolean isPallindrom(String str) {
        if (str == null || str.length() < 2) {
            return true;
        }

        char s[] = str.toCharArray();
        for (int i = 0; i < str.length() / 2; i++) {
            int temp = str.length() - 1;
            if (s[i] != s[temp - i]) {
                return false;
            }
        }
        return true;
    }
}
