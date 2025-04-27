package activeWellnessPages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FitnessPage extends BasePage {
    @FindBy(xpath = "//*[@id=\"post-40\"]/div/div/section/div/div[1]/div/div[4]/div/div/a/span")
    private WebElement goToFitnessArea;

    @FindBy (xpath = "//i[@class='scroll fa fa-angle-down']")
    private WebElement scrollDownArrow;

    @FindBy (xpath = "//*[@id=\"post-121\"]/div/div/section[4]/div/div/div/div/div/a/div[2]/div[2]")
    private WebElement showMoreDetails;

    @FindBy (xpath = "//*[@id=\"post-318\"]/div/div/section[1]/div/div[1]/div/section[1]/div/div/div/div[4]/div/div/a/span/span")
    private WebElement subscriptions;

    public FitnessPage(WebDriver driver) {
        super(driver);
    }

    public void actionsOnFitnessPage(){
        selectFitnessArea();
//        useTheScrollDownArrow();
        clickOnShowMoreDetails();
        clickOnSeeSubscriptions();
    }

    public void selectFitnessArea(){
        elementsHelper.clickElement(goToFitnessArea);
    }

    public void useTheScrollDownArrow(){
        elementsHelper.clickElement(scrollDownArrow);
    }

    public void clickOnShowMoreDetails(){
        elementsHelper.threadSleep(200);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1500);");
        elementsHelper.clickElement(showMoreDetails);
    }

    public void clickOnSeeSubscriptions(){
        elementsHelper.clickElement(subscriptions);
    }

    @Override
  public void isPageLoaded() {
    }
}
