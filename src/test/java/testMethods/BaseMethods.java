package testMethods;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;

import com.codeborne.selenide.SelenideElement;

public class BaseMethods {


    public static void clickOnElement(SelenideElement element) {
        element.shouldBe(visible, enabled).click();
    }

    public static void elementShouldHaveValue(SelenideElement element, String text) {
        element.shouldHave(text(text));
    }


    public static void sendKeysToElementAndPressEnter(SelenideElement element, String text) {
        element.shouldBe(visible, enabled).setValue(text).pressEnter();

    }

    public static void waitElementForVisible(SelenideElement element) {
        element.isDisplayed();
    }
}
