package SeleniumProject;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class SocialNetwork {

	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		//get url
		driver.get("http://elearningm1.upskills.in/");
		
		//maximize window
		driver.manage().window().maximize();
		
		//sign up
		driver.findElement(By.xpath("//*[@id=\"login-block\"]/div/ul/li[1]/a")).click();
		
		//register as student
		driver.findElement(By.xpath("//*[@id=\"registration_firstname\"]")).sendKeys("ajeya");
		driver.findElement(By.xpath("//*[@id=\"registration_lastname\"]")).sendKeys("shree");
		driver.findElement(By.xpath("//*[@id=\"registration_email\"]")).sendKeys("ajeya@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("zxca");
		driver.findElement(By.id("pass1")).sendKeys("zxccxza");
		driver.findElement(By.id("pass2")).sendKeys("zxccxza");
		driver.findElement(By.xpath("//*[@id=\"registration_phone\"]")).sendKeys("7349208224");
		//driver.findElement(By.xpath("//*[@id=\"registration\"]/fieldset/div[9]/div[1]/div/button/div/div/div")).sendKeys("English");
		driver.findElement(By.xpath("//*[@id=\"registration_submit\"]")).click();
		System.out.println("Registered sucessfully");
		
		//logout
				driver.findElement(By.cssSelector(".dropdown-toggle")).click();
				driver.findElement(By.id("logout_button")).click();
				System.out.println("Student logged out");		
						
				//login
				driver.findElement(By.id("login")).sendKeys("zxca");
				driver.findElement(By.id("password")).sendKeys("zxccxza");
				driver.findElement(By.id("form-login_submitAuth")).click();
				System.out.println("Logged in sucessfully");
		
		//socialnetwork
		//driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul[1]/li[5]/a")).click();
		//driver.findElement(By.xpath("//*[@id=\"sn-sidebar-collapse\"]/div/ul/li[8]/a")).click();
		/*Actions act = new Actions(driver);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Actions act = null;
		//driver.findElement(By.xpath("//*[@id=\"nav-l1_TmV3Rm9sZGVy\"]")).click();
		act.contextClick(driver.findElement(By.xpath("//span[text()='My files']"))).perform();
		driver.findElement(By.xpath("//span[text()='New folder']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		//driver.quit();*/
		
		//driver.findElement(By.xpath("//*[@id=\"elfinder\"]/div[1]/div[4]/div[2]/span[1]")).click();
		//driver.findElement(By.xpath("//*[@id=\"elfinder\"]/div[16]/div[2]/div/div[4]")).click();
		
	
		//personal data
				
		driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul[1]/li[5]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"sn-sidebar-collapse\"]/div/ul/li[9]/a")).click();
		//driver.findElement(By.xpath("//*[@id=\"cm-content\"]/div/div[2]/div/div[2]/div[2]/div[1]/div[1]")).click();
		//driver.findElement(By.xpath("//*[@id=\"cm-content\"]/div/div[2]/div/div[2]/div[2]/div[1]/div[2]")).sendKeys("Hello Everyone,We respect your privacy!");
		driver.findElement(By.xpath("//*[@id=\"_block\"]/div[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"personal-data-list-Friends\"]/u")).click();
		driver.findElement(By.xpath("//*[@id=\"personal-data-list-Events\"]/u")).click();
		driver.findElement(By.xpath("//*[@id=\"personal-data-list-GradebookCertificate\"]/u")).click();
		
		
		/*
		//Invitations
		driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul[1]/li[5]/a")).click();// social network
		
		driver.findElement(By.xpath("//*[@id=\"sn-sidebar-collapse\"]/div/ul/li[3]/a")).click();// to click invitations
		
		driver.findElement(By.xpath("//*[@id=\"cm-content\"]/div/div[2]/div/div/div[2]/div[2]/div/a")).click();// to find friends
		
		driver.findElement(By.xpath("//*[@id=\"q\"]")).sendKeys("ajeya");//user or group name
		
		driver.findElement(By.xpath("//*[@id=\"search_user\"]/fieldset/div[2]/div[1]/div/button/div/div/div")).click();// to select option
		
		driver.findElement(By.xpath("//*[@id=\"search_user\"]/fieldset/div[2]/div[1]/div/div/div[2]/ul/li[2]/a")).click();// to select user
		
		driver.findElement(By.xpath("//*[@id=\"search_user_submit\"]")).click(); // click on submit button
		
		//driver.findElement(By.xpath("//*[@id=\"user_card_5052\"]/div/div[2]/div/div[2]/div/a[1]")).click();// click on send invitations
		
		//driver.findElement(By.xpath("//*[@id=\"content_invitation_id\"]")).sendKeys("Welcome");//add a personal msg
		
		//driver.findElement(By.xpath("//*[@id=\"btn-send-invitation\"]")).click();//click on send message
		
		//driver.findElement(By.xpath("//*[@id=\"user_card_5049\"]/div/div[2]/div/div[2]/div/a[2]")).click(); // to click send msg
		
		//driver.findElement(By.xpath("//*[@id=\"subject_id\"]")).sendKeys("Grettings");// to enter subject
		
		//driver.findElement(By.xpath("//*[@id=\"content_id\"]")).sendKeys("Congrats, Happy to welcome U");// to write msg
		
		//driver.findElement(By.xpath("//*[@id=\"send_message_link\"]")).click();//click send message
		
		//driver.findElement(By.xpath("//*[@id=\"sn-sidebar-collapse\"]/div/ul/li[3]/a")).click();// to go back to invitations*/

				
	/*//Invitations
		driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul[1]/li[5]/a")).click();// social network
		driver.findElement(By.xpath("//*[@id=\"sn-sidebar-collapse\"]/div/ul/li[3]/a")).click();// to click invitations
		driver.findElement(By.xpath("//*[@id=\"cm-content\"]/div/div[2]/div/div/div[2]/div[2]/div/a")).click();// to find friends
		driver.findElement(By.xpath("//*[@id=\"q\"]")).sendKeys("ajeya");//user or group name
		driver.findElement(By.xpath("//*[@id=\"search_user\"]/fieldset/div[2]/div[1]/div/button/div/div/div")).click();// to select option
		driver.findElement(By.xpath("//*[@id=\"search_user\"]/fieldset/div[2]/div[1]/div/div/div[2]/ul/li[2]/a")).click();// to select user
		driver.findElement(By.xpath("//*[@id=\"search_user_submit\"]")).click(); // click on submit button
	//send invitation
		driver.findElement(By.xpath("//*[@class='btn btn-default btn-sm btn-to-send-invitation']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"content_invitation_id\"]")).sendKeys("Hi, accept my invitation");
		driver.findElement(By.id("btn-send-invitation")).click();
		System.out.println("Invitation sent sucessfully");*/
		
	/*//Friends
		driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul[1]/li[5]/a")).click();//social network
		driver.findElement(By.xpath("//*[@id=\"sn-sidebar-collapse\"]/div/ul/li[5]/a")).click();//friennds
		driver.findElement(By.xpath("//*[@id=\"wallMessages\"]/div[2]/div/a")).click();//find friends
		driver.findElement(By.xpath("//*[@id=\"q\"]")).sendKeys("ajeya");//user or group name
		driver.findElement(By.xpath("//*[@id=\"search_user\"]/fieldset/div[2]/div[1]/div/button/div/div/div")).click();//select option
		driver.findElement(By.xpath("//*[@id=\"search_user\"]/fieldset/div[2]/div[1]/div/div/div[2]/ul/li[2]/a")).click();// user
		driver.findElement(By.xpath("//*[@id=\"search_user_submit\"]")).click();//search
		*/
		
     //search
		driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul[1]/li[5]/a")).click();//social network
		driver.findElement(By.xpath("//*[@id=\"sn-sidebar-collapse\"]/div/ul/li[7]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"q\"]")).sendKeys("ajeya");//user or group name
		driver.findElement(By.xpath("//*[@id=\"search_user\"]/fieldset/div[2]/div[1]/div/button/div/div/div")).click();//select option
		driver.findElement(By.xpath("//*[@id=\"search_user\"]/fieldset/div[2]/div[1]/div/div/div[2]/ul/li[2]/a")).click();// user
		driver.findElement(By.xpath("//*[@id=\"search_user_submit\"]")).click();//search
		
		
		
				
	}
	
}
