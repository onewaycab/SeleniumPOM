package ui_component;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginComponent 
{
	@FindBy(name="userName")
	static WebElement userEditBox;
	@FindBy(name="password")
	static WebElement passwordEditBox;
	@FindBy(name="login")
	static WebElement loginButton;
	@FindBy(xpath="*//[@src='/images/spacer.gif'][1]//following::font")
	static WebElement loginverificationtext;
	
	
	public void login()
	{
		userEditBox.sendKeys("batman");
		passwordEditBox.sendKeys("batman");
		loginButton.click();
	}
	
	
	public boolean verifyLoginfunc()
	{
		String actualText=loginverificationtext.getText();
		String ExpectedText="serviceCalls.getLoginVerificationText()";
		if(actualText.equals(ExpectedText))
		{
			return true;
		}
		else
			return false;
		
	}
	
	

}
