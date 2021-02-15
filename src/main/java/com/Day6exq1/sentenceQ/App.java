package com.Day6exq1.sentenceQ;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        String para = sc.nextLine();
        App obj = new App();
        obj.vowelword(para);
        sc.close();
    }
    
    public String[] vowelword(String para){
    	 String[] words = para.split(" ");
    	 String ans="";
    	 int count=para.length();
    	 //System.out.println(count);
    	 if(count==0) {return null;}
         for (String str : words) {
         	char ch = str.charAt(0);
         	if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='I' || ch=='E' || ch=='U' || ch=='O' ) {
 				System.out.println(str);
 				ans =ans+" "+str;
 				//ans[count++] = str;
 			}
 			
 		}
         if(ans.toString().length()==0) {return null;}
    	return ans.trim().split(" ");
    }
}
