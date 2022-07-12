package categoriesofmethod;

public class MethodWithReturnAndWithArgument {
public static int areacalculator(int length, int breadth) {
	int area =length*breadth;
	return area;
}public static void main(String[] args) {
	int area1=areacalculator(10,30);//300
	int area2=areacalculator(50,40);//2000
	int area3=areacalculator(10,80);//800
	int area4=areacalculator(20,30);//600
	int area5=areacalculator(10,20);//200
	int totalarea=area1+area2+area3+area4+area5;
	System.out.println(totalarea);
	
}
}
