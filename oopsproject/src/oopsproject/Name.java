package oopsproject;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Name{
	public static void main(String[] args) {
		
		String pstyl= "[A-X]+";
		String act="Rohit";
		Pattern pst1= Pattern.compile(pstyl);
		Matcher mstyl= pst1.matcher(act);
		while(mstyl.find()) {
			System.out.print(mstyl);
		}
		
		
		
		
				
		
	}                        
	
}
