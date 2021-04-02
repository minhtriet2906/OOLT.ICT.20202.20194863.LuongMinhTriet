package hust.soict.hedspi.garbage;
import java.io.FileReader;
public class ConcatenateString {

	public static void main(String[] args) throws Exception{
		String s = "";
		FileReader fr = new FileReader("F:\\SQL\\CREATE.txt");
		int i;
		long start = System.currentTimeMillis();
		//
		while ((i = fr.read()) != -1) {
			s += (char) i;
		}
		
		System.out.println(System.currentTimeMillis() - start);
		
		//StringBuffer
		StringBuilder sb = new StringBuilder();
		start = System.currentTimeMillis();
		while ((i = fr.read()) != -1) {
			sb.append((char)i);	
		}
		s = sb.toString();
		System.out.println(System.currentTimeMillis() - start);
		fr.close();
	}
	
}
