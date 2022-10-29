package Project2;

public class Task4 {
    //Provide Implementation for the diagram below. Then create a test class in which you need to create Objects of
    //ChromeDriver, FirefoxDrive and SafariDriver classes and see which methods available to them
}
interface WebDriver{
    void open();
    void close();
    String getTitle();
}
interface RemoteWebDriver extends WebDriver{
    void navigate();
}
interface TakesScreenshot extends RemoteWebDriver{
    void getScreenshot();
}
class ChromeDriver implements RemoteWebDriver{
    String title="Google";
    public void open(){
        System.out.println("Open chrome");
    }
    public void close(){
        System.out.println("close chrome");
    }
    public String getTitle(){
        return title;
    }
    public void navigate(){
        System.out.println("Go to Chrome");
    }
}
class FirefoxDriver implements RemoteWebDriver{
    String title="Amazon";
    public void navigate(){
        System.out.println("Go to Firefox");
    }
    public void open(){
        System.out.println("Open firefox");
    }
    public void close(){
        System.out.println("close firefox");
    }
    public String getTitle(){
        return "title";
    }
}
class SafariDriver implements RemoteWebDriver{
    String title="Facebook";
    public void navigate(){
        System.out.println("Go to Safari");
    }
    public void open(){
        System.out.println("Open safari");
    }
    public void close(){
        System.out.println("close safari");
    }
    public String getTitle(){
        return title;
    }
}

class TestWebDriver{
    public static void main(String[] args) {
        WebDriver[] arr={new ChromeDriver(),new FirefoxDriver(),new SafariDriver()};
        for(WebDriver obj:arr){
            obj.open();
            obj.close();
            System.out.println("Title: "+obj.getTitle());
            // obj.navigate() and obj.getScreenshot() we don't access to them because they are not in WebDriver.
        }
    }
}
