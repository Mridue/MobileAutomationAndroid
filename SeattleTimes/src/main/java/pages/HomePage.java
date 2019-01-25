package pages;
import base.MobileAPI;
import extentreport.TestLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
public class HomePage extends MobileAPI {
    @FindBy(className = "android.widget.ImageButton")
    public static WebElement burgerButton;
    @FindBy(xpath = "//android.widget.TextView[@text='MY READING LIST']")
    public static WebElement myreadingListLink;
    @FindBy(xpath = "//android.widget.TextView[@text='LOCAL NEWS']")
    public static WebElement localNewsLink;
    @FindBy(xpath = "//android.widget.TextView[@text='BUSINESS/TECH']")
    public static WebElement businessLink;
    @FindBy(xpath = "//android.widget.TextView[@text='SPORTS']")
    public static WebElement sportsLink;
    @FindBy(xpath = "//android.widget.TextView[@text='NATION & WORLD']")
    public static WebElement nationWorldLink;
    @FindBy(xpath = "//android.widget.TextView[@text='OPINION']")
    public static WebElement opinionLink;
    @FindBy(xpath = "//android.widget.TextView[@text='ENTERTAINMENT']")
    public static WebElement entertainmentLink;
    @FindBy(xpath = "//android.widget.TextView[@text='LIFE']")
    public static WebElement lifeLink;
    @FindBy(xpath = "//android.widget.TextView[@text='PNW MAGAZINE']")
    public static WebElement pnwMagazineLink;
    @FindBy(id = "com.seattletimes.android.SeattleTimesMobileNews:id/design_navigation_view")
    List<WebElement> mainMenu = new ArrayList<>();
    @FindBy(className = "android.support.v7.app.a$c")
    public static WebElement topStories;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.a.c[2]/android.widget.TextView")
    public static WebElement latest;
    @FindBy(xpath = "//android.widget.ImageView[@content-desc='The Seattle Times']")
    public static WebElement title;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.a.c[3]")
    public static WebElement trending;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.a.c[4]/android.widget.TextView")
    public static WebElement education;

    public void getTitle() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String s = title.getText();
        System.out.println(s);
    }
    public void clickOnTopStories() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        topStories.click();
    }
    public void clickOntrending() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        trending.click();
    }
    public void clickOnEducation() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        education.click();
    }
    public void clickOnLatest() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        latest.click();
    }
    public void clickBurgerButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ad.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        burgerButton.click();
    }
    // get list in the Burger button (Menu)
    public void getMenuItems() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<WebElement> items = ad.findElements(By.className("android.widget.ImageButton"));
        for (WebElement item : items) {
            System.out.println("Item: " + item.getText());
            ad.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        }
    }
    //scroll to Myreading List and click using String text
    public void getMyreadingList() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickBurgerButton();
        scrollAndClickByName("MY READING LIST");
    }

    //scroll to Myreading List and click using webelement
    public void getMyreadingList1() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickBurgerButton();
        clickByXpathWebElement(myreadingListLink);
    }
    //scroll to Local News and click
    public void getLocalNews() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickBurgerButton();
        clickByXpathWebElement(localNewsLink);
        System.out.println("Local News clicked");
    }
    //scroll to Business/Tech and click
    public void getBusinessTech() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickBurgerButton();
        clickByXpathWebElement(businessLink);
        System.out.println("Business/Tech clicked");
    }
    //scroll to Sports and click
    public void getSports() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickBurgerButton();
        clickByXpathWebElement(sportsLink);
        System.out.println("Sports clicked");
    }
    //scroll to Nation & World and click
    public void getNationWorld() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickBurgerButton();
        clickByXpathWebElement(nationWorldLink);
        System.out.println("'Nation & World' clicked");
    }
    //scroll to Opinion and click
    public void getOpinion() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickBurgerButton();
        clickByXpathWebElement(opinionLink);
        System.out.println("Opinion clicked");
    }
    //scroll to Entertainment and click
    public void getEntertainment() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickBurgerButton();
        clickByXpathWebElement(entertainmentLink);
        System.out.println("Entertainment clicked");
    }
    //scroll to Life and click
    public void getLife() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickBurgerButton();
        clickByXpathWebElement(lifeLink);
        System.out.println("Life clicked");
    }
    //scroll and click to PNW Magazine and navigate back to home and click again to Opinion link
    public void getPnwMagazine() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickBurgerButton();
        clickByXpathWebElement(pnwMagazineLink);
        ad.navigate().back();
    }
    //scroll to Myreading List and check
    public void scrollMenuList() {
        clickBurgerButton();
        scrollToElement(ad, "MY READING LIST");
        scrollToElement(ad, "BUSINESS/TECH");
        scrollToElement(ad, "ENTERTAINMENT");
        scrollToElement(ad, "PNW MAGAZINE");
        scrollToElement(ad, "LOCAL NEWS");
        scrollToElement(ad, "SPORTS");
        scrollToElement(ad, "LOCAL NEWS");
        scrollToElement(ad, "LIFE");
        scrollToElement(ad, "NATION & WORLD");
        scrollToElement(ad, "OPINION");
        System.out.println("Scroll down of My Reading List clicked");
    }
    public void swipeBurgerMenu(){
        clickBurgerButton();
        swipeUpNDown(ad);
    }
}
