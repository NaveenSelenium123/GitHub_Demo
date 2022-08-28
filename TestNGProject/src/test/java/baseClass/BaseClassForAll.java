package baseClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassForAll {
	public  WebDriver driver;
	public  void browserConFig() {
		WebDriverManager.chromedriver().setup();	
		driver= new ChromeDriver();
	}
	
	public  void loadUrl(String url) {
		driver.get(url);
	}
	
	public void navigate(String url) {
		driver.navigate().to(url);
	}
	
	public String getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}
	public String getTitle() {
		String title = driver.getTitle();
		return title;
	}
	
	public  void maximize() {
		driver.manage().window().maximize();
	}
	public void refresh() {
		driver.navigate().refresh();
	}
	
	public void forward() {
		driver.navigate().forward();
	}
	
	public void back() {
		driver.navigate().back();
	}
	
	public void close() {
		driver.close();
	}
	
	//10
	
	public  void quitWindow() {
		driver.quit();
	}

	public WebElement locateById(String id) {
		WebElement element = driver.findElement(By.id(id));
		return element;
	}

	public WebElement locateByName(String name) {
		WebElement element = driver.findElement(By.id(name));
		return element;
	}
	
	public  WebElement locateByclass(String classname) {
		WebElement element = driver.findElement(By.id(classname));
		return element;
	}
	
	public WebElement locateByXpath(String xpathExpression) {
		WebElement element = driver.findElement(By.xpath(xpathExpression));
		return element;
	}
	
	public WebElement locateByXpathWithText(String xpathExpression) {
		WebElement element = driver.findElement(By.xpath(xpathExpression));
		return element;
	}
	
	public WebElement locateByXpathContains(String xpathExpression) {
		WebElement element = driver.findElement(By.xpath(xpathExpression));
		return element;
	}
	
	
	public WebElement locateByXpathParticallyContains(String xpathExpression) {
		WebElement element = driver.findElement(By.xpath(xpathExpression));
		return element;
	}
	
	public WebElement locateByTagName(String name) {
		WebElement element = driver.findElement(By.xpath(name));
		return element;
	}
	
	public void sendKeys(WebElement element, String data) {
		element.sendKeys(data);
	}
	
	//20
	public String getText(WebElement element) {
		String text = element.getText();
		return text;
	}
	
	public static String getAttribute(WebElement element) {
		String text = element.getAttribute("value");
		return text;
	}
	
	public void click(WebElement element) {
		element.click();
	}
	
	public void clear(WebElement element) {
		element.clear();	
	}
	
	
	public void alertAccept() {
		Alert alert=driver.switchTo().alert();
		alert.accept();
		}
	
	public void alertDismiss() {
		Alert alert=driver.switchTo().alert();
		alert.dismiss();
		}
	
	public void alertSendKeys(String keysToSend) {
		Alert alert=driver.switchTo().alert();
		alert.sendKeys(keysToSend);
		}
	
	public String alertGetText() {
		Alert alert=driver.switchTo().alert();
		String text = alert.getText();
		return text;
	}
	
	public void AlertAutheticationBox(String url) {
		driver.get(url);
	}

	public void moveToElement(WebElement element) {
		Actions actions=new Actions(driver);
		actions.moveToElement(element).perform();
	}
	//30
	
	public void dragAndDrop(WebElement fromElement, WebElement toElement ) {
		Actions actions=new Actions(driver);
		actions.dragAndDrop(fromElement, toElement).perform();
	}
	
	public void conTextClick(WebElement element) {
		Actions actions=new Actions(driver);
		actions.contextClick(element).perform();
	}
	
	public void actionsSendKeysInCapital(WebElement element, String keys) {
		Actions actions=new Actions(driver);
		actions.keyDown(Keys.SHIFT).sendKeys(element, keys).keyUp(Keys.SHIFT).perform();
	}
	

	
	public void takeScreenshot(String location) throws IOException {
		TakesScreenshot screenshot=(TakesScreenshot)driver;
		File srcFile=screenshot.getScreenshotAs(OutputType.FILE);
		File destFile=new File(location);
		FileUtils.copyFile(srcFile, destFile);
	}
	public void elementScreenshot(WebElement element,String location) throws IOException {
		TakesScreenshot screenshot=(TakesScreenshot)driver;
		File srcFile=element.getScreenshotAs(OutputType.FILE);
		File destFile=new File(location);
		FileUtils.copyFile(srcFile, destFile);
	}
	
	
	public Object JsGetAttribute(WebElement element) {
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		Object executeScript = executor.executeScript( "arguments[0].getAttribute('value')", element);
		return executeScript;
		}
	
	public void JsSetAttribute(String data,WebElement element) {
		JavascriptExecutor executor=(JavascriptExecutor)driver;

		executor.executeScript( "return arguments[0].setAttribute('value','data')", element);
		}
	
	public void JsClick(WebElement element) {
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript( "arguments[0].click()", element);
		}
	
	public void dDSelectByIndex(WebElement element, int index) {
		Select select=new Select(element);
		select.selectByIndex(index);
	}
	
	public void dDSelectByValue(WebElement element, String value) {
		Select select=new Select(element);
		select.selectByValue(value);
	}
	
	//40
	
	public void dDSelectByVisibleText(WebElement element, String text) {
		Select select=new Select(element);
		select.selectByVisibleText(text);
	}
	
	public void dDgetOptions(WebElement element) {
		Select select=new Select(element);
		List<WebElement> options = select.getOptions();
	}
	
	public String dDGetOptionsByIndex(WebElement element,int index) {
		Select select=new Select(element);
		List<WebElement> options = select.getOptions();
		WebElement elementSub = options.get(index);
		String text = elementSub.getText();
		return text;
	}
	
	public String dDGetOptionsByAttribute(WebElement element,int index, String value) {
		Select select=new Select(element);
		List<WebElement> options = select.getOptions();
		WebElement elementSub = options.get(index);
		String text1 = elementSub.getAttribute(value);
		return text1;
	}
	
	public WebElement dDFirstSelectedOption(WebElement element) {
		Select select=new Select(element);
		WebElement firstSelectedOption = select.getFirstSelectedOption();
		return firstSelectedOption;
	}
	
	public void dDDeselectByIndex(WebElement element, int index) {
		Select select=new Select(element);
		select.deselectByIndex(index);
	}
	
	public void dDDeselectByValue(WebElement element, String value) {
		Select select=new Select(element);
		select.deselectByValue(value);
	}
	
	
	public void dDDeselectByVisibleText(WebElement element, String text) {
		Select select=new Select(element);
		select.deselectByVisibleText(text);
	}
	
	public void dDDeselectAll(WebElement element) {
		Select select=new Select(element);
		select.deselectAll();
	}
	
	public boolean dDisMultiple(WebElement element) {
		Select select=new Select(element);
		boolean multiple = select.isMultiple();
		return multiple;
	}
	
	//50
	
	public void frameSwtichByIndex(String index) {
		driver.switchTo().frame(index);
	}
	
	public void frameNameOrId(String nameOrId) {
		driver.switchTo().frame(nameOrId);
	}
	
	public void frameElement(WebElement element) {
		driver.switchTo().frame(element);
	}
	
	public void returnToFrame() {
		driver.switchTo().defaultContent();
	}
	
	public void frameReverse() {
		driver.switchTo().parentFrame();   //one by one process
	}
	
	public void parentWindow() {
		String parentWindow = driver.getWindowHandle();
		driver.switchTo().window(parentWindow);
	}

	public void allWindow() {
		String parentWindow = driver.getWindowHandle();
		driver.switchTo().window(parentWindow);
		Set<String> allWindow = driver.getWindowHandles();
		for (String string : allWindow) {
			if (!parentWindow.equals(allWindow)) {
				driver.switchTo().window(string);
			}
		}
	}
	
	
	public int frameCount(WebElement element) {
		List<WebElement> findElements = element.findElements(By.tagName("iframe"));
		int count = findElements.size();
		return count;
	}
	
	public int imgCount(WebElement element) {
		List<WebElement> findElements = element.findElements(By.tagName("img"));
		int count = findElements.size();
		return count;
	}
	
	public int dDownCount(WebElement element) {
		List<WebElement> findElements = element.findElements(By.tagName("select"));
		int count = findElements.size();
		return count;
	}
	//60
	public void thread(int milliSecond ) throws InterruptedException {
		Thread.sleep(milliSecond);
	}
	
	public void waitFluent(String id) {
		Wait wait=new FluentWait(driver).withTimeout(Duration.ofMinutes(1)).pollingEvery(Duration.ofSeconds(5)).ignoring(Exception.class);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
	}
	
	public void waitImplicit() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	public void waitWebElementVisibilityOfElementLocated(String id) {
		WebDriverWait w=new WebDriverWait(driver, 5);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
	}
	
	public void waitWebElementElementToBeClickable(String id) {
		WebDriverWait w=new WebDriverWait(driver, 5);
		w.until(ExpectedConditions.elementToBeClickable(By.id(id)));
	}
	
	public void waitWebElementTextToBePresentInElement(WebElement element, String text) {
		WebDriverWait w=new WebDriverWait(driver, 5);
		w.until(ExpectedConditions.textToBePresentInElement(element, text));
	}
	
	public void threadsleep() throws InterruptedException {
		Thread.sleep(5000);
	}
	
	
	public void scrollUp(WebElement element) {
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].scrollintoview(false)", element);
	}
	
	public void scrollDown(WebElement element) {
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].scrollintoview(true)", element);
	}
	
	public void robot(int keycode) throws AWTException {
		Actions actions=new Actions(driver);
		Robot robot=new Robot();
		robot.keyPress(keycode);
		robot.keyRelease(keycode);
	}
	//70
	
	public void robotTwoKey(int splCode,int keycode) throws AWTException {
		Actions actions=new Actions(driver);
		Robot robot=new Robot();
		robot.keyPress(splCode);
		robot.keyPress(keycode);
		robot.keyRelease(keycode);
		robot.keyRelease(splCode);

	}
	
	
	
	public void excelOverWrite( String sheetName,int rowno,int cellno, String oldData, String newData) throws IOException {
		File file= new File("\\C:\\Users\\Elcot\\eclipse-workspace\\Aru001\\File\\Book1.xlsx");
		FileInputStream stream= new FileInputStream(file);

		Workbook workbook= new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowno);
		Cell cell = row.getCell(cellno);
		if (cell.equals(oldData)) {
			cell.setCellValue(newData);
		}
		FileOutputStream out=new FileOutputStream(file);
		workbook.write(out);
	}
	
	
	public void excelCreateCell( String sheetName,int rowno,int cellno,String data) throws IOException {
		File file= new File("C:\\Users\\Elcot\\eclipse-workspace\\Aru001\\File\\POM.xlsx");
		FileInputStream stream= new FileInputStream(file);

		Workbook workbook= new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowno);
		Cell cell = row.createCell(cellno);
			cell.setCellValue(data);
		FileOutputStream out=new FileOutputStream(file);
		workbook.write(out);
	}
	
	public void excelCreateRow( String sheetName,int rowno,int cellno,String data) throws IOException {
		File file= new File("\\C:\\Users\\Elcot\\eclipse-workspace\\Aru001\\File\\Book1.xlsx");
		FileInputStream stream= new FileInputStream(file);

		Workbook workbook= new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.createRow(rowno);
		Cell cell = row.getCell(cellno);
			cell.setCellValue(data);
		FileOutputStream out=new FileOutputStream(file);
		workbook.write(out);
	}
	
	public void excelCreateRowAndCell( String sheetName,int rowno,int cellno,String data) throws IOException {
		File file= new File("\\C:\\Users\\Elcot\\eclipse-workspace\\Aru001\\File\\Book1.xlsx");
		FileInputStream stream= new FileInputStream(file);

		Workbook workbook= new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.createRow(rowno);
		Cell cell = row.createCell(rowno);
			cell.setCellValue(data);
		FileOutputStream out=new FileOutputStream(file);
		workbook.write(out);
	}
	
	public void excelCreateWorkbook( String sheetName,int rowno,int cellno,String data) throws IOException {
		File file= new File("\\C:\\Users\\Elcot\\eclipse-workspace\\Aru001\\File");
	
		Workbook workbook= new XSSFWorkbook();
		Sheet sheet = workbook.createSheet(sheetName);
		Row row = sheet.createRow(rowno);
		Cell cell = row.createCell(cellno);
		cell.setCellValue(data);
		FileOutputStream out=new FileOutputStream(file);
		workbook.write(out);
	}
	
	//76
}

