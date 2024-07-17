package DDT;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class fectingfromjson {

	public static void main(String[] args) throws IOException {
		File fs=new File("./src/test/resources/weeee.json");
		ObjectMapper obj=new ObjectMapper();
		JsonNode nd=obj.readTree(fs);
		WebDriver driver=new ChromeDriver();
		String url = nd.get("url").asText();
		driver.get(url);

	}

}
