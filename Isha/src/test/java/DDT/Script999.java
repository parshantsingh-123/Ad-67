package DDT;

import org.testng.annotations.Test;

import genriclib.Baseclass;
import pom.repo.product;

public class Script999 extends  Baseclass{

	@Test
	public void Script999 (){
		
		product po= new product(driver);
		po.getProductlink().click();
		po.getCreateproduct().click();
		web.selectdropdownbyvalue(po.getProductcatgory(), "Hardware");
	}
}
