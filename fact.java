package factorial;

import java.util.Scanner;

public class fact {
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no=");
		int num = s.nextInt();
		int f=fact(num);
		System.out.println("fact of no.=");
	}
	public static int fact(int n)
	{
		int result;
		if(n==1){
			return 1;
	}
	int output = fact(n-1)*n;
	return output;
	}

}
