public class Palindrome
{
    public static void main(String[] args)
    {
        System.out.println( isPalindromeString("howtodoinjava") );
        System.out.println( isPalindromeString("abcba") );
    }
     
    public static boolean isPalindromeString(String originalString)
    {
        String reverse = new StringBuilder(originalString).reverse().toString();
        return originalString.equals(reverse);
    }
}