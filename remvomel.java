import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class RemVowel
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		char a[]=new char[str.length()];
		int p=0;
		for(int i=str.length()-1;i>=0;i--)
		{
			char ch=str.charAt(i);
			if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u')
			{
				a[p++]=ch;
			}
		}
		for(int i=0;i<p;i++)
		System.out.print(a[i]);

	}
}
