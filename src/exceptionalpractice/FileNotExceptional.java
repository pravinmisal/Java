package exceptionalpractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileNotExceptional {

	public static void main(String[] args)  {
		try {
			System.out.println("before file tracking");
			FileInputStream ff = new FileInputStream("C:\\Users\\hp\\Downloads\\automation clss\\MethodJSSHBJ execution cases.docx");
		}
		catch(FileNotFoundException s) {
			System.out.println("FileNotExceptionExecuting");
		}
		catch(Exception c) {
			System.out.println("sjdhwdkj");
		}
		System.out.println("After File Tracking ");
	}
}
