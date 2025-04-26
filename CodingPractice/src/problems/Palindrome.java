package problems;

public class Palindrome {

	public static void main(String[] args) {
		
		
		Palindrome p=new Palindrome();
		String k="ramya";
      String e= p.duplicates(k);
      System.out.print(e);
	}

public String duplicates(String s)
{
	String e="";
	for(int i=0;i<s.length();i++)
	{
		if(e.contains(s.charAt(i)+""))
		{
			
		}
		else
		{
			e=e+s.charAt(i);
		}
		
	}
	return e;
	
}

}