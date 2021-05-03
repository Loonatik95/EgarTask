package task.framework.ui;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
public class BrowserActions {

    public String getText(By by){

     return  $(by).shouldBe(visible).getText();
    }

    public BrowserActions setURl(String url){
        open(url);
        return this;
    }

    public BrowserActions click(By by){
       $(by).shouldBe(enabled).click();
        return this;
    }

    public BrowserActions click(By by, int index){
        $$(by).get(index).shouldBe(enabled).click();
        return this;
    }

    public String getText(By by, int index){
        return $$(by).get(index).shouldBe(visible).getText();
    }

    public BrowserActions type(By by, String value){
        $(by).shouldBe(enabled).setValue(value);
        return this;
    }
}