package task.framework.steps;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.Before;

import static com.codeborne.selenide.Selenide.open;

public class HookCucumber {
    @Before
    public void openBrowser(){
        Configuration.startMaximized = true;
        open("https://www.777555.by/");
    }
}
