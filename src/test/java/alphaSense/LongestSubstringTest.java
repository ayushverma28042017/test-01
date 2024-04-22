import alphaSense.LongestSubstring;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@RunWith(JUnit4.class)
public class LongestSubstringTest {

    public LongestSubstring longestSubstring=new LongestSubstring();

    @BeforeEach
    void setUp() {
        longestSubstring = new LongestSubstring();
    }

    @Test
    @DisplayName("Simple LongestSubstring should work")
    public void testLongestSubstring_01() {
        assertEquals(3, longestSubstring.longestSubString("pwwkew"),
                "Regular LongestSubstring should work");
    }

    @Test
    @DisplayName("Simple LongestSubstring should work")
    public void testLongestSubstring_02() {
        assertEquals(3, longestSubstring.longestSubString("abcabcbb"),
                "Regular LongestSubstring should work");
    }

    @Test
    @DisplayName("Simple LongestSubstring should work")
    public void testLongestSubstring_03() {
        assertEquals(1, longestSubstring.longestSubString("bbbbb"),
                "Regular LongestSubstring should work");
    }
    @Test
    @DisplayName("Simple LongestSubstring should work")
    public void testLongestSubstring_04() {
        assertEquals(1, longestSubstring.longestSubString("k"),
                "Regular LongestSubstring should work");
    }

    @Test
    @DisplayName("Simple LongestSubstring should work")
    public void testLongestSubstring_05() {
        assertEquals(2, longestSubstring.longestSubString("k  ll  pp"),
                "Regular LongestSubstring should work");
    }

    @Test
    public void testLongestSubstring_06() {
        // set up user
        Throwable exception = assertThrows(RuntimeException.class, () -> longestSubstring.longestSubString(null));
        assertEquals("Input String cannot be null.", exception.getMessage());
    }

}