package stringclass;

public class Basicconcept1 {
public static void main(String[] args) {
String s = new String ("abc");
String s1= new String ("def");
String ss = "jkl";
String ss1="jkl";
String s2=new String("jkl");
String s3= new String("abc");
String ss2="abc";
     boolean sk = ss==s2;
     System.out.println(sk);
   boolean ks = ss==ss1;
   System.out.println(ks);
boolean eq = ss1.equals(ss);
boolean eq1 = s2.equals(ss1);
System.out.println(eq1);
String var1= "velocity";
var1.concat("corporate");
System.out.println("output of string is  "+var1);
StringBuffer sb= new StringBuffer("School");
sb.append("college");
System.out.println("output of string is "+sb);




}
}
