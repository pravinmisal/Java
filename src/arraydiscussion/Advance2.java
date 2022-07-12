package arraydiscussion;

public class Advance2 {
public static void main(String[] args) {
	String [] str=new String [3];
	str[0]="a1";
	str[1]="a2";
	str[2]="a3";
for(String h:str) {
	if(h.equals("a2")) {
		h=h+34;
		System.out.println(h);
	}
}
}
}
