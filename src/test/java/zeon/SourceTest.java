package zeon;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeClass;

import static com.codeborne.selenide.Selenide.open;

public class SourceTest {
    @BeforeClass
    public void openBrowser() {
        Configuration.startMaximized = true;
        open("https://www.777555.by/");

    }
}

