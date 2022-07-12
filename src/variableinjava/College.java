package variableinjava;

public class College {
String name ;
int mathsmark;
int age;
String nativeplace;
static String collegecity;
static String collegename;
	
public static void main(String[] args) {
	collegename = "COEP";
	collegecity = "PUNE";
College s1 = new College();
	s1.name = "pravin";
	s1.mathsmark= 98;
	s1.age = 25;
	s1.nativeplace= "DHARASHIV";
	System.out.println(s1.name +  s1.age);
	
}



}
