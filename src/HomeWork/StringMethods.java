package HomeWork;

public class StringMethods{
//1  Length()
	   public static void main(String args[]) {
	      String palindrome = " my string palindrome is kayak";
	      int len = palindrome.length();
	      System.out.println( "String Length is : " + len );
//2  concatenate concat()
	     String s = "my name is ";
	     s = s.concat("Ahad");
	      System.out.println(s);
	   
//3  index return charAt()
	      String s1 = "my name is Ahad";
	      char result = s1.charAt(3);
	      System.out.println(result);
//4  compare string
	      String str1 = "Strings are";
	      String str2 = new String("Strings are");
	      String str3 = new String("Integers are not immutable");
	      
	      int result1 = str1.compareTo( str2 );
	      System.out.println(result1);
	      
	      result1 = str2.compareTo( str3 );
	      System.out.println(result1);
//5  boolean contentEquals()	
	      String st1 = "Not immutable";
	      String st2 = "Strings are immutable";
	      StringBuffer st3 = new StringBuffer( "Not immutable");

	      boolean  bresult = st1.contentEquals( st3 );
	      System.out.println(bresult);
		  
	      bresult = st2.contentEquals( st3 );
	      System.out.println(bresult);
//6 copy contents of char array
	      char[] sa1 = {'A', 'H', 'A', 'D',' ','A', 'L', 'I'};
	      String sa2 = "";
	      sa2 = sa2.copyValueOf( sa1 );
	      System.out.println("Returned String: " + sa2);
	      
//7 This method returns a String that contains the characters of the character array.	      
	      sa2 = sa2.copyValueOf( sa1,2,4 );
	      System.out.println("Returned String: " + sa2);
	      

//8 This method tests if this string ends with the specified suffix.endswith()


	      String ss = new String("This is laptop!!");
	      boolean retVal;
	      retVal = ss.endsWith( "laptop!!" );
	      System.out.println("Returned Value = " + retVal );

	      retVal = ss.endsWith( "desktop" );
	      System.out.println("Returned Value = " + retVal );
	  
// 9 This is a default method and this will not accept any parameters.hashcode().

	      String hc = new String("welcome Ahad Ali");
	      System.out.println("Hashcode for Str :" + hc.hashCode() );
	 
//10 returns the index within this string of the first occurrence of the specified character indexof().
	      
	      String fi = new String("My name is Ahad");
	      System.out.print("Found Index :" );
	      System.out.println(fi.indexOf( 'n' ));
	   
	      
	      
	   }
	   
	   
	}

 
