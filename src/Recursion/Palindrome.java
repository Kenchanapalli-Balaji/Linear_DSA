package Recursion;

public class Palindrome 
{
	public static void main(String[] args) {
		System.out.println(isPalindrome("malayalam"));
		System.out.println(isPalindrome("level"));
		System.out.println(isPalindrome("amma"));
	}
	static boolean isPalindrome(String s)
	{
		return isPalindrome(s, 0, s.length()-1);
	}
	static boolean isPalindrome(String s, int start, int end)
	{
		if(start>=end)
			return true;
		if(s.charAt(start)!=s.charAt(end))
			return false;
		return isPalindrome(s,start+1, end-1);
	}
}
