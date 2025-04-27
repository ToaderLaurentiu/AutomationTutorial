package activeWellnessPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SchedulePage extends BasePage{
    @FindBy (xpath = "//a[@class='elementor-item menu-link' and text()='Orar clase']")
    private WebElement scheduleButton;

    @FindBy (xpath = "//span[@class='elementor-button-text' and  text()='Vezi Clasele']")
    private WebElement checkClassesButton;

    @FindBy (xpath = "//*[@id=\"elementor-tab-title-1851\"]/span/span[1]")
    private WebElement yogaDetails;

    @FindBy (xpath = "//*[@id=\"elementor-tab-title-1851\"]/a")
    private WebElement closeYogaDetails;

    @FindBy (xpath = "//*[@id=\"elementor-tab-title-1641\"]/span/span[1]/i")
    private WebElement steelTonicDetails;

    @FindBy (xpath = "//*[@id=\"elementor-tab-title-1641\"]/span/span[2]/i")
    private WebElement closeSteelTonicDetails;

    public SchedulePage(WebDriver driver) {
        super(driver);
    }

    public void clickOnScheduleButton(){
        elementsHelper.clickElement(scheduleButton);
    }

    public void viewClasses(){
        elementsHelper.clickElement(checkClassesButton);
    }

    public void seeYogaDetails(){
        elementsHelper.threadSleep(1000);
        elementsHelper.clickElement(yogaDetails);
        elementsHelper.threadSleep(2000);
        elementsHelper.clickElement(closeYogaDetails);
    }

    public void seeSteelTonicDetails(){
        elementsHelper.threadSleep(1000);
        elementsHelper.clickElement(steelTonicDetails);
        elementsHelper.threadSleep(2000);
        elementsHelper.clickElement(closeSteelTonicDetails);
    }

    @Override
   public void isPageLoaded() {

    }
}
