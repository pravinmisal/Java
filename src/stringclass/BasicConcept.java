package stringclass;

public class BasicConcept {
   
   public static void main(String[] args) {
	String s = new String("abc");
	String s1 = new String("def");
	String ss ="jkl";
	String ss1="jkl";
	String s2=new String("jkl");
    String s3 = new String("abc");
	String ss2 = "abc";
	boolean ispointingsame = ss==ss1;
	System.out.println(ispointingsame);//true
	
	
	boolean ispointsameobj = ss==s2;
	
	System.out.println(ispointsameobj);// false
boolean k = s3.equals(s);
System.out.println(k);
boolean p = ss.equals(s2);
System.out.println(p);

String e= "velocity";
e.concat("corporate");
System.out.println("output of string is"+ e);
 StringBuffer sb = new StringBuffer("velocity");
sb.append("corporate");
System.out.println("output of StringBuffer is"+sb);






}
}
