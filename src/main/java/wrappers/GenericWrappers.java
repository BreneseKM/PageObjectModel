package wrappers;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;

import utils.Reporting;

public class GenericWrappers extends Reporting implements Wrappers  {

	public static RemoteWebDriver driver;
	
	public static Properties prop;
	
	public void loadObjects()
	{
		 try {
			prop=new Properties();
			 
			 prop.load(new FileInputStream("./src/test/java/object.properties"));
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	public void unloadObjects()
	{
		prop=null;
	}
	
	
	@Override
	public void invokeApp(String browser, String url) {
		// TODO Auto-generated method stub
		
		try {
			if(browser.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver=new ChromeDriver();
			}else if(browser.equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
				driver=new FirefoxDriver();
			}else if(browser.equalsIgnoreCase("ie")) 
			{
				System.setProperty("webdriver.ie.driver","./drivers/IEdriverServer.exe");
				driver=new InternetExplorerDriver();
			}
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//System.out.println("The browser "+browser+" is launched with the given url "+url+" successfully");
			reportStep("The browser "+browser+" is launched with the given url "+url+" successfully","pass");
		} catch (SessionNotCreatedException e) {
			//System.err.println("The browser "+browser+" is not launched with the given url "+url+" due to session not created error ");
			reportStep("The browser "+browser+" is not launched with the given url "+url+" due to session not created error ","fail");
		}catch (InvalidArgumentException e) {
			//System.err.println("The broswer "+browser+" is not launched with the given url "+url+" as the url contains http/https");
			reportStep("The broswer "+browser+" is not launched with the given url "+url+" as the url contains http/https","fail");
		}catch (WebDriverException e) {
			//System.err.println("The browser "+browser+" is not launched due to unknown error");
			reportStep("The browser "+browser+" is not launched due to unknown error","fail");
		}
			
	}

	@Override
	public void enterById(String idValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(idValue).sendKeys(data);
			//System.out.println("The element with id "+idValue+" is entered with the data "+data+"");
			reportStep("The element with id "+idValue+" is entered with the data "+data+" ","pass");
		} catch (NoSuchElementException e) {
			//System.err.println("The element with id "+idValue+" is not found in the DOM");
			reportStep("The element with id "+idValue+" is not found in the DOM","fail");
		}catch (ElementNotVisibleException e) {
		    //System.err.println("The element with id "+idValue+" is not visible in the application");
			reportStep("The element with id "+idValue+" is not visible in the application","fail");
		}catch (ElementNotInteractableException e) {
			//System.err.println("The element with id "+idValue+" is not interactable in the application");
			reportStep("The element with id "+idValue+" is not interactable in the application","fail");
		}catch (UnhandledAlertException e) {
			//System.err.println("The element with id "+idValue+" is not entered with data "+data+" due to unexpected alert opened");
			reportStep("The element with id "+idValue+" is not entered with data "+data+" due to unexpected alert opened","fail");
		}catch (StaleElementReferenceException e) {
			//System.err.println("The element with id "+idValue+" is not stable in the application");
			reportStep("The element with id "+idValue+" is not stable in the application","fail");
		}catch (WebDriverException e) {
			//System.err.println("The element with id "+idValue+" is not entered with the data "+data+" due to unknown error");
			reportStep("The element with id "+idValue+" is not entered with the data "+data+" due to unknown error","fail");
		}
		
	}

	@Override
	public void enterByName(String nameValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(nameValue).sendKeys(data);
			//System.out.println("The element with name "+nameValue+" is entered with the data "+data+" ");
			reportStep("The element with name "+nameValue+" is entered with the data "+data+" ","pass");
		} catch (NoSuchElementException e) {
		    //System.err.println("The element with name "+nameValue+" is not found in the DOM");
			reportStep("The element with name "+nameValue+" is not found in the DOM","fail");
		}catch (ElementNotVisibleException e) {
			//System.err.println("The element with name "+nameValue+" is not visible in the application");
			reportStep("The element with name "+nameValue+" is not visible in the application","fail");
		}catch (ElementNotInteractableException e) {
			//System.err.println("The element with name "+nameValue+" is not interactable in the application");
			reportStep("The element with name "+nameValue+" is not interactable in the application","fail");
		}catch (UnhandledAlertException e) {
			//System.err.println("The element with name "+nameValue+" is not entered with the data "+data+" due to unexpected alert opened");
			reportStep("The element with name "+nameValue+" is not entered with the data "+data+" due to unexpected alert opened","fail");
		}catch (StaleElementReferenceException e) {
		    //System.err.println("The element with name "+nameValue+" is not stable in the application");
			reportStep("The element with name "+nameValue+" is not stable in the application","fail");
		}catch (WebDriverException e) {
			//System.err.println("The element with name "+nameValue+" is not entered with the data "+data+" due to unknown error");
			reportStep("The element with name "+nameValue+" is not entered with the data "+data+" due to unknown error","fail");
		}
		
	}

	@Override
	public void enterByXpath(String xpathValue, String data) {
		// TODO Auto-generated method stub
		try {
			
			driver.findElementByXPath(xpathValue).sendKeys(data);
	     	//System.out.println("The element with xpath "+xpathValue+" is entered with the data "+data+" ");
			reportStep("The element with xpath "+xpathValue+" is entered with the data "+data+" ","pass");
		}catch (NoSuchElementException e) {
			//System.err.println("The element with xpath "+xpathValue+" is not found in the DOM");
			reportStep("The element with xpath "+xpathValue+" is not found in the DOM","fail");
		}catch (ElementNotVisibleException e) {
			//System.err.println("The element with xpath "+xpathValue+" is not visible in the application");
			reportStep("The element with xpath "+xpathValue+" is not visible in the application","fail");
		}catch (ElementNotInteractableException e) {
			//System.err.println("The element with xpath "+xpathValue+" is not interactable in the application");
			reportStep("The element with xpath "+xpathValue+" is not interactable in the application","fail");
		}catch (StaleElementReferenceException e) {
		    //System.err.println("The element with xpath "+xpathValue+" is not stable in the application");
			reportStep("The element with xpath "+xpathValue+" is not stable in the application","fail");
		}catch (UnhandledAlertException e) {
			//System.err.println("The element with xpath "+xpathValue+" is not entered with the data "+data+" due to unexpected alert opened");
			reportStep("The element with xpath "+xpathValue+" is not entered with the data "+data+" due to unexpected alert opened","fail");
		}catch (WebDriverException e) {
			//System.err.println("The element with xpath "+xpathValue+" is not entered with the data "+data+" due to unknown error");
			reportStep("The element with xpath "+xpathValue+" is not entered with the data "+data+" due to unknown error","fail");
		}
		
	}
		
    @Override
	public void verifyTitle(String title) {
		// TODO Auto-generated method stub
		try {
			String actualtitle=driver.getTitle();
			if(actualtitle.equals(title)) {
				//System.out.println("The title of the page "+actualtitle+" is matched with expected title "+title+" ");
				reportStep("The title of the page "+actualtitle+" is matched with expected title "+title+" ","pass");
			}else {
				//System.err.println("The title of the page "+actualtitle+" is not matched with expected title "+title+" ");
				reportStep("The title of the page "+actualtitle+" is not matched with expected title "+title+" ","pass");
			}
		} catch (WebDriverException e) {
			//System.err.println("The title of the page "+title+" is not verified due to unknown error");
			reportStep("The title of the page "+title+" is not verified due to unknown error","fail");
		}
			
	}

	@Override
	public void verifyTextById(String id, String text) {
		// TODO Auto-generated method stub
		try {
			String actualtext=driver.findElementById(id).getText();
			if(actualtext.equals(text)) {
				//System.out.println("The element with id "+id+" is holding the text "+actualtext+" is matched with expected text "+text+"");
				reportStep("The element with id "+id+" is holding the text "+actualtext+" is matched with expected text "+text+"","pass");
				
			}else {
				//System.err.println("The element with id "+id+" is holding the text "+actualtext+" is not matched with expected text "+text+"");
				reportStep("The element with id "+id+" is holding the text "+actualtext+" is not matched with expected text "+text+"","pass");
			}
		}catch (NoSuchElementException e) {
			//System.err.println("The element with id "+id+" is not found in the DOM");
			reportStep("The element with id "+id+" is not found in the DOM","fail");
		}catch (ElementNotVisibleException e) {
			//System.err.println("The element with id "+id+" is not visible in the application");
			reportStep("The element with id "+id+" is not visible in the application","fail");
		}catch (StaleElementReferenceException e) {
			//System.err.println("The element with id "+id+" is not stable in the application");
			reportStep("The element with id "+id+" is not stable in the application","fail");
		}catch (UnhandledAlertException e) {
			//System.err.println("The element with id "+id+" is not verified due to unexpected alert opened");
			reportStep("The element with id "+id+" is not verified due to unexpected alert opened","fail");
	    }catch (ElementNotInteractableException e) {
	    	//System.err.println("The element with id "+id+" is not interactable in the application");
	    	reportStep("The element with id "+id+" is not interactable in the application","fail");
		}catch (WebDriverException e) {
			//System.err.println("The element with id "+id+" is not verified due to unknown error");
			reportStep("The element with id "+id+" is not verified due to unknown error","fail");
				
		}
		
	}

	@Override
	public void verifyTextByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		try {
			String actualtext=driver.findElementByXPath(xpath).getText();
			if(actualtext.equals(text)) {
				//System.out.println("The element with xpath "+xpath+" is holding the text "+actualtext+" is matched with expected text "+text+" ");
				reportStep("The element with xpath "+xpath+" is holding the text "+actualtext+" is matched with expected text "+text+" ","pass");
			}else {
				//System.err.println("The element with xpath "+xpath+" is holding the text "+actualtext+" is not matched with expected text "+text+" ");
				reportStep("The element with xpath "+xpath+" is holding the text "+actualtext+" is not matched with expected text "+text+" ","pass");
			}
		} catch (NoSuchElementException e) {
			//System.err.println("The element with xpath "+xpath+" is not found in the DOM");
			reportStep("The element with xpath "+xpath+" is not found in the DOM","fail");
		}catch (ElementNotVisibleException e) {
			//System.err.println("The element with xpath "+xpath+" is not visible in the application");
			reportStep("The element with xpath "+xpath+" is not visible in the application","fail");
		}catch (ElementNotInteractableException e) {
			//System.err.println("The element with xpath "+xpath+" is not interactable in the application");
			reportStep("The element with xpath "+xpath+" is not interactable in the application","fail");
		}catch (StaleElementReferenceException e) {
			//System.err.println("The element with xpath "+xpath+" is not stable in the application");
			reportStep("The element with xpath "+xpath+" is not stable in the application","fail");
		}catch (UnhandledAlertException e) {
			//System.err.println("The element with xpath "+xpath+" is not verified due to unexpected alert opened");
			reportStep("The element with xpath "+xpath+" is not verified due to unexpected alert opened","fail");
		}catch (WebDriverException e) {
			//System.err.println("The element with xpath "+xpath+" is not verified due to unknown error");
			reportStep("The element with xpath "+xpath+" is not verified due to unknown error","fail");
		}
		
	}

	@Override
	public void verifyTextContainsByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		try {
			String actualtext=driver.findElementByXPath(xpath).getText();
			if(actualtext.contains(text)) {
				//System.out.println("The element with xpath "+xpath+" is holding the text "+actualtext+" is matched with expected text "+text+" ");
				reportStep("The element with xpath "+xpath+" is holding the text "+actualtext+" is matched with expected text "+text+" ","pass");
			}else {
				//System.err.println("The element with xpath "+xpath+" is holding the text "+actualtext+" is not matched with expected text "+text+" ");
				reportStep("The element with xpath "+xpath+" is holding the text "+actualtext+" is not matched with expected text "+text+" ","pass");
			}
		} catch (NoSuchElementException e) {
			//System.err.println("The element with xpath "+xpath+" is not found in the DOM");
			reportStep("The element with xpath "+xpath+" is not found in the DOM","fail");
		}catch (ElementNotVisibleException e) {
			//System.err.println("The element with xpath "+xpath+" is not visible in the application");
			reportStep("The element with xpath "+xpath+" is not visible in the application","fail");
		}catch (ElementNotInteractableException e) {
			//System.err.println("The element with xpath "+xpath+" is not interactable in the application");
			reportStep("The element with xpath "+xpath+" is not interactable in the application","fail");
		}catch (StaleElementReferenceException e) {
			//System.err.println("The element with xpath "+xpath+" is not stable in the application");
			reportStep("The element with xpath "+xpath+" is not stable in the application","fail");
		}catch (UnhandledAlertException e) {
			//System.err.println("The element with xpath "+xpath+" is not verified due to unexpected alert opened");
			reportStep("The element with xpath "+xpath+" is not verified due to unexpected alert opened","fail");
        }catch (WebDriverException e) {
			//System.err.println("The element with xpath "+xpath+" is not verified due to unknown error");
        	reportStep("The element with xpath "+xpath+" is not verified due to unknown error","fail");
		}
	}

	@Override
	public void clickById(String id){
		// TODO Auto-generated method stub
		try {
			driver.findElementById(id).click();
			//System.out.println("The element with id "+id+" is clicked successfully");
			reportStep("The element with id "+id+" is clicked successfully","pass");
		} catch (NoSuchElementException e) {
			//System.err.println("The element with id "+id+" is not found in the DOM");
			reportStep("The element with id "+id+" is not found in the DOM","fail");
		}catch (ElementNotVisibleException e) {
			//System.err.println("The element with id "+id+" is not visible in the application");
			reportStep("The element with id "+id+" is not visible in the application","fail");
		}catch (UnhandledAlertException e) {
			//System.err.println("The element with id "+id+" is not clicked due to unexpected alert opened");
			reportStep("The element with id "+id+" is not clicked due to unexpected alert opened","fail");
		}catch (StaleElementReferenceException e) {
			//System.err.println("The element with id "+id+" is not stable in the application");
			reportStep("The element with id "+id+" is not stable in the application","fail");
		}catch (ElementClickInterceptedException e) {
			//System.err.println("The element with id "+id+" is not clickable in the application");
			reportStep("The element with id "+id+" is not clickable in the application","fail");
		}catch (ElementNotInteractableException e) {
			//System.err.println("The element with id "+id+" is not interactable in the application");
			reportStep("The element with id "+id+" is not interactable in the application","fail");
		}catch (WebDriverException e) {
			//System.err.println("The element with id "+id+" is not clicked due to unknown error");
			reportStep("The element with id "+id+" is not clicked due to unknown error","fail");
		}
	}

	@Override
	public void clickByClassName(String classVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByClassName(classVal).click();
			//System.out.println("The element with classname "+classVal+" is clicked successfully");
			reportStep("The element with classname "+classVal+" is clicked successfully","pass");
		} catch (NoSuchElementException e) {
			//System.err.println("The element with classname "+classVal+" is not found in the DOM");
			reportStep("The element with classname "+classVal+" is not found in the DOM","fail");
		}catch (ElementNotVisibleException e) {
			//System.err.println("The element with classname "+classVal+" is not visible in the application");
			reportStep("The element with classname "+classVal+" is not visible in the application","fail");
		}catch (UnhandledAlertException e) {
			//System.err.println("The element with classname "+classVal+" is not clicked due to unexpected alert opened");
			reportStep("The element with classname "+classVal+" is not clicked due to unexpected alert opened","fail");
		}catch (StaleElementReferenceException e) {
			//System.err.println("The element with classname "+classVal+" is not stable in the application");
			reportStep("The element with classname "+classVal+" is not stable in the application","fail");
		}catch (ElementClickInterceptedException e) {
			//System.err.println("The element with classname "+classVal+" is not clickable in the application");
			reportStep("The element with classname "+classVal+" is not clickable in the application","fail");
		}catch (ElementNotInteractableException e) {
			//System.err.println("The element with classname "+classVal+" is not interactable in the application");
			reportStep("The element with classname "+classVal+" is not interactable in the application","fail");
		}catch (WebDriverException e) {
			//System.err.println("The element with classname "+classVal+" is not clicked due to unknown error");
			reportStep("The element with classname "+classVal+" is not clicked due to unknown error","fail");
		}
		
	}

	@Override
	public void clickByName(String name) {
		// TODO Auto-generated method stub
		try {
			driver .findElementByName(name).click();
			//System.out.println("The element with name "+name+" is clicked successfully");
			reportStep("The element with name "+name+" is clicked successfully","pass"); 
		} catch (NoSuchElementException e) {
			//System.err.println("The element with name "+name+" is not found in the DOM");
			reportStep("The element with name "+name+" is not found in the DOM","fail");
		}catch (ElementNotVisibleException e) {
			//System.err.println("The element with name "+name+" is not visible in the application");
			reportStep("The element with name "+name+" is not visible in the application","fail");
		}catch (UnhandledAlertException e) {
			//System.err.println("The element with name "+name+" is not clicked due to unexpected alert opened");
			reportStep("The element with name "+name+" is not clicked due to unexpected alert opened","fail");
		}catch (StaleElementReferenceException e) {
			//System.err.println("The element with name "+name+" is not stable in the application");
			reportStep("The element with name "+name+" is not stable in the application","fail");
		}catch (ElementClickInterceptedException e) {
			//System.err.println("The element with name "+name+" is not clickable in the application");
			reportStep("The element with name "+name+" is not clickable in the application","fail");
		}catch (ElementNotInteractableException e) {
			//System.err.println("The element with name "+name+" is not interactable in the application");
			reportStep("The element with name "+name+" is not interactable in the application","fail");
		}catch (WebDriverException e) {
			//System.err.println("The element with name "+name+" is not clicked due to unknown error");
			reportStep("The element with name "+name+" is not clicked due to unknown error","fail");
		}
	}

	@Override
	public void clickByLink(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
		  //System.out.println("The element with linktext "+name+" is clicked successfully");
			reportStep("The element with linktext "+name+" is clicked successfully","pass");
		}catch (NoSuchElementException e) {
			//System.err.println("The element with linktext "+name+" is not found in the DOM");
			reportStep("The element with linktext "+name+" is not found in the DOM","fail");
		}catch (ElementClickInterceptedException e) {
			//System.err.println("The element with linktext "+name+" is not clickable in the application");
			reportStep("The element with linktext "+name+" is not clickable in the application","fail");
		}catch (ElementNotVisibleException e) {
			//System.err.println("The element with linktext "+name+" is not visible in the application");
			reportStep("The element with linktext "+name+" is not visible in the application","fail");
		}catch (UnhandledAlertException e) {
			//System.err.println("The element with linktext "+name+" is not clicked due to unexpected alert opened");
			reportStep("The element with linktext "+name+" is not clicked due to unexpected alert opened","fail");
		}catch (StaleElementReferenceException e) {
			//System.err.println("The element with linktext "+name+" is not stable in the application");
			reportStep("The element with linktext "+name+" is not stable in the application","fail");
		}catch (ElementNotInteractableException e) {
			//System.err.println("The element with linktext "+name+" is not interactable in the application");
			reportStep("The element with linktext "+name+" is not interactable in the application","fail");
		}catch (WebDriverException e) {
			//System.err.println("The element with linktext "+name+" is not clicked due to unknown error");
			reportStep("The element with linktext "+name+" is not clicked due to unknown error","fail");
		}
	}

	@Override
	public void clickByLinkNoSnap(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
			//System.out.println("The element with linktext "+name+" is clicked successfully");
			reportStep("The element with linktext "+name+" is clicked successfully","pass");
		} catch (NoSuchElementException e) {
			//System.err.println("The element with linktext "+name+" is not found in the DOM");
			reportStep("The element with linktext "+name+" is not found in the DOM","fail");
		}catch (StaleElementReferenceException e) {
			//System.err.println("The element with linktext "+name+" is not stable in the application");
			reportStep("The element with linktext "+name+" is not stable in the application","fail");
		}catch (ElementNotVisibleException e) {
			//System.err.println("The element with linktext "+name+" is not visible in the application");
			reportStep("The element with linktext "+name+" is not visible in the application","fail");
		}catch (UnhandledAlertException e) {
			//System.err.println("The element with linktext "+name+" is not clicked due to unexpected alert opened");
			reportStep("The element with linktext "+name+" is not clicked due to unexpected alert opened","fail");
		}catch (ElementClickInterceptedException e) {
			//System.err.println("The element with linktext "+name+" is not clickable in the application");
			reportStep("The element with linktext "+name+" is not clickable in the application","fail");
		}catch (ElementNotInteractableException e) {
			//System.err.println("The element with linktext "+name+" is not interactable in the application");
			reportStep("The element with linktext "+name+" is not interactable in the application","fail");
		}catch (WebDriverException e) {
			//System.err.println("The element with linktext "+name+" is not clicked due to unknown error");
			reportStep("The element with linktext "+name+" is not clicked due to unknown error","fail");
		}
		
	}

	@Override
	public void clickByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
			//System.out.println("The element with xpath "+xpathVal+" is clicked successfully");
			reportStep("The element with xpath "+xpathVal+" is clicked successfully","pass");
		} catch (NoSuchElementException e) {
			//System.err.println("The element with xpath "+xpathVal+" is not found in the DOM");
			reportStep("The element with xpath "+xpathVal+" is not found in the DOM","fail");
		}catch (ElementClickInterceptedException e) {
			//System.err.println("The element with xpath "+xpathVal+" is not clickable in the application");
			reportStep("The element with xpath "+xpathVal+" is not clickable in the application","fail");
		}catch (ElementNotVisibleException e) {
			//System.err.println("The element with xpath "+xpathVal+" is not visible in the application");
			reportStep("The element with xpath "+xpathVal+" is not visible in the application","fail");
		}catch (ElementNotInteractableException e) {
			//System.err.println("The element with xpath "+xpathVal+" is not interactable in the application");
			reportStep("The element with xpath "+xpathVal+" is not interactable in the application","fail");
		}catch (UnhandledAlertException e) {
			//System.err.println("The element with xpath "+xpathVal+" is not clicked due to unexpected alert opened");
			reportStep("The element with xpath "+xpathVal+" is not clicked due to unexpected alert opened","fail");
		}catch (StaleElementReferenceException e) {
			//System.err.println("The element with xpath "+xpathVal+" is not stable in the application");
			reportStep("The element with xpath "+xpathVal+" is not stable in the application","fail");
		}catch (WebDriverException e) {
			//System.err.println("The element with xpath "+xpathVal+" is not clicked due to unknown error");
			reportStep("The element with xpath "+xpathVal+" is not clicked due to unknown error","fail");
		}
		
	}

	@Override
	public void clickByXpathNoSnap(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
			//System.out.println("The element with xpath "+xpathVal+" is clicked successfully");
			reportStep("The element with xpath "+xpathVal+" is clicked successfully","pass",false);
		} catch (NoSuchElementException e) {
			//System.err.println("The element with xpath "+xpathVal+" is not found in the DOM");
			reportStep("The element with xpath "+xpathVal+" is not found in the DOM","fail");
		}catch (ElementClickInterceptedException e) {
			//System.err.println("The element with xpath "+xpathVal+" is not clickable in the application");
			reportStep("The element with xpath "+xpathVal+" is not clickable in the application","fail");
		}catch (ElementNotVisibleException e) {
			//System.err.println("The element with xpath "+xpathVal+" is not visible in the application");
			reportStep("The element with xpath "+xpathVal+" is not visible in the application","fail");
		}catch (ElementNotInteractableException e) {
			//System.err.println("The element with xpath "+xpathVal+" is not interactable in the application");
			reportStep("The element with xpath "+xpathVal+" is not interactable in the application","fail");
		}catch (UnhandledAlertException e) {
			//System.err.println("The element with xpath "+xpathVal+" is not clicked due to unexpected alert opened");
			reportStep("The element with xpath "+xpathVal+" is not clicked due to unexpected alert opened","fail");
		}catch (StaleElementReferenceException e) {
			//System.err.println("The element with xpath "+xpathVal+" is not stable in the application");
			reportStep("The element with xpath "+xpathVal+" is not stable in the application","fail");
		}catch (WebDriverException e) {
			//System.err.println("The element with xpath "+xpathVal+" is not clicked due to unknown error");
			reportStep("The element with xpath "+xpathVal+" is not clicked due to unknown error","fail");
		}
		
	}

	@Override
	public String getTextById(String idVal) {
		// TODO Auto-generated method stub
		String gettext=null;
		try {
		    gettext=driver.findElementById(idVal).getText();
			//System.out.println("The element with id "+idVal+" is holding the text "+gettext+" is returned successfully");
		    reportStep("The element with id "+idVal+" is holding the text "+gettext+" is returned successfully","pass");
		} catch (NoSuchElementException e) {
			//System.err.println("The element with id "+idVal+" is not found in the DOM");
			reportStep("The element with id "+idVal+" is not found in the DOM","fail");
		}catch (ElementNotVisibleException e) {
			//System.err.println("The element with id "+idVal+" is not visible in the application");
			reportStep("The element with id "+idVal+" is not visible in the application","fail");
		}catch (ElementNotInteractableException e) {
			//System.err.println("The element with id "+idVal+" is not interactable in the application");
			reportStep("The element with id "+idVal+" is not interactable in the application","fail");
		}catch (UnhandledAlertException e) {
			//System.err.println("The element with id "+idVal+" is not returned due to unexpected alert opened");
			reportStep("The element with id "+idVal+" is not returned due to unexpected alert opened","fail");
		}catch (StaleElementReferenceException e) {
			//System.err.println("The element with id "+idVal+" is not stable in the application");
			reportStep("The element with id "+idVal+" is not stable in the application","fail");
		}catch (WebDriverException e) {
			//System.err.println("The element with id "+idVal+" is not returned due to unknown error");
			reportStep("The element with id "+idVal+" is not returned due to unknown error","fail");
		}
		
		return gettext;
		}

	@Override
	public String getTextByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		String gettext=null;
		try {
			gettext=driver.findElementByXPath(xpathVal).getText();
			//System.out.println("The element with xpath "+xpathVal+" is holding the text "+gettext+" is returned successfully");
			reportStep("The element with xpath "+xpathVal+" is holding the text "+gettext+" is returned successfully","pass");
		}catch (NoSuchElementException e) {
			//System.err.println("The element with xpath "+xpathVal+" is not found in the DOM");
			reportStep("The element with xpath "+xpathVal+" is not found in the DOM","fail");
		}catch (ElementNotVisibleException e) {
			//System.err.println("The element with xpath "+xpathVal+" is not visible in the application");
			reportStep("The element with xpath "+xpathVal+" is not visible in the application","fail");
		}catch (ElementNotInteractableException e) {
			//System.err.println("The element with xpath "+xpathVal+" is not interactable in the application");
			reportStep("The element with xpath "+xpathVal+" is not interactable in the application","fail");
		}catch (UnhandledAlertException e) {
			//System.err.println("The element with xpath "+xpathVal+" is not returned due to unexpected alert opened");
			reportStep("The element with xpath "+xpathVal+" is not returned due to unexpected alert opened","fail");
		}catch (StaleElementReferenceException e) {
			//System.err.println("The element with xpath "+xpathVal+" is not stable in the application");
			reportStep("The element with xpath "+xpathVal+" is not stable in the application","fail");
		}catch (WebDriverException e) {
			//System.err.println("The element with xpath "+xpathVal+" is not returned due to unknown error");
			reportStep("The element with xpath "+xpathVal+" is not returned due to unknown error","fail");
		}
		
		return gettext;
	}

	@Override
	public void selectVisibileTextById(String id, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement text=driver.findElementById(id);
			Select selecttext=new Select(text);
			selecttext.selectByVisibleText(value);
			//System.out.println("The element with id "+id+" is selected visibletext "+value+" from the dropdown ");
			reportStep("The element with id "+id+" is selected visibletext "+value+" from the dropdown ","pass");
		} catch (NoSuchElementException e) {
			//System.err.println("The element with id "+id+" is not found in the DOM");
			reportStep("The element with id "+id+" is not found in the DOM","fail");
		}catch (ElementNotVisibleException e) {
			//System.err.println("The element with id "+id+" is not visible in the application");
			reportStep("The element with id "+id+" is not visible in the application","fail");
		}catch (ElementNotInteractableException e) {
			//System.err.println("The element with id "+id+" is not interactable in the appliaction");
			reportStep("The element with id "+id+" is not interactable in the appliaction","fail");
		}catch (UnhandledAlertException e) {
			//System.err.println("The element with id "+id+" is not selected due to unexpected alert opened");
			reportStep("The element with id "+id+" is not selected due to unexpected alert opened","fail");
		}catch (ElementNotSelectableException e) {
			//System.err.println("The element with id "+id+" is not selectable in the application");
			reportStep("The element with id "+id+" is not selectable in the application","fail");
		}catch (StaleElementReferenceException e) {
			//System.err.println("The element with id "+id+" is not stable in the application");
			reportStep("The element with id "+id+" is not stable in the application","fail");
		}catch (WebDriverException e) {
			//System.err.println("The element with id "+id+" is not selected  due to unknown error");
			reportStep("The element with id "+id+" is not selected  due to unknown error","fail");
		}
		
	}

	@Override
	public void selectIndexById(String id, int value) {
		// TODO Auto-generated method stub
		try {
			WebElement text=driver.findElementById(id);
			Select selectindex=new Select(text);
			selectindex.selectByIndex(value);
			System.out.println("The element with id "+id+" is selected indexvalue "+value+" from the dropdown");
		} catch (NoSuchElementException e) {
			System.err.println("The element with id "+id+" is not found in the DOM");
		}catch (ElementNotVisibleException e) {
			System.err.println("The element with id "+id+" is not visible in the application");
		}catch (StaleElementReferenceException e) {
			System.err.println("The element with id "+id+" is not stable in the application");
		}catch (ElementNotInteractableException e) {
			System.err.println("The element with id "+id+" is not interactable in the appliaction");
		}catch (UnhandledAlertException e) {
			System.err.println("The element with id "+id+" is not selected due to unexpected alert opened");
		}catch (ElementNotSelectableException e) {
			System.err.println("The element with id "+id+" is not selectable in the application");
		}catch (WebDriverException e) {
			System.err.println("The element with id "+id+" is not selected due to unknown error");
		}
		
	}

	@Override
	public void switchToParentWindow() {
		// TODO Auto-generated method stub
		try {
			Set<String> parentwindow=driver.getWindowHandles();
			
			for(String eachID:parentwindow) 
			{
				driver.switchTo().window(eachID);
				break;
			}
			//System.out.println("The current window is switched to parent window successfully");
			reportStep("The current window is switched to parent window successfully","pass");
		} catch (NoSuchWindowException e) {
			//System.err.println("The current window is not switched to parent window due to parent window is not found");
			reportStep("The current window is not switched to parent window due to parent window is not found","fail");
		}catch (WebDriverException e) {
			//System.err.println("The current window is not switched to parent window due to unknown error");
			reportStep("The current window is not switched to parent window due to unknown error","fail");
		}
		
	}
	@Override
	public void switchToLastWindow() {
		// TODO Auto-generated method stub
		try {
			Set<String> lastwindow=driver.getWindowHandles();
			for(String eachid:lastwindow)
			{
				driver.switchTo().window(eachid);
			}
			//System.out.println("The current window is switched to last window successfully");
			reportStep("The current window is switched to last window successfully","pass");
		}catch (NoSuchWindowException e) {
			//System.err.println("The current window is not switched to last window due to last window is not found");
			reportStep("The current window is not switched to last window due to last window is not found","fail");
		}catch (WebDriverException e) {
			//System.err.println("The current window is not switched to last window due to unknown error");
			reportStep("The current window is not switched to last window due to unknown error","fail");
		}
	}

	@Override
	public void acceptAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().accept();
			//System.out.println("The alert window is accepted successfully");
			reportStep("The alert window is accepted successfully","pass");
		} catch (NoAlertPresentException e) {
			//System.err.println("The alert window is not opened in the application");
			reportStep("The alert window is not opened in the application","fail");
		}catch (WebDriverException e) {
			//System.err.println("The alert window is not accepted due to unknown error");
			reportStep("The alert window is not accepted due to unknown error","fail");
		}
		
	}

	@Override
	public void dismissAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().dismiss();
			//System.out.println("The alert window is cancelled successfully");
			reportStep("The alert window is cancelled successfully","pass");
		} catch (NoAlertPresentException e) {
			//System.err.println("The alert window is not opened in the application");
			reportStep("The alert window is not opened in the application","fail");
		}catch (WebDriverException e) {
			//System.err.println("The alert window is not cancelled due to unknown error"); 
			reportStep("The alert window is not cancelled due to unknown error","fail");
		}
		
	}

	@Override
	public String getAlertText() {
		// TODO Auto-generated method stub
		String alerttext=null;   
		try {
		    alerttext=driver.switchTo().alert().getText();
			//System.out.println("The alert text is returned successfully");
		    reportStep("The alert text is returned successfully","pass",false);
		} catch (NoAlertPresentException e) {
			//System.err.println("The alert window is not opened in the application");
			reportStep("The alert window is not opened in the application","fail");
		}catch (WebDriverException e) {
			//System.err.println("The alert text is not returned due to unknown error");
			reportStep("The alert text is not returned due to unknown error","fail");
		}
		return alerttext;
		
	}

	
	

	@Override
	public void closeBrowser() {
		// TODO Auto-generated method stub
		try {
			driver.close();
			System.out.println("The current browser is closed successfully");
		} catch (UnhandledAlertException e) {
			System.err.println("The current browser is not closed due to unexpected alert opened");
		}catch (WebDriverException e) {
			System.err.println("The current browser is not closed due to unknown error");
		}
		
	}

	@Override
	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		try {
			driver.quit();
			//System.out.println("All browsers is closed successfully");
			reportStep("All browsers is closed successfully","pass",false);
		} catch (WebDriverException e) {
			//System.err.println("All browsers is not closed due to unknown error");
			reportStep("All browsers is not closed due to unknown error","fail");
		}
		
	}
	
	public void waitproperty(long millis)
	{
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			System.err.println("The execution is interrupted in the application");
		}
	}
	public void selectVisibileTextByXpath(String xpath, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement text=driver.findElementByXPath(xpath);
			WebDriverWait wait=new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.elementToBeClickable(text));
			Select selecttext=new Select(text);
			selecttext.selectByVisibleText(value);

			//System.out.println("The element with xpath "+xpath+" is selected visibletext "+value+" from the dropdown ");
			reportStep("The element with xpath "+xpath+" is selected visibletext "+value+" from the dropdown ","pass");
		} catch (NoSuchElementException e) {
			//System.err.println("The element with xpath "+xpath+" is not found in the DOM");
			reportStep("The element with xpath "+xpath+" is not found in the DOM","fail");
		}catch (ElementNotVisibleException e) {
			//System.err.println("The element with xpath "+xpath+" is not visible in the application");
			reportStep("The element with xpath "+xpath+" is not visible in the application","fail");
		}catch (ElementNotInteractableException e) {
			//System.err.println("The element with xpath "+xpath+" is not interactable in the appliaction");
			reportStep("The element with xpath "+xpath+" is not interactable in the appliaction","fail");
		}catch (UnhandledAlertException e) {
			//System.err.println("The element with xpath "+xpath+" is not selected due to unexpected alert opened");
			reportStep("The element with xpath "+xpath+" is not selected due to unexpected alert opened","fail");
		}catch (ElementNotSelectableException e) {
			//System.err.println("The element with xpath "+xpath+" is not selectable in the application");
			reportStep("The element with xpath "+xpath+" is not selectable in the application","fail");
		}catch (StaleElementReferenceException e) {
			//System.err.println("The element with xpath "+xpath+" is not stable in the application");
			reportStep("The element with xpath "+xpath+" is not stable in the application","fail");
		}catch (WebDriverException e) {
			//System.err.println("The element with xpath "+xpath+" is not selected  due to unknown error");
			reportStep("The element with xpath "+xpath+" is not selected  due to unknown error","fail");
		}
	}
	
	public void selectVisibileTextByName(String name, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement text=driver.findElementByName(name);
			Select selecttext=new Select(text);
			selecttext.selectByVisibleText(value);
			//System.out.println("The element with name "+name+" is selected visibletext "+value+" from the dropdown ");
			reportStep("The element with name "+name+" is selected visibletext "+value+" from the dropdown ","pass");
		} catch (NoSuchElementException e) {
			System.err.println("The element with name "+name+" is not found in the DOM");
		}catch (ElementNotVisibleException e) {
			System.err.println("The element with name "+name+" is not visible in the application");
		}catch (ElementNotInteractableException e) {
			System.err.println("The element with name "+name+" is not interactable in the appliaction");
		}catch (UnhandledAlertException e) {
			System.err.println("The element with name "+name+" is not selected due to unexpected alert opened");
		}catch (ElementNotSelectableException e) {
			System.err.println("The element with name "+name+" is not selectable in the application");
		}catch (StaleElementReferenceException e) {
			System.err.println("The element with name "+name+" is not stable in the application");
		}catch (WebDriverException e) {
			System.err.println("The element with name "+name+" is not selected  due to unknown error");
		}
		
		
	}
	
	public void pageDownByXpath(String value) {
		 
		 try {
			driver.findElementByXPath(value).sendKeys(Keys.PAGE_DOWN);
			//System.out.println("The element with xpath "+value+" is scrolled down the page successfully");
			reportStep("The element with xpath "+value+" is scrolled down the page successfully","pass");
		}catch (NoSuchElementException e) {
			//System.err.println("The element with xpath "+value+" is not found in the DOM");
			reportStep("The element with xpath "+value+" is not found in the DOM","fail");
		}catch (UnhandledAlertException e) {
			//System.err.println("The element with xpath "+value+" is not scrolled down the page due to unexpected alert opened");
			reportStep("The element with xpath "+value+" is not scrolled down the page due to unexpected alert opened","fail");
		}catch (ElementNotInteractableException e) {
			//System.err.println("The element with xpath "+value+" is not interactable in the application");
			reportStep("The element with xpath "+value+" is not interactable in the application","fail");
		}catch (WebDriverException e) {
			//System.err.println("The element with xpath "+value+"is not scrolled down the page due to unknown error");
			reportStep("The element with xpath "+value+"is not scrolled down the page due to unknown error","fail");
		}
		 
	 }
	 public void pageUpByXpath(String value) {
		 
		 try {
			driver.findElementByXPath(value).sendKeys(Keys.PAGE_UP);
			//System.out.println("The element with xpath "+value+" is scrolled up the page successfully");
			reportStep("The element with xpath "+value+" is scrolled up the page successfully","pass");
		}catch (NoSuchElementException e) {
			//System.err.println("The element with xpath "+value+" is not found in the DOM ");
			reportStep("The element with xpath "+value+" is not found in the DOM ","fail");
		}catch (UnhandledAlertException e) {
			//System.err.println("The element with xpath "+value+" is not scrolled up the page due to unexpected alert opened");
			reportStep("The element with xpath "+value+" is not scrolled up the page due to unexpected alert opened","fail");
		}catch (ElementNotInteractableException e) {
			//System.err.println("The element with xpath "+value+" is not interactable in the application");
			reportStep("The element with xpath "+value+" is not interactable in the application","fail");
		}catch (WebDriverException e) {
			//System.err.println("The element with xpath "+value+"is not scrolled up the page due to unknown error");
			reportStep("The element with xpath "+value+"is not scrolled up the page due to unknown error","fail");
		}
		 
	 }
	 public void switchToframeXpath(String name) {
		 
		 try {
			WebElement newframe=driver.findElementByXPath(name);
			driver.switchTo().frame(newframe);
			//System.out.println("The element with id "+name+" is switched to frame successfully");
			reportStep("The element with xpath "+name+" is switched to frame successfully","pass");
		} catch (NoSuchFrameException e) {
			//System.err.println("The element with id "+name+" is not switched to frame due to frame is not opened");
			reportStep("The element with xpath "+name+" is not switched to frame due to frame is not opened","fail");
		}catch (NoSuchElementException e) {
			//System.err.println("The element with id "+name+" is found in the DOM ");
			reportStep("The element with xpath "+name+" is found in the DOM ","fail");
		}catch (ElementNotVisibleException e) {
			//System.err.println("The element with id "+name+" is not visible in the application");
			reportStep("The element with xpath "+name+" is not visible in the application","fail");
		}catch (StaleElementReferenceException e) {
			//System.err.println("The element with id "+name+" is not stable in the application");
			reportStep("The element with xpath "+name+" is not stable in the application","fail");
		}catch (UnhandledAlertException e) {
			//System.err.println("The element with id "+name+" is not switched to frame due to unexpected alert opened");
			reportStep("The element with xpath "+name+" is not switched to frame due to unexpected alert opened","fail");
		}catch (WebDriverException e) {
			//System.err.println("The element with id "+name+" is not switched to frame due to unknown error");
			reportStep("The element with xpath "+name+" is not switched to frame due to unknown error","fail");
		}
	 }
	 public void switchTodefault() {
		 
		 try {
			driver.switchTo().defaultContent();
			//System.out.println("The page is switched to defaultcontent");
			reportStep("The page is switched to defaultcontent","pass");
			
		} catch (UnhandledAlertException e) {
			//System.err.println("The page is not switched to default content due to unexpected alert opened");
			reportStep("The page is not switched to default content due to unexpected alert opened","fail");
		}catch (WebDriverException e) {
			//System.err.println("The page is not switched to default content due to unknown error");
			reportStep("The page is not switched to default content due to unknown error","fail");
		}
		 
	 }
		public void verifyTextContainsById(String id, String text) {
			// TODO Auto-generated method stub
			try {
				String actualtext=driver.findElementById(id).getText();
				if(actualtext.contains(text)) {
					System.out.println("The element with id "+id+" is holding the text "+actualtext+" is matched with expected text "+text+" ");
				}else {
					System.err.println("The element with id "+id+" is holding the text "+actualtext+" is not matched with expected text "+text+" ");
				}
			} catch (NoSuchElementException e) {
				System.err.println("The element with id "+id+" is not found in the DOM");
			}catch (ElementNotVisibleException e) {
				System.err.println("The element with id "+id+" is not visible in the application");
			}catch (ElementNotInteractableException e) {
				System.err.println("The element with id "+id+" is not interactable in the application");
			}catch (StaleElementReferenceException e) {
				System.err.println("The element with id "+id+" is not stable in the application");
			}catch (UnhandledAlertException e) {
				System.err.println("The element with id "+id+" is not verified due to unexpected alert opened");
	        }catch (WebDriverException e) {
				System.err.println("The element with id "+id+" is not verified due to unknown error");
			}
		}
		
		public void refresh() {
			
			try {
				driver.navigate().refresh();
				//System.out.println("The page is refreshed successfully");
				reportStep("The page is refreshed successfully","pass");
			} catch (UnhandledAlertException e) {
				//System.err.println("The page is not refreshed due to unexpected alert opened");
				reportStep("The page is not refreshed due to unexpected alert opened","fail");
			}catch (WebDriverException e) {
				//System.err.println("The page is not refreshed due to unknown error");
				reportStep("The page is not refreshed due to unknown error","fail");
			} 
			
		}
		
		public void enterDataInToAlert(String name) {
			
			try {
				driver.switchTo().alert().sendKeys(name);
				//System.out.println("The text "+name+" is entered in the alert window");
				reportStep("The text "+name+" is entered in the alert window","pass",false);
			} catch (NoAlertPresentException e) {
				//System.err.println("The alert window is not opened in the application");
				reportStep("The alert window is not opened in the application","fail");
			}catch (WebDriverException e) {
				//System.err.println("The text "+name+" is not entered in the alert window due to unknown error");
				reportStep("The text "+name+" is not entered in the alert window due to unknown error","fail");
			}
			
		}
		public void mouseHoverByXpath(String value)
		{
			try {
				Actions builder=new Actions(driver);
				WebElement click=driver.findElementByXPath(value);
				builder.moveToElement(click).perform();
				//System.out.println("The element with xpath "+value+" is moved to the element Succesfully");
				reportStep("The element with xpath "+value+" is moved to the element Succesfully","pass");
			} catch (NoSuchElementException e) {
				//System.err.println("The element with xpath "+value+" is not found in the DOM");
				reportStep("The element with xpath "+value+" is not found in the DOM","fail");
			}catch (ElementNotVisibleException e) {
				//System.err.println("The element with xpath "+value+" is not visible in the application");
				reportStep("The element with xpath "+value+" is not visible in the application","fail");
			}catch (ElementNotInteractableException e) {
				//System.err.println("The element with xpath "+value+" is not interactable in the application");
				reportStep("The element with xpath "+value+" is not interactable in the application","fail");
			}catch (UnhandledAlertException e) {
				//System.err.println("The element with xpath "+value+" is not moved to the element due to unexpected alert opened");
				reportStep("The element with xpath "+value+" is not moved to the element due to unexpected alert opened","fail");
			}catch (StaleElementReferenceException e) {
				//System.err.println("The element with xpath "+value+" is not stable in the application");
				reportStep("The element with xpath "+value+" is not stable in the application","fail");
			}catch (WebDriverException e) {
				//System.err.println("The element with xpath "+value+" is not moved to the element due to unknown error");
				reportStep("The element with xpath "+value+" is not moved to the element due to unknown error","fail");
			}
		}
		    
		@Override
		public long takeSnap()  {
			// TODO Auto-generated method stub
			
			long number=0;
			try {
				
				number=(long) (Math.floor(Math.random()*100000000)+100000);
				File temp=driver.getScreenshotAs(OutputType.FILE);
				File des=new File("./reports/Screenshot/"+number+".png");
				FileUtils.copyFile(temp, des);
			} catch (WebDriverException e) {
				System.err.println("The screenshot is not taken due to unknown error");
			} catch (IOException e) {
				System.err.println("The screenshot is not taken due to input and output error");
			}
			return number;
			
	    }
		
	 
	 
	 
	 
	}
	
	
	


