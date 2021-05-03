package zeon;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class SourceTest {
    @BeforeClass
    public void openBrowser() {
        Configuration.startMaximized = true;
        open("https://www.777555.by/");

    }
}

