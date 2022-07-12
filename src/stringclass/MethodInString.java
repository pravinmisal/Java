package stringclass;

public class MethodInString {
public static void main(String[] args) {
	
	//   1.equal(String s)
	String s1="velocity";
	String s2 ="Velocity";
	boolean s3 = s1.equals(s2);
	System.out.println(s3);//false
	
	//2.equalsIgnoreCase(String s)	
	String s4="velOcity";
	String s5="velocity";
	boolean s6 = s4.equalsIgnoreCase(s5);
	System.out.println(s6);
	
	//3 Length();
	
	String s7="abcdefghi";
	int s8 = s7.length();
	System.out.println(s8);
	
	//4.charAt(int index);
	String s9="abcdef";
	char s10 = s9.charAt(5);
	System.out.println(s10);
	
//note; if we provide the index position which is beyond the index limit then we will 
//	get StringIndexoutOfBoundException.
//	String s11= "abcdef";
//	char s12 = s11.charAt(10);
//	System.out.println(s12);
	
	
//5. Replace(char old ,char new)
	String s13="abcdef";
String s14 = s13.replace('c', 'p');
System.out.println(s14);
// 6.Replace(String old, String new)
     String s15= "constructor";
    String s16 = s15.replace("tru", "tor");
    System.out.println(s16);
    
// 7.Substring(int index)
    String s17="velocity";
    String s18 = s17.substring(3);
    System.out.println(s18);
//8.substring(int beginindex,int endindex)
    String s19="corporate";
    String s20 = s19.substring(2, 6);
    System.out.println(s20);
//9.contains (string value)
    String s21="abcdefghijklmnop";
   boolean s22 = s21.contains("de");
   System.out.println(s22);
//10.tolowercase()
   String s23 = "VELocity";
   String s24 = s23.toLowerCase();
   System.out.println(s24);
//11.touppercase()
   String s25 = s23.toUpperCase();
   System.out.println(s25);
  
 //12.indexof(char ch)
   String s26="abcdefghijklmnopqrstuvwxyz";
  int s27 = s26.indexOf('b');
  System.out.println(s27);
  //13.trim()
  String s29 ="     Happy New Year   ";
  String s30 = s29.trim();
  System.out.println(s30);
}}
