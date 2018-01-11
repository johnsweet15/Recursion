import static org.junit.Assert.*;

import org.junit.Test;

/**
 * This test class verifies that all methods in the Recursion class are complete
 * and accurate.
 * 
 * @author John
 * @version 20160924
 */

public class RecursionTest {

    /**
     * does constructor throw an UnsupportedOperationException
     */
    @Test(expected = UnsupportedOperationException.class)
    public void doesConstructorThrowUnsupportedOperationException() {
        Recursion r = new Recursion();
        assertNotNull(r);
    }

    /**
     * does factorial return the correct value of n factorial
     */
    @Test
    public void doesFactorialReturnValueOfNFactorial() {
        int input1 = 5;
        int input2 = 3;
        int input3 = 0;
        // preconditions
        int expected1 = 120;
        int expected2 = 6;
        int expected3 = 1;
        // postconditions

        assertEquals("factorial was incorrect", expected1,
                Recursion.factorial(input1));
        assertEquals("factorial was incorrect", expected2,
                Recursion.factorial(input2));
        assertEquals("factorial was incorrect", expected3,
                Recursion.factorial(input3));

    }

    /**
     * does factorial throw an IAE if the given number is invalid
     */
    @Test(expected = IllegalArgumentException.class)
    public void doesFactorialThrowIAEIfInvalidIntIsPassed() {
        int input1 = -1;
        assertNotNull(Recursion.factorial(input1));
    }

    /**
     * does isPalindrome correctly determine if a string s is a palindrome
     */
    @Test
    public void doesIsPalindromeDetermineIfStringSIsAPalindrome() {
        String s1 = "a man a plan a canal panama";
        String s2 = "racecar";
        String s3 = "hello";
        String s4 = "a";
        String s5 = "";
        String s6 = "bb";
        String s7 = "ab";
        // preconditions
        boolean expected1 = true;
        boolean expected2 = true;
        boolean expected3 = false;
        boolean expected4 = true;
        boolean expected5 = true;
        boolean expected6 = true;
        boolean expected7 = false;
        // postconditions

        assertEquals("was a palindrome", expected1,
                Recursion.isPalindrome(s1));
        assertEquals("was not a palindrome", expected2,
                Recursion.isPalindrome(s2));
        assertEquals("was a palindrome", expected3,
                Recursion.isPalindrome(s3));
        assertEquals("was a palindrome", expected4,
                Recursion.isPalindrome(s4));
        assertEquals("was a palindrome", expected5,
                Recursion.isPalindrome(s5));
        assertEquals("was a palindrome", expected6,
                Recursion.isPalindrome(s6));
        assertEquals("was not a palindrome", expected7,
                Recursion.isPalindrome(s7));
    }

    /**
     * does isIdentifier correctly determine if a string s is an identifier
     */
    @Test
    public void doesIsIdentifierDetermineIfStringSIsAnIdentifier() {
        String s1 = "abc";
        String s2 = "4abc";
        String s3 = "abc#";
        String s4 = "abc123";
        // preconditions
        boolean expected1 = true;
        boolean expected2 = false;
        boolean expected3 = false;
        boolean expected4 = true;
        // postconditions

        assertEquals("was an identifier", expected1,
                Recursion.isIdentifier(s1));
        assertEquals("was not an identifier", expected2,
                Recursion.isIdentifier(s2));
        assertEquals("was not an identifier", expected3,
                Recursion.isIdentifier(s3));
        assertEquals("was an identifier", expected4,
                Recursion.isIdentifier(s4));
    }

    /**
     * does factor correctly determine if a string s is a valid factor
     */
    @Test
    public void doesFactorDetermineIfStringIsAValidFactor() {
        String s1 = "1";
        String s2 = "1+2";
        // preconditions
        int expected1 = 1;
        int expected2 = 3;
        // postconditions

        assertEquals("incorrect factor", expected1, Recursion.factor(s1));
        assertEquals("incorrect factor", expected2, Recursion.factor(s2));

    }

    /**
     * does factor throw an IAE if the given string is invalid
     */
    @Test(expected = IllegalArgumentException.class)
    public void doesFactorThrowIAEIfStringIsInvalid() {
        String s1 = "";
        Recursion.factor(s1);

        String s2 = "1-2";
        assertNotNull(Recursion.factor(s2));

        String s3 = "1+2+";
        assertNotNull(Recursion.factor(s3));

        String s4 = "1+a+3";
        assertNotNull(Recursion.factor(s4));
    }

}
