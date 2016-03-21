package forMangoIM;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestIM {

	public static boolean testResult = true;
	public static Properties props = new Properties();
	public static ChromeDriver driver;
	public TestIM() {
		setCurrPath();
	}

	public static void main(String[] args) throws InterruptedException,
			IOException {
		TestIM ob = new TestIM();

		try {
			ob.loadParams(); 
			ob.startDriver(); 
		} catch (Exception ex) {
			ex.printStackTrace();
			testResult = false;
		}

// ������ �� ������� 		
	/*	try {
			ob.goToPage("//a[contains(@href, '/shop/products')]",
					"//a[contains(@class, 'btn-enter')]", 
					"������� ��");
		} catch (Exception ex) {
			ex.printStackTrace();
			testResult = false;
		}
		
		try {
			ob.goToPage("//a[contains(@href, '/shop/delivery')]",
					"//a[contains(@href, '/shop/payment')]", 
					"�������� � ���������");
		} catch (Exception ex) {
			ex.printStackTrace();
			testResult = false;
		}
		
		try {
			ob.goToPage("//a[contains(@href, '/shop/payment')]",
					"//a[contains(@href, '/shop/products')]", 
					"������� ������");
		} catch (Exception ex) {
			ex.printStackTrace();
			testResult = false;
		}
		
		try {
			ob.goToPage("//a[contains(@href, '/shop/devices')]",
					"//a[contains(@href, '/shop/products')]", 
					"������������");
		} catch (Exception ex) {
			ex.printStackTrace();
			testResult = false;
		}*/
		
		try {
			ob.goToPage("//a[contains(@href, '/shop/products')]",
					"//a[contains(@href, '/shop/tariffs/vpbx')]", 
					"��������");
		} catch (Exception ex) {
			ex.printStackTrace();
			testResult = false; 
		}
// ������� ���� � ��������
		try {
			ob.goToPage("//a[contains(@href, '/shop/tariffs/vpbx')]",
					"//a[contains(@href, '/shop/tariffs/choose')]", 
					"������ ����");
		} catch (Exception ex) {
			ex.printStackTrace();
			testResult = false;
		}
		
		try {
			ob.goToPage("//div[@id='top_header_tariffs']/div[4]/div/div[4]",
					"//a[@id='vpbx_next']", 
					"����� ������ ����");
		} catch (Exception ex) {
			ex.printStackTrace();
			testResult = false;
		}
		
		try {
			ob.goToPage("//a[@id='vpbx_next']",
					"//div[@id='tariff_list']/div[3]/div/div[2]", 
					"������� � ������� �� �����");
		} catch (Exception ex) {
			ex.printStackTrace();
			testResult = false;
		}
		
		try {
			ob.goToPage("//div[@id='tariff_list']/div[3]/div/div[2]",
					"//a[@id='select_vats_tariff_next']", 
					"����� ������ �� �����");
		} catch (Exception ex) {
			ex.printStackTrace();
			testResult = false;
		}
		
		try {
			ob.goToPage("//a[@id='select_vats_tariff_next']",
					"//a[contains(text(),'������� ���������')]", 
					"������� � ������ ������");
		} catch (Exception ex) {
			ex.printStackTrace();
			testResult = false;
		}
		
		try {
			ob.goToPage("//a[contains(text(),'������� ���������')]",
					"//a[contains(text(),'������� ���������')]", 
					"����� ������");
		} catch (Exception ex) {
			ex.printStackTrace();
			testResult = false;
		}
		
		try {
			ob.goToPage("//a[contains(text(),'������� ���������')]",
					"//a[contains(text(),'������� ���������')]", 
					"����� ������");
		} catch (Exception ex) {
			ex.printStackTrace();
			testResult = false;
		}
		
		try {
			ob.goToPage("//a[contains(text(),'����������')]",
					"//input[@id='order_button_check']", 
					"� �������");
		} catch (Exception ex) {
			ex.printStackTrace();
			testResult = false;
		}
		
		try {
			ob.goToPage("//span[@class='amount__up icon icon--amount-up']",
					"//span[@class='amount__up icon icon--amount-up']", 
					"���������� ����� ��������");
			Thread.sleep(3000);
		} catch (Exception ex) {
			ex.printStackTrace();
			testResult = false;
		}
		
		try {
			ob.goToPage("//span[@class='amount__up icon icon--amount-up']",
					"//span[@class='amount__up icon icon--amount-up']", 
					"���������� ����� ��������");
			Thread.sleep(3000);
		} catch (Exception ex) {
			ex.printStackTrace();
			testResult = false;
		}
		
		try {
			ob.goToPage("//span[@class='amount__down icon icon--amount-down']",
					"//a[@class = 'number-del  icon icon--del']", 
					"���������� ����� ��������");
			Thread.sleep(3000);
		} catch (Exception ex) {
			ex.printStackTrace();
			testResult = false;
		}
		
		try {
			ob.delOverConfirm("//div[@class = 'order-number']/a[@class = 'number-del  icon icon--del'][1]",
					"�������� ������ DID");                                                                           
		} catch (Exception ex) {
			ex.printStackTrace();
			testResult = false;
		}
		
		try {
			ob.goToPage("//a[contains(@href, '/shop/devices')]",        ////////////////////////////////////// 
					"//div[@class = 'add_cart']/a[@class = 'catalog_add']", 
					"������� � ������������");
		} catch (Exception ex) {
			ex.printStackTrace();
			testResult = false;
		}
		
		try {
			ob.goToPage("//div[@class = 'add_cart']/a[@class = 'catalog_add']",
					"//div[@class='in_basket']", 
					"������� ������������");
		} catch (Exception ex) {
			ex.printStackTrace();
			testResult = false;
		}
		
		try {
			ob.goToPage("//div[@class='menu-basket']",
					"//tr[contains(@data-test, '������������')]", 
					"������� � ������� � ���� � �������������");
		} catch (Exception ex) {
			ex.printStackTrace();
			testResult = false;
		}
		
		try {
			ob.goToPage("//input[@id='order_button_check']",
					"//div[@class = 'register-block']", 
					"������ �������� ����� - ������� � ����� �����������");
		} catch (Exception ex) {
			ex.printStackTrace();
			testResult = false;
		}
		
		try { // ����� �� ����� ����������� 
			ob.loginOnRegForm();
		} catch (Exception ex) {
			ex.printStackTrace();
			testResult = false;
		} 		

		try {
			ob.goToPage("//a[contains(@href, '?logout=yes')]",
					"//a[@id='open_login_popup']", 
					"����� �� ������� ������� ������");
		} catch (Exception ex) {
			ex.printStackTrace();
			testResult = false;
		}
		
		try {
			ob.goToPage("//a[@id='open_login_popup']",
					"//a[contains(@href, '/shop/registration')]", 
					"�������� ���� ������ � ��");
		} catch (Exception ex) {
			ex.printStackTrace();
			testResult = false;
		}

		try {
			ob.goToPage("//a[contains(@href, '/shop/registration')]",
					"//div[@class = 'register-block']", 
					"����� ����������� ������ ������������");
		} catch (Exception ex) {
			ex.printStackTrace();
			testResult = false;
		}
		
// �������� ����������� ������� ��� ��������		
		try {
			ob.goToPage("//a[contains(@href, '/shop/products')]",
					"//a[contains(@href, '/shop/numbers')]", 
					"�������� ���������");
		} catch (Exception ex) {
			ex.printStackTrace();
			testResult = false;
		}
		
		try {
			ob.goToPage("//a[contains(@href, '/shop/numbers')]",
					"//div[@id='max_select_numbers_city']/a", 
					"�������� �������");
		} catch (Exception ex) {
			ex.printStackTrace();
			testResult = false;
		}


		
		
		
		
		
		
		
		
		
		
		
		///////////////////////////////////////////////////

	/*	try { // ����� �� �������� ����� ����� ������ ����
			ob.loginIM();
		} catch (Exception ex) {
			ex.printStackTrace();
			testResult = false;
		} 		*/

		ob.printResult();
		driver.quit();

	}

	
	public void startDriver()
			throws InterruptedException, IOException {
		try{			
		if (isWin()) {	
			System.setProperty("webdriver.chrome.driver",
					"F:\\!AUTO\\driver\\chromedriver.exe");
		}else {
				   System.setProperty("webdriver.chrome.driver",
				     "//usr//bin//chromedriver");
				  }	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(props.getProperty("urlBasic")); 
		Timestamp currentTimestamp = new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());
		appendToLog(currentTimestamp.toString());
		appendToLog(System.getProperty("os.name").toLowerCase());
		appendToLog("������� �������� ����� - OK");
		} catch (Exception e) {
			System.out.println(e);
			testResult = false;
		}	
	}
	
	public static boolean isWin() {
		  String OS = System.getProperty("os.name").toLowerCase();
		  return (OS.indexOf("win") >= 0);
		 }

	public void goToPage(String destination, String waitElement, String pageName)
			throws InterruptedException, IOException {		
		try{
		driver.findElement(By.xpath(destination)).click(); 
		(new WebDriverWait(driver, 10))
		.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath(waitElement))); 
		appendToLog(pageName + " - OK");
		} catch (Exception e) {
			System.out.println(e);
			testResult = false;
			takeScreen(pageName);
			appendToLog(pageName + " - Fail");
		}	
	}
	
	
	
	
	public void selectCities (String hoverDestination, String destination, String waitElement, String pageName) 

			throws InterruptedException, IOException {		
		try{
			
			
					Actions actions = new Actions(driver);
					actions.moveToElement( driver.findElement(By.xpath("//div[@id='max_select_numbers_city']/a")));
					
		
					
					actions.build().perform();
		driver.findElement(By.xpath(destination)).click(); 
		(new WebDriverWait(driver, 10))
		.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath(waitElement))); 
		appendToLog(pageName + " - OK");
		} catch (Exception e) {
			System.out.println(e);
			testResult = false;
			takeScreen(pageName);
			appendToLog(pageName + " - Fail");
		}	
	}
	
	
	
	
	
	
	
	
	public void loginIM()
			throws InterruptedException, IOException {
		
		try{
		driver.findElementByXPath("//a[contains(@class, 'btn-enter')]").click();
		
		driver.findElementByXPath("//input[@name='USER_LOGIN']").sendKeys(props.getProperty("login"));

		driver.findElementByXPath("//input[@name='USER_PASSWORD']").sendKeys(props.getProperty("password"));

		driver.findElementByXPath("//input[@value='�����']").click();

		waitForElementAppear(By.xpath("//a[contains(@href, '?logout=yes')]"));
		appendToLog("����� �� - OK");
		}catch (Exception e) {
			System.out.println(e);
			testResult = false;
			takeScreen("����� ��");
			appendToLog("����� �� - Fail");
		}		
	}

	public void loginOnRegForm()
			throws InterruptedException, IOException {
		
		try{
		
		driver.findElementByXPath("//input[@id='enter-login']").sendKeys(props.getProperty("login"));

		driver.findElementByXPath("//input[@id='enter-pass']").sendKeys(props.getProperty("password"));

		driver.findElementByXPath("//input[@value='�����']").click();

		waitForElementAppear(By.xpath("//a[contains(@href, '?logout=yes')]"));
		appendToLog("����� �� - OK");
		}catch (Exception e) {
			System.out.println(e);
			testResult = false;
			takeScreen("����� ��");
			appendToLog("����� �� - Fail");
		}		
	}

	
	
	public static boolean isElementPresent(String elem) { 		 
		  try { 			  
			  driver.findElementByXPath(elem);
		   
		   return true; } 
		  catch (NoSuchElementException e) { 		  
		   return false; } 
		 }
	

	public void printResult() throws IOException {
		if (testResult) {
			appendToLog("���� ������ �������");
		} else {
			appendToLog("���� ����������. ��������� ��������� � ��� ����");
		}

	}

	public void waitForElementAppear(By locator) {
		try {
			(new WebDriverWait(driver, 10)).until(ExpectedConditions
					.visibilityOfElementLocated(locator));
		} catch (Exception e) {
			testResult = false;
		}
	}


	private static void appendToLog(String logMessage) throws IOException {
		File log = new File("log.txt");
		FileWriter fw = new FileWriter(log, true);
		PrintWriter pw = new PrintWriter(fw, true);
		pw.println(logMessage);

		pw.close();
		fw.close();
	}

	

	public void loadParams() {

		InputStream is = null;

		try {
			File f = new File("res/config.properties");

			is = new FileInputStream(f);
		} catch (Exception e) {
			is = null;
		}

		try {

			props.load(is);

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	protected void takeScreen(String filename) {
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;

		File scrFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		File destFile = getDestinationFile(filename);
		try {
			FileUtils.copyFile(scrFile, destFile);
		} catch (IOException ioe) {
			throw new RuntimeException(ioe);
		}
	}

	private File getDestinationFile(String filename) {
		File f = new File(".");

		String absoluteFileName = f.getAbsolutePath() + "/ScreenShots/"
				+ filename + ".png";

		return new File(absoluteFileName);
	}

	private static void setCurrPath() {
		File dir = new File("");
		dir.getAbsolutePath();

	}
	
	private static void pressOKinAlert() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		alert.accept();
		
	}
	
	public void delOverConfirm(String delButtonLink, String pageName)throws InterruptedException, IOException {		
		try{
		driver.findElement(By.xpath(delButtonLink)).click(); 
		pressOKinAlert();
		Thread.sleep(1500);
		appendToLog(pageName + " - OK");
	}catch (Exception e) {
		System.out.println(e);
		testResult = false;
		takeScreen(pageName);
		appendToLog(pageName + " - Fail");
		}	
	}

}
