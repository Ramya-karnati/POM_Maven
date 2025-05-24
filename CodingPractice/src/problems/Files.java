package problems;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Files {

	public static void main(String[] args) throws IOException {
//		// TODO Auto-generated method stub
//		// Create File
//				File f = new File("sample.txt");
//				
//				boolean isCreated = f.createNewFile();
//				
//				if(isCreated ==  true) {
//					System.out.println("File created successfully..");
//				}else {
//					System.out.println("File not created..");
//				}
//				
//				
//				// Write data into the file
//				FileWriter writer = new FileWriter("sample.txt");
//				writer.append("Hello aunty hello some one else..");
//				writer.close();
//				
//				// Read data from a file
//				FileReader reader = new FileReader("sample.txt");
//		int ch = reader.read();
//				while(ch != -1) {
//					System.out.print((char)ch);
//					ch = reader.read();
//				}
//				reader.close();
//				
//				System.out.println();
//				
//				// Read properties file
//				Properties properties = new Properties();
//				FileReader prop = new FileReader("config.properties");
//				
//				properties.load(prop);
//				
//				System.out.println(properties.getProperty("password"));
//
//	}
		
		//file creation
		File f = new File("sample.txt");
		boolean created=f.createNewFile();
		if(created == true)
		{
			System.out.print("file got created");
		}else
		{
			System.out.println("not created");
		}
		//write on file
		FileWriter writer = new FileWriter("sample.txt");
		writer.append("Hi uncle nidra vastundha");
		writer.close();
		
		//Read on file
		FileReader reader = new FileReader("sample.txt");
		int var=reader.read();
	    while(var!=-1)
	    {
	    	System.out.print((char)var);
	    	var=reader.read();
    }
		reader.close();
		
         //config file reading
		
		Properties p = new Properties();
		FileReader reader2 = new FileReader("configfile.properties");
		p.load(reader2);
		System.out.println(p.getProperty("url"));
	

}
}
