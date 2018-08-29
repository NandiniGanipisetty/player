import java.util.*;
class Swapii {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String b="";
		 b=a.substring(1,2);
		String c="";
		c=a.substring(0,1);
		String d="";
		d=a.substring(3,4);
		 String e="";
		e=a.substring(2,3);
		String f="";
		f=b+c+d+e;
		System.out.println(f);
	}
		}
