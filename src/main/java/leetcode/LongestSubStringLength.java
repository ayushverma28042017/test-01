package leetcode;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringLength {

    public int lengthOfLongestSubstring(String s) {

        char s1[] = s.toCharArray();
        int start=0;
        int end=0;
        Map<Character,Integer> tempMap = new HashMap<>();

        for(int i=0;i<s.length();i++){
            if(tempMap.get(s1[i])== null){
                end++;
                tempMap.put(s1[i],0);

            }
            else{
                if(start<end)
                start++;
            }

        }
        return end-start+1;

    }

    public static void main(String[] args) {
        LongestSubStringLength ls = new LongestSubStringLength();
       //int lenght = ls.lengthOfLongestSubstring("pwwkew");
       int lenght = ls.lengthOfLongestSubstring("abcabcbb");
//       int lenght = ls.lengthOfLongestSubstring("bbbbb");
        System.out.printf("Lenght is "+ lenght);
    }
}

