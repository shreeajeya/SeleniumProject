package SeleniumProject;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SocialNetworkUser
{
	public static void main(String[] args)throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		
	//get url
		driver.get("http://elearningm1.upskills.in/");
		
		
	//maximize window
		driver.manage().window().maximize();
		
	//login
		driver.findElement(By.id("login")).sendKeys("zxca");
		driver.findElement(By.id("password")).sendKeys("zxccxza");
		driver.findElement(By.id("form-login_submitAuth")).click();
		System.out.println("Logged in sucessfully");
				
				
				
	//Invitations
		driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul[1]/li[5]/a")).click(); // social network
		driver.findElement(By.xpath("//*[@title='Invitations']")).click(); // to click invitations
		driver.findElement(By.xpath("//*[@class='btn btn-success']")).click(); // to find friends
		driver.findElement(By.xpath("//*[@id=\"q\"]")).sendKeys("ajeya"); //user or group name
		driver.findElement(By.xpath("//*[@class='filter-option-inner-inner']")).click(); // to select option
		driver.findElement(By.xpath("//*[@class='text']")).click(); // to select user
		driver.findElement(By.id("search_user_submit")).click(); // click on submit button	 		
	//send invitation
		driver.findElement(By.xpath("//*[@class='btn btn-default btn-sm btn-to-send-invitation']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"content_invitation_id\"]")).sendKeys("Hi, accept my invitation"); //invitation msg
		driver.findElement(By.id("btn-send-invitation")).click();
				System.out.println("Invitation sent sucessfully");
				Thread.sleep(1000);
				
				
				
	//Friends
		driver.findElement(By.xpath("//*[@title='Friends']")).click(); //friends
		driver.findElement(By.xpath("//*[@title='Try and find some friends']")).click(); //find friends
		driver.findElement(By.id("q")).sendKeys("ajeya"); //user or group name
		driver.findElement(By.xpath("//*[@class='filter-option-inner-inner']")).click(); //select option
		driver.findElement(By.xpath("//*[@class='text']")).click(); // user
		driver.findElement(By.id("search_user_submit")).click(); //search
		System.out.println("Searching friends sucessfully");
		Thread.sleep(1000);
			
		
		
	//search
		driver.findElement(By.xpath("//*[@title='Search']")).click(); //search
		driver.findElement(By.id("q")).sendKeys("ajeya"); //user or group name
		driver.findElement(By.xpath("//*[@class='filter-option-inner-inner']")).click(); //select option
		driver.findElement(By.xpath("//*[@class='text']")).click(); // user
		driver.findElement(By.id("search_user_submit")).click(); //search
		System.out.println("Searching users sucessfully");		
		Thread.sleep(1000);	
		
		
		
		
	//personal data
		driver.findElement(By.xpath("//*[@title='Personal data']")).click(); //personal data
		driver.findElement(By.xpath("//*[@id=\"_block\"]/div[1]/a")).click(); //personal data we keep about you
		driver.findElement(By.cssSelector("#personal-data-list-Friends > u")).click(); //friends
		driver.findElement(By.cssSelector("#personal-data-list-Events > u")).click(); //events
		driver.findElement(By.cssSelector("#personal-data-list-GradebookCertificate > u")).click(); //gradebook certificate
		System.out.println("Searching personal data sucessfully");
		Thread.sleep(1000);
		
		
		
	//logout
		driver.findElement(By.cssSelector(".dropdown-toggle")).click();
		driver.findElement(By.id("logout_button")).click();
		System.out.println("Student logged out");
		
					

	}

}
