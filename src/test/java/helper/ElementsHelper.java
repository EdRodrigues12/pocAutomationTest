package helper;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

import static configuration.DriverFactory.getDriver;

public class ElementsHelper {

    public static WebElement waitForElementToLoad(WebElement element, int seconds){

        FluentWait wait = new FluentWait(getDriver())
                .withTimeout(Duration.ofSeconds(seconds))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.elementToBeClickable(element));

        return element;
    }
}
