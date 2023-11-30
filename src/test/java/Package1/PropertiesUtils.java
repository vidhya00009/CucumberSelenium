package Package1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;

public class PropertiesUtils {
	Properties p;
	public PropertiesUtils(String peopertiesFilePath){
		p=new Properties();
		try{
			FileInputStream fis=new FileInputStream("F:\\CucumberProject1\\CucumberSelenium\\Buybooks.properties");
			p.load(fis);
			fis.close();
		}
		catch(IOException e){
			System.out.println(e.getMessage());
			
		}
	}
		public By getLocator(String WebElementName) {
			String locatorTypeAndValue=p.getProperty(WebElementName);
			
			String[] locatorTypeAndValueArray=locatorTypeAndValue.split(":");
			String locatorType=locatorTypeAndValueArray[0];
			String locatorValue=locatorTypeAndValueArray[1];
			
			switch(locatorType.toUpperCase()){
			case "ID":
				return By.id(locatorValue);
			case "NAME":
				return By.name(locatorValue);
			case "TAGNAME":
				return By.tagName(locatorValue);
			case "LINKTEXT":
				return By.linkText(locatorValue);
			case "PARTIALLINKTEXT":
				return By.partialLinkText(locatorValue);
			case "XPATH":
				return By.xpath(locatorValue);
			case "CSS":
				return By.cssSelector(locatorValue);
			case "CLASSNAME":
				return By.className(locatorValue);
			default:
					return null;
			
		}
		
	}

}
