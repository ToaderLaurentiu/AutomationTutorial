package activeWellnessTest;

import org.testng.annotations.Test;
import activeWellnessPages.FitnessPage;
import activeWellnessPages.HomePage;
import activeWellnessPages.SchedulePage;
import activeWellnessPages.SubscriptionsPage;

import static extentUtility.ExtentManager.logEvents;
import static extentUtility.ReportEventType.INFO_STEP;
import static extentUtility.ReportEventType.PASS_STEP;

public class upFoodRun extends BaseTest{

    @Test
    public void proiectFinal() {
        HomePage homePage = new HomePage(driver);
        homePage.isPageLoaded();
        logEvents(PASS_STEP, "Verify if the page is loaded correctly");
        FitnessPage fitnessPage = new FitnessPage(driver);
        fitnessPage.isPageLoaded();
        logEvents(PASS_STEP, "Verify if the page is loaded correctly");
        fitnessPage.actionsOnFitnessPage();
        logEvents(INFO_STEP, "Interact with buttons on Fitness Page");
        SubscriptionsPage subscriptionsPage = new SubscriptionsPage(driver);
        subscriptionsPage.viewAvailableSubscriptions();
        logEvents(INFO_STEP, "Check the subscriptions available on the site");
        SchedulePage schedulePage = new SchedulePage(driver);
        schedulePage.clickOnScheduleButton();
        logEvents(INFO_STEP, "Interact with the Schedule Button");
        schedulePage.isPageLoaded();
        logEvents(PASS_STEP, "Verify if the page is loaded correctly");
        schedulePage.viewClasses();
        logEvents(PASS_STEP, "Check Active Wellness classes");
        schedulePage.seeYogaDetails();
        logEvents(INFO_STEP, "See details about Yoga Class");
        schedulePage.seeSteelTonicDetails();
        logEvents(INFO_STEP, "See details about SteelTonic Class");
        homePage.goToHomePage();
        logEvents(PASS_STEP, "Return on the Home Page");
        homePage.isPageLoaded();
        logEvents(PASS_STEP, "Verify if the page is loaded correctly");
    }
}
