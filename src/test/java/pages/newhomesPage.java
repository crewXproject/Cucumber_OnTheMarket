package pages;

import driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class newhomesPage {

    public newhomesPage() {PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath="//*[@id=\"otm-main-nav\"]/div[1]/div/nav/ul/li[2]/div/div/div[1]/ul/li[1]/a/div[2]/span")
    public WebElement propertyForSale;

    @FindBy(xpath = "//*[@id=\"otm-main-nav\"]/div[1]/div/nav/ul/li[5]/a/span")
    public WebElement newhomesmenu;

    @FindBy(xpath = "//*[@id=\"otm-main-nav\"]/div[1]/div/nav/ul/li[5]/div/div/div[1]/ul/li[2]/a/div[2]/span")
    public WebElement findDevelopments;


}
