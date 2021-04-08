package test;

import java.util.Scanner;

public class VowelConso {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println(" Enter String with Number values don't enter special characters: ");
		
		String s=sc.nextLine();
		
		char[] ch=s.toCharArray();
		String s1="";
		for(int i=0;i<ch.length;i++)
		{	
			if(ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U'||ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			{   	
				s1+=ch[i]+""+'*';		
			}
			else if(ch[i]=='1'||ch[i]=='2'||ch[i]=='3'||ch[i]=='4'||ch[i]=='5'||ch[i]=='6'||ch[i]=='7'||ch[i]=='8'||ch[i]=='9'||ch[i]=='0')
			{  
				s1+=ch[i]+""+'!';
			}
			else
			{  	   
				s1+=ch[i]+""+'&';		
			}
	
		}
		System.out.println(s1);
		
		
		if(sc!=null)
		{ sc.close();}
	}
}
