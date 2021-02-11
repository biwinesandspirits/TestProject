package testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tests {
    @BeforeClass
    public static void bclass() {
        System.out.println("Before Class");
    }

    @AfterClass
    public static void aclass() {
        System.out.println("Before Class");
    }


    @AfterEach
    public void after() {
        System.out.println("This is after Annotation");
    }


    @Test
    public void display() {
        System.out.println("This is Display Method");

        WebDriver driver = null;
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("enable-automation");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-infobars");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-browser-side-navigation");
        options.addArguments("--disable-gpu");
        driver = new ChromeDriver(options);

        driver.get("https://uat.bordeauxindex.com/fine-wine/red-bordeaux/margaux/palmer-2016");
        System.out.println(driver.getTitle());
        assertEquals(driver.getTitle(), "2016 Palmer");
        driver.close();

    }


    @Test
    @Ignore
    public void test2() {
        System.out.println("This is test 2");

    }


    @Test
    public void test3() {
        System.out.println("This is test 3");

        WebDriver driver = null;
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("enable-automation");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-infobars");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-browser-side-navigation");
        options.addArguments("--disable-gpu");
        driver = new ChromeDriver(options);

        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        assertEquals(driver.getTitle(), "Google");
        driver.close();
    }


    @BeforeEach
    public void testing() {
        System.out.println("This is before Annotation");
    }

}
