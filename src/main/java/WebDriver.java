/*
Provide Implementation for the diagram below. Then create a test class
in which you need to create Objects of ChromeDriver, FirefoxDrive and
SafariDriver classes and see which methods available to them.

 */
public interface WebDriver {

void open();
void close();
String getTitle();

}
interface TakeScreenshot{
    void getScreenshot();
}
interface RemoteWebDriver extends WebDriver,TakeScreenshot{
    void navigate();

    @Override
    void getScreenshot();

    @Override
    void open();

    @Override
    void close();

    @Override
    String getTitle();
}
class SafariDriver implements RemoteWebDriver{

    @Override
    public void navigate() {

    }

    @Override
    public void getScreenshot() {

    }

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public String getTitle() {
        String title = "www.google.com";
        return title;
    }
}
class FirefoxDriver implements RemoteWebDriver{
    @Override
    public void navigate() {

    }

    @Override
    public void getScreenshot() {

    }

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public String getTitle() {
        String title="www.youtube.com";
        return title;
    }
}
class ChromeDriver implements RemoteWebDriver{
    @Override
    public void navigate() {

    }

    @Override
    public void getScreenshot() {

    }

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public String getTitle() {
        String title="www.facebook.com";
        return title;
    }
}
