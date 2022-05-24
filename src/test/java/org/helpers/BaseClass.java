package org.helpers;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

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
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	// driver ref is a local variable work within the method, to access globally
	// declare it outside all method, but inside the class
//Method decl as static, to reduce obj creation. so driver also changed to static
	// Access the driver to another pkg, changed it as public

	public static WebDriver driver;
	public static Robot r;
	public static Actions a;
	public static Alert al;
	public static JavascriptExecutor js;
	public static Select s;

	public static void openChromeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void maxWindow() {
		driver.manage().window().maximize();
	}

	public static String toFetchTitle() {
		String title = driver.getTitle();
		System.out.println(title);
		return title;

	}

	public static String toFetchUrl() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
		return url;
	}

	public static void closeBrowser() {
		driver.quit();

	}

	public static void toRefresh() {

		driver.navigate().refresh();

	}

	public static void toHold(int time) throws InterruptedException {

		Thread.sleep(time);
	}

	public static void launchUrl(String pgUrl) {
		driver.get(pgUrl);
	}

	public static void fillTextBox(WebElement element, String textvalue) {
		element.sendKeys(textvalue);

	}

	public static void toClick(WebElement ref) {
		ref.click();
	}

	public static void toselectall() throws AWTException {

		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_A);

	}

	public static void cut() throws AWTException {

		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_X);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_X);

	}

	public static void copy() throws AWTException {

		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);

	}

	public static void paste() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);

	}

	public static void tab() throws AWTException {
		r = new Robot();
		for (int i = 0; i < 2; i++) {
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);

		}

	}

	public static void enter() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

	public static void down() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

	}

	public static void rightclick(WebElement element) {

		a = new Actions(driver);
		a.contextClick(element).perform();

	}

	public static void doubleclick(WebElement ele) {
		a = new Actions(driver);
		a.doubleClick(ele).perform();

	}

	public static void movetoele(WebElement ele) {
		a = new Actions(driver);
		a.moveToElement(ele).perform();

	}

	public static void totakeSnap(String picname) throws IOException {
		TakesScreenshot tk = (TakesScreenshot) driver;
		File s = tk.getScreenshotAs(OutputType.FILE);
		File d = new File("C:\\Users\\Krishna\\eclipse-workspace(1)\\Mavenframe\\Screenshots\\" + picname + ".png");
		FileUtils.copyFile(s, d);
	}

	public static void acceptalert() {
		al = driver.switchTo().alert();
		al.accept();

	}

	public static void dismissalert() {
		al = driver.switchTo().alert();
		al.dismiss();
	}

	public static void settextalert(String m) {
		al = driver.switchTo().alert();
		al.sendKeys(m);
	}

	public static void getalerttext() {
		al = driver.switchTo().alert();
		al.getText();
	}

	public static void numframes(int f) {

		driver.switchTo().frame(f);
	}

	public static void nameframes(String f) {

		driver.switchTo().frame(f);
	}

	public static void webframes(WebElement f) {

		driver.switchTo().frame(f);
	}

	public static void parenframes() {

		driver.switchTo().parentFrame();
	}

	public static void mainframes() {

		driver.switchTo().defaultContent();
	}

	public static void sendvaluesjs(String content, WebElement e) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value', " + content + ")", e);
	}

	public static void jsclick(WebElement e) {
		js.executeScript("arguments[0].click()", e);
	}

	public static void gettextjs(String values, WebElement e) {
		js.executeScript("return arguments[0].getAttribute('" + values + "')", e);

	}

	public static void scrolldown(WebElement e) {
		js.executeScript("arguments[0].ScrollIntoView(true)", e);
	}

	public static void scrollup(WebElement e) {
		js.executeScript("arguments[0].ScrollIntoView(false)", e);
	}

	public static void getwindowid() {
		driver.getWindowHandle();

	}

	public static void getallwindowid() {
		driver.getWindowHandles();

	}

	public static void getintowindow(int childwind) {
		Set<String> allwind = driver.getWindowHandles();
		List<String> l = new ArrayList<String>(allwind);
		driver.switchTo().window(l.get(childwind));
	}

	public static void selectindex(WebElement e, int index) {
		s = new Select(e);
		s.selectByIndex(index);
	}

	public static void selectvalue(WebElement e, String value) {
		s = new Select(e);
		s.selectByValue(value);
	}

	public static void selectvisibletext(WebElement e, String text) {
		s = new Select(e);
		s.selectByVisibleText(text);
	}

	public static void deselectindex(WebElement e, int index) {
		s = new Select(e);
		s.deselectByIndex(index);
	}

	public static void deselectvalue(WebElement e, String value) {
		s = new Select(e);
		s.deselectByValue(value);
	}

	public static void deselectvisibletext(WebElement e, String text) {
		s = new Select(e);
		s.deselectByVisibleText(text);
	}

	public static void deselectall(WebElement e) {
		s = new Select(e);
		s.deselectAll();
	}

	public static void multipleselect(WebElement e) {
		s = new Select(e);
		if (s.isMultiple()) {
			System.out.println("Multiple options are there");
		} else {
			System.out.println("Single options only there");
		}

	}

	public static void tofetchAll(WebElement e) {
		s = new Select(e);
		System.out.println("All option are:" + s.getOptions());
	}

	public static void firstselect(WebElement e) {
		s = new Select(e);
		System.out.println("First selected option are:" + s.getFirstSelectedOption());
	}

	public static void allselect(WebElement e) {
		s = new Select(e);
		System.out.println("All selected option are:" + s.getAllSelectedOptions());
	}

	public static String readFromExcel(String fileName, String sheetName, int rowNo, int cellNo) throws IOException {

		File f = new File("C:\\Users\\Krishna\\eclipse-workspace(1)\\Mavenframe\\External file\\" + fileName + ".xlsx");
		FileInputStream fin = new FileInputStream(f);

		Workbook b = new XSSFWorkbook(fin);

		Sheet sh = b.getSheet(sheetName);
		Row r = sh.getRow(rowNo);
		Cell c = r.getCell(cellNo);

		String input;

		int type = c.getCellType();
		if (type == 1) {
			input = c.getStringCellValue();
		}

		else if (DateUtil.isCellDateFormatted(c)) {

			Date d = c.getDateCellValue();
			System.out.println(d);
			SimpleDateFormat sim = new SimpleDateFormat("dd/MM/yyyy");
			input = sim.format(d);
			System.out.println(input);
		}

		else {
			double dl = c.getNumericCellValue();
			System.out.println(dl);

			long l = (long) dl;
			System.out.println(l);

			input = String.valueOf(l);
			System.out.println(input);

		}

		return input;
	}

	public static void createNewfileandwrite(String filename, String sname, int rnum, int cnum, String value)
			throws IOException {
		File f = new File("C:\\Users\\Krishna\\eclipse-workspace(1)\\Mavenframe\\External file\\" + filename + ".xlsx");
		Workbook book = new XSSFWorkbook();
		Sheet sh = book.createSheet(sname);
		Row r = sh.createRow(rnum);
		Cell c = r.createCell(cnum);
		c.setCellValue(value);

		FileOutputStream fo = new FileOutputStream(f);
		book.write(fo);
		System.out.println("Done");
	}

	
	public static void createCellinrow(String filename, String sname, int rnum,int cnum,String value) throws IOException {
		File f = new File("C:\\Users\\Krishna\\eclipse-workspace(1)\\Mavenframe\\External file\\"+filename+".xlsx");
		FileInputStream fin=new FileInputStream(f);
		Workbook b=new XSSFWorkbook(fin);
		Sheet sh = b.getSheet(sname);
				Row r = sh.getRow(rnum);
		r.createCell(cnum).setCellValue(value);
				FileOutputStream fo=new FileOutputStream(f);
				b.write(fo);
				
	}
	
	public static void createRowandwrite(String filename, String sname, int rnum,int cnum,String value) throws IOException {
		File f = new File("C:\\Users\\Krishna\\eclipse-workspace(1)\\Mavenframe\\External file\\"+filename+".xlsx");
		FileInputStream fin=new FileInputStream(f);
		Workbook b=new XSSFWorkbook(fin);
		Sheet sh = b.getSheet(sname);
				Row r = sh.createRow(rnum);
		r.createCell(cnum).setCellValue(value);
				b.write(new FileOutputStream(f));

	}
					
	
	public static void writeinExistfile(String filename, String sname, int rnum,int cnum,String value) throws IOException {
		File f = new File("C:\\Users\\Krishna\\eclipse-workspace(1)\\Mavenframe\\External file\\"+filename+".xlsx");
		FileInputStream fin=new FileInputStream(f);
		Workbook b=new XSSFWorkbook(fin);
		Sheet sh = b.createSheet(sname);
				Row r = sh.createRow(rnum);
		r.createCell(cnum).setCellValue(value);
				b.write(new FileOutputStream(f));

	}
	
	
	
	public static String getattribvalue(WebElement e, String name) {

		String s = e.getAttribute(name);
		return s;
	}
	
	public void implicitwait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
	
	public void getdateandtime() {
		Date d=new Date();
		System.out.println(d);

	}
	
	
	
	
	
	
	
	
}
