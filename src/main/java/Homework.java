import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class Homework {

    WebDriver wd;

    @BeforeClass
    public void setUp() {
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/login");
    }


    @Test
    public void classWork2(){
        WebElement el = wd.findElement(By.cssSelector("[name = 'login']"));
        String text = el.getText();//get from innerText
        System.out.println(text);


        WebElement form = wd.findElement(By.xpath("//form"));
        String textForm = form.getText();
        System.out.println("******************");
        System.out.println(textForm);

        WebElement body = wd.findElement(By.tagName("body"));
        String textAll = body.getText();
        System.out.println("******************");
        System.out.println(textAll);

        WebElement br = wd.findElement(By.tagName("br"));
        System.out.println("text br--> " + br.getText());

    }



    @Test
    public void classWork(){
        //parent
        WebElement el = wd.findElement(By.xpath("//h1/parent::*"));
        WebElement el1 = wd.findElement(By.xpath("//h1/parent::div"));
        WebElement el2 = wd.findElement(By.xpath("//h1/.."));

        //ancestor
        WebElement el3 = wd.findElement(By.xpath("//h1/ancestor::*"));//all
        WebElement el4 = wd.findElement(By.xpath("//h1/ancestor::div"));//two options
        WebElement el5 = wd.findElement(By.xpath("//h1/ancestor::div[2]"));//one option

        //ancestor - or - self
        WebElement el6 = wd.findElement(By.xpath("//h1/ancestor-or-self::*"));
        List<WebElement> list = wd.findElements(By.xpath("//h1/ancestor-or-self::*"));

        //following-sibling
        List<WebElement> list1 = wd.findElements(By.xpath("//h1/following-sibling::a"));

        //preceding-sibling
        WebElement h1 = wd.findElement(By.xpath("//a[last()]/preceding-sibling::h1"));
        List<WebElement> list_a = wd.findElements(By.xpath("//a[3]/preceding-sibling::a"));
    }




    @Test
    public void cssLocators() {
        //by tag name

        WebElement body = wd.findElement(By.tagName("body"));
        WebElement body1 = wd.findElement(By.cssSelector("body"));
        WebElement body2 = wd.findElement(By.xpath("//body"));

        WebElement div = wd.findElement(By.tagName("div"));
        WebElement div1 = wd.findElement(By.cssSelector("div"));
        WebElement div2 = wd.findElement(By.xpath("//div"));


        WebElement h1 = wd.findElement(By.tagName("h1"));
        WebElement h1_1 = wd.findElement(By.cssSelector("h1"));
        WebElement h1_2 = wd.findElement(By.xpath("//h1"));

        List<WebElement> a = wd.findElements(By.tagName("a"));
        List<WebElement> a1 = wd.findElements(By.cssSelector("a"));
        WebElement a2 = wd.findElement(By.xpath("//a"));

        //by class
        WebElement el5 = wd.findElement(By.className("container"));
        WebElement el6 = wd.findElement(By.cssSelector(".container"));
        WebElement el = wd.findElement(By.xpath("//*[@class='container']"));

        WebElement el7 = wd.findElement(By.className("login_login__3EHKB"));
        WebElement el8 = wd.findElement(By.cssSelector(".login_login__3EHKB"));
        WebElement el9 = wd.findElement(By.xpath("//*[@class = 'login_login__3EHKB']"));

        //by id
        WebElement el10 = wd.findElement(By.id("root"));
        WebElement el11 = wd.findElement(By.cssSelector("#root"));
        WebElement el1 = wd.findElement(By.xpath("//*[@id = 'root']"));

        //by attribute
        WebElement el12 = wd.findElement(By.cssSelector("[placeholder = 'Password']"));
        WebElement el2 = wd.findElement(By.xpath("//input[@placeholder='Password']"));

        //by attribute --> start & end & contains

        //start
        WebElement el13 = wd.findElement(By.cssSelector("[placeholder ^= 'Pa']"));
        WebElement el3 = wd.findElement(By.xpath("//input[starts-with(@placeholder,'Pa')]"));
        WebElement el17 = wd.findElement(By.xpath("//input[contains(@placeholder,'Pa')]"));

        //end
        WebElement el14 = wd.findElement(By.cssSelector("[placeholder $= 'rd']"));
        WebElement el16 = wd.findElement(By.xpath("//input[contains(@placeholder, 'rd')]"));

        //contains
        WebElement el15 = wd.findElement(By.cssSelector("[placeholder *= 'ss']"));
        WebElement el4 = wd.findElement(By.xpath("//input[contains(@placeholder,'ss')]"));

        WebElement a3 =wd.findElement(By.xpath("//a[3]"));


    }
}