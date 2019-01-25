package testcases;
import extentreport.TestLogger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
public class TestHomePage extends HomePage {
    HomePage objHomePage;
    @BeforeMethod
    public void initialize(){
        objHomePage = PageFactory.initElements(ad, HomePage.class);
    }
    @Test
    public void test1BurgerButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickBurgerButton();
    }
    @Test
    public void testscrollMenuList(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickBurgerButton();
        getMenuItems();
        System.out.println("scrollMenuList passed");
    }
    @Test
    public void testscrollToMyReadingList() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getMyreadingList1();
        System.out.println("scrollMenuList for Myreading passed");
    }
    @Test
    public void testscrollToLocal(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getLocalNews();
        System.out.println("scrollMenuList for LocalNews passed");
    }
    @Test
    public void testscrollToBusiness(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getBusinessTech();
        System.out.println("scrollMenuList for Business/Tech passed");
    }
    @Test
    public void testscrollToSports(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getBusinessTech();
        System.out.println("scrollMenuList for Sports passed");
    }
    //scroll and click to PNW Magazine and navigate back to home and click again to Opinion link
    @Test
    public void testscrollPNWMagazine(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getPnwMagazine();
        System.out.println("scrollMenuList for PNW Magazine passed");
    }
    @Test
    public void testGetSports() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSports();
    }
    @Test
    public void testClickOnTopStories(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnTopStories();
    }
    @Test
    public void testGetTitle(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getTitle();
        clickOnLatest();
    }
    @Test
    public void testGetNationWorld() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getNationWorld();
    }
    @Test
    public void testGetOpinion() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getOpinion();
    }
    @Test
    public void testGetEntertainment() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getEntertainment();
    }
    @Test
    public void testGetLife() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getLife();
    }
    @Test
    public void testScrollMenuList() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        scrollMenuList();
    }
    @Test
    public void testClickOntrending() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOntrending();
    }
    @Test
    public void testClickOnEducation() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnEducation();
    }
    @Test
    public void testTapOnBurgerMenu(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        tapOn(ad,"//android.widget.TextView[@text='MY READING LIST']");
    }
    @Test
    public void testTapOnTopStories(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        tapOn(ad,"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.a.c[2]/android.widget.TextView");
    }
    @Test
    public void testTapOnLatest(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        tapOn(ad,"//android.widget.TextView[@text='MY READING LIST']");
    }
    @Test
    public void testTapOnTrending(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        tapOn(ad,"//android.widget.TextView[@text='MY READING LIST']");
    }

    @Test
    public void testBurgerMenuSwipeUpnDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        swipeBurgerMenu();
    }
    @Test
    public void testHomePageSwipeUpnDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        swipeUpNDown(ad);
    }
    @Test
    public void testscrollToGetNews(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getLocalNews();
    }
    @Test
    public void testscrollToGetBusinessNews(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getBusinessTech();
    }
}
