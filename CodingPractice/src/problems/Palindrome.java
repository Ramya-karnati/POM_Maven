package problems;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\\
		//heh//
		//sum of indivdual digits
		
		Palindrome p=new Palindrome();
		int l=123;
		
	   int sum=p.digits(l);
	   System.out.println(sum);
	
	
	}



public int digits(int n)
{


	int r, sum=0;
	
	while(n>0)
	{
		r=n%10;
		sum=sum+r;
		n=n/10;
		
	}

	return sum;
	
}
}