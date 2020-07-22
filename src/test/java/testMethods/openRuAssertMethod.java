package testMethods;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.MatcherAssert.assertThat;
import static pageObjects.GooglePageObjects.euBuyValue;
import static pageObjects.GooglePageObjects.euPayValue;
import static pageObjects.GooglePageObjects.googleInputField;
import static pageObjects.GooglePageObjects.openRuLink;
import static pageObjects.GooglePageObjects.openRuTextLink;
import static pageObjects.GooglePageObjects.usdBuyValue;
import static pageObjects.GooglePageObjects.usdPayValue;
import static testMethods.BaseMethods.clickOnElement;
import static testMethods.BaseMethods.elementShouldHaveValue;
import static testMethods.BaseMethods.sendKeysToElementAndPressEnter;

public class openRuAssertMethod {



  public static void searchByText() {
    sendKeysToElementAndPressEnter(googleInputField, "Открытие");
  }

  public static void assertText() {
    elementShouldHaveValue(openRuTextLink, "www.open.ru");
  }

  public static void openCurrencyPageAndAssert() {
    clickOnElement(openRuTextLink);
    assertThat(usdBuyValue.innerText(), greaterThan(usdPayValue.innerText()));
    assertThat(euBuyValue.innerText(), greaterThan(euPayValue.innerText()));
  }
}
