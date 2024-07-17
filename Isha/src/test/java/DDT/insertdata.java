package DDT;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class insertdata {
	public static void main( String []args) throws IOException {
		
		
	
	
	Properties pr=new Properties();
	pr.setProperty("url","https://demowebshop.tricentis.com/");
	
	FileOutputStream fis=new FileOutputStream("./src/test/resources/prope1.properties");
	pr.store(fis," prope1");
	
	
	

}}
