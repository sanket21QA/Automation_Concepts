package automation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ConfigFile {

	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\config.properties");
		
		prop.load(file);
		
		System.out.println(prop.get("url"));
		
		Collection<Object> val = prop.values();
		
		System.out.println(val);

}
}
