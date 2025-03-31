import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class StartSelenium {

    WebDriver wd;


    @Test
    public void test(){
        wd = new ChromeDriver();
        //wd.get("https://telranedu.web.app/home"); without history
        wd.navigate().to("https://telranedu.web.app/home");//with history
        wd.navigate().back();
        wd.navigate().forward();
        wd.navigate().refresh();

        wd.close();//only one tab if only one tab & close browser
        wd.quit();//all tabs & close browser
    }


}