package Exception4_10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckExceptionDemo {

	public static void main(String[] args) throws IOException {
		
		try {
		FileInputStream fis=new FileInputStream("d:\\Shweta\\MyFile.txt");
		int k;
		while((k=fis.read())!= -1)		//-1 end of file..   read():read only one letter so while loop used
			{
			System.out.print((char)k);
		}
		fis.close();
	}catch(FileNotFoundException e)
		{
		 System.out.println("Error: Path is wrong for the file given...");
		}
	}
}
