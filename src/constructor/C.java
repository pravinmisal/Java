package constructor;

public class C {
String name;
String nativeplace;
int mathsmarks;
int age;
static int roll;
static String collegecity;
static String collegename;
public C(String name, String nativeplace , int mathsmarks, int age){
	this.name=name;
	this.nativeplace= nativeplace;
	this.mathsmarks= mathsmarks;
	this.age= age;
	
}
public static void main(String[] args) {
	C s1 =new C("pravin", "dharashiv",95, 26);
	C s2 =new C("kashi", "banglore",98, 29);
	C s3 =new C("renuka", "gadag",100, 24);
	System.out.println(s1.name);
	System.out.println(s2.name);
	System.out.println(s3.name);
	System.out.println(s1.nativeplace);
	System.out.println(s2.nativeplace);
	System.out.println(s3.nativeplace);
    System.out.println(s1.mathsmarks);

    System.out.println(s2.mathsmarks);
    System.out.println(s3.mathsmarks);
    System.out.println(s1.age);
    System.out.println(s2.age);
    System.out.println(s3.age);
}
	

}
