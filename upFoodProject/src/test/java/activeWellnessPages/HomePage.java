package activeWellnessPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    @FindBy (xpath = "//*[@id=\"page\"]/div[1]/section[1]/div/div[1]/div/div/div/a/img")
    private WebElement homePageButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void goToHomePage(){
        elementsHelper.clickElement(homePageButton);
    }


    @Override
   public void isPageLoaded() {
    }
}
