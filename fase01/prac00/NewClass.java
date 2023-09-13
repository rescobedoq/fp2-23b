//Java program illustrating use of write(int arg) method

import java.io.*;
public class NewClass
{
	public static void main(String[] args) throws IOException
	{
		  FileWriter geek_file = new FileWriter("ABC.txt");
			
			BufferedWriter geekwrite = new BufferedWriter(geek_file);
			
			geekwrite.write("FP2");
			
			geekwrite.write("UNSA");

			geekwrite.close();

	}
}

