package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StringCheck {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println(" Enter String with Number values and special characters: ");
		
		String s=sc.nextLine();
		String s1="";
		String s2="";
		String s3="";
	//	String s4="";
		for(int i=0;i<s.length();i++)
		{	
			if((s.charAt(i)>=65 && s.charAt(i)<=90)||(s.charAt(i)>=97 && s.charAt(i)<=122))
			{
				s1+=s.charAt(i);
			}
			else if(s.charAt(i)=='0'||s.charAt(i)=='1'||s.charAt(i)=='2'||s.charAt(i)=='3'||s.charAt(i)=='4'||s.charAt(i)=='5'
					||s.charAt(i)=='6'||s.charAt(i)=='7'||s.charAt(i)=='8'||s.charAt(i)=='9')
			{
				s2+=s.charAt(i);
			}
//			else if(s.charAt(i)>=50 && s.charAt(i)<=64)
//			{
//				s3+=s.charAt(i);
//			}	
			else
			{
				s3+=s.charAt(i);
			}
		}
//		ArrayList a=new ArrayList();
//		a.add(s1);
		
		if((s1.length()==s2.length())&&(s1.length()==s3.length()))
				{
					System.out.println("Valid input");
					
//					char[] ch1=s1.toCharArray();		
//					char[] ch2=s2.toCharArray();
//					
//					System.out.println(ch1);
//					System.out.println(ch2);
//					
//					ArrayList a1=new ArrayList();
//					a1.add(ch1);
//					a1.sort();
//					ArrayList a2=new ArrayList();
//					a1.add(ch2);
					
					
//					String s4=s1.toLowerCase();
//					for(int i=0;i<s4.length();i++)
//					{
//						for(int j=1;j<s4.length()-1-i;j++)
//						{
//							if(s4.charAt(j)>s4.charAt(i))
//							{
//								char c=s4.charAt(j);
//								s4.charAt(j)=s4.charAt(j+1);
//								s4.charAt(j+1)=c;
//							}
//								
//						}
//					}
//					char[] ch1=s1.toCharArray();		
//					char[] ch2=s2.toCharArray();
//					
//					System.out.println(ch1);
//					System.out.println(ch2);
					
//					
//					Arrays.sort(ch1);
//					Arrays.sort(ch2);
//					
//					String s4=ch1.toString();		//for ALPHABETS
//					String s5=ch2.toString();		//for Numbers
//					
//					System.out.println(s4+"----------"+s5);
//					
//					String s6="";
//					for(int i=s5.length()-1;i>=0;i--) 
//					{
//						s6+=s5.charAt(i);
//					}
//					String s7="";
//					
//					s7+=s6+s4+s3;
//					
//					System.out.println("Output is : ");
//					System.out.println(s7);
					
					
				}
		else
				{	
					System.out.println("In-Valid Input");	
				}
		
		//System.out.println(s1);
		if(sc!=null)
		{ sc.close();}
	}

}
