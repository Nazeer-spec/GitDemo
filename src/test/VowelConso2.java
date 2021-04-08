package test;

import java.util.Scanner;

public class VowelConso2 {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
		
		System.out.println(" Enter String with Number values: ");
		String s=sc.nextLine();
		String s1="";
		for(int i=0;i<s.length();i++)
		{	
			if((s.charAt(i)>=65 && s.charAt(i)<=90)||(s.charAt(i)>=97 && s.charAt(i)<=122))
			{
				if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
				{
					s1+=s.charAt(i)+"*";
				}
				else if(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
				{
					s1+=s.charAt(i)+"*";
				}
				else
				{
					s1+=s.charAt(i)+"$";
				}
			}
			else if(s.charAt(i)=='0'||s.charAt(i)=='1'||s.charAt(i)=='2'||s.charAt(i)=='3'||s.charAt(i)=='4'||s.charAt(i)=='5'
					||s.charAt(i)=='6'||s.charAt(i)=='7'||s.charAt(i)=='8'||s.charAt(i)=='9')
			{
				s1+=s.charAt(i)+"!";
			}
			else
			{
				s1+=s.charAt(i);
			}
		}
		System.out.println(s1);
		
		
		if(sc!=null)
		{ sc.close();}
	}

}
