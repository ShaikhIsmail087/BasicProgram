import java.io.*;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws Exception {
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream("abc.Properties");
		p.load(fis);
		System.out.println(p);
		String s=p.getProperty("Google");
		System.out.println(s);
		p.setProperty("Ismail","88888");
		FileOutputStream fos=new FileOutputStream("abc.Properties");
		p.store(fos, "Updated by Ismail");
	}

}