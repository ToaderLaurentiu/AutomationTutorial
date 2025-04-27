package activeWellnessPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SubscriptionsPage extends BasePage{
    @FindBy (id = "abonamente-3-luni")
    private WebElement threeMonthsSub;

    @FindBy (id = "abonamente-6-luni")
    private WebElement sixMonthsSub;

    @FindBy (id = "abonamente-12-luni")
    private WebElement oneYearSub;
    public SubscriptionsPage(WebDriver driver) {
        super(driver);
    }

    public void viewAvailableSubscriptions(){
        viewThreeMonthsSub();
        elementsHelper.threadSleep(2000);
        viewSixMonthsSub();
        elementsHelper.threadSleep(2000);
        oneYearSub();
    }

    public void viewThreeMonthsSub(){
        elementsHelper.scrollDownMethod();
        elementsHelper.clickElement(threeMonthsSub);
    }

    public void viewSixMonthsSub(){
        elementsHelper.clickElement(sixMonthsSub);
    }

    public void oneYearSub(){
        elementsHelper.clickElement(oneYearSub);
    }



    @Override
    void isPageLoaded() {

    }
}
