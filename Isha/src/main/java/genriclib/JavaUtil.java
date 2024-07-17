package genriclib;

import java.util.Random;

public class JavaUtil {
	
	public int getRandomnumber() {
		Random rs=new Random();
		int num = rs.nextInt(100);
		return num;
		
	}

}
