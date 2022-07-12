package stringclass;

public class Assignment {
//WAP to print reverse of string value
	public static void main(String[] args) {
		String s11="This is String";
        String rev="";
        int size = s11.length();
        int lastindex=size-1;
        for(int i=lastindex;i>=0;i--) {
        	rev=rev+s11.charAt(i);
        }
		System.out.println(rev);
		
//WAP to print horizontal String to the vertical individual character
		String s12="Velocity";
		for(int i=0;i<s12.length();i++) {
			char letter = s12.charAt(i);
			System.out.println(letter);
		}
			
		
		
		
	}
}
