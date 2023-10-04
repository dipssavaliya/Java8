package Java8;

public class isOnlyStringAlpha {

	public static boolean isStringAlpha(String s)
	{
		return ((s!=null) && (!s.equals("") && (s.chars().allMatch(Character::isLetter))));
	}
	public static void main(String[] args)
	{
		
	}
}
