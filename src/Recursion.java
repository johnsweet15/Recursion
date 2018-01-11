import java.util.ArrayList;

/**
 * Recursive methods are methods that call themselves.
 * 
 * The purpose of this class is to demonstrate how recursive methods can be used
 * to solve problems.
 * 
 * @author John
 * @version 20160924
 */

public final class Recursion {
    private static ArrayList<Integer> list = new ArrayList<Integer>();

    /**
     * Constructor throws UnsupportedOperationException because it cannot be
     * instantiated.
     */
    public Recursion() {
        throw new UnsupportedOperationException();
    }

    /**
     * Determine any integer factorial recursively. The factorial of a positive
     * number n is the product of all positive integers less than or equal to n.
     * 
     * @param n
     *            the given number to be made factorial
     * @return n the result of n factorial (n!)
     * @throws java.lang.IllegalArgumentException
     */
    public static int factorial(java.lang.Integer n)
            throws java.lang.IllegalArgumentException {
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        else if (n == 0) {
            return 1;
        }
        return factorial(n - 1) * n;
    }

    /**
     * Determine whether the given string is a palindrome recursively. A
     * palindrome is a word or phrase that is the same when read either forwards
     * or backwards.
     * 
     * @param s
     *            the given string being tested for being a palindrome
     * @return true if s is a palindrome and false otherwise
     */
    public static boolean isPalindrome(java.lang.String s) {
        if (s.length() != 0) {
            s = s.replaceAll("\\s", "");
        }
        if (s.length() == 1 || s.length() == 0) {
            return true;
        }
        else if (s.length() == 2 && s.charAt(0) == s.charAt(1)) {
            return true;
        }
        else if (s.charAt(0) == s.charAt(s.length() - 1)) {
            return isPalindrome(s.substring(1, s.length() - 1));
        }
        return false;
    }

    /**
     * Determine whether the given string is an identifier recursively. An
     * identifier is a string whose first character can only be a letter and
     * whose remaining characters must either be digits or letters.
     * 
     * @param s
     *            the given string being tested for being an identifier
     * @return true if s is an identifier and false otherwise
     */
    public static boolean isIdentifier(java.lang.String s) {
        if (s.length() == 1) {
            if (Character.isLetter(s.charAt(0))) {
                return true;
            }
        }
        else if (Character.isDigit(s.charAt(s.length() - 1))
                || Character.isLetter(s.charAt(s.length() - 1))) {
            return isIdentifier(s.substring(0, s.length() - 1));
        }
        return false;
    }

    /**
     * Determine whether the given string is a valid factor recursively.
     * 
     * @param s
     *            the string given
     * @return the int of which all numbers in the string are factors of
     * @throws java.lang.IllegalArgumentException
     */
    public static int factor(java.lang.String s)
            throws java.lang.IllegalArgumentException {
        int sum = 0;
        if (s.length() == 0) {
            throw new IllegalArgumentException();
        }
        else if (s.length() == 1) {
            if (list.size() >= 1) {
                for (int e : list) {
                    sum += e;
                }
                sum += Integer.parseInt(Character.toString(s.charAt(0)));
            }
            else {
                return Integer.parseInt(s);
            }
        }
        else if (!(Character.isDigit(s.charAt(s.length() - 1)))) {
            throw new IllegalArgumentException();
        }
        else if (s.charAt(0) != '+') {
            if (Character.isDigit(s.charAt(0))) {
                list.add(Integer.parseInt(Character.toString(s.charAt(0))));
                return factor(s.substring(1, s.length()));
            }
            else {
                throw new IllegalArgumentException();
            }
        }
        else if (s.charAt(0) == '+') {
            return factor(s.substring(1, s.length()));
        }
        return sum;
    }
}
