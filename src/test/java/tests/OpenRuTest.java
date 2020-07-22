package tests;

import static com.codeborne.selenide.Selenide.open;
import static testMethods.openRuAssertMethod.assertText;
import static testMethods.openRuAssertMethod.openCurrencyPageAndAssert;
import static testMethods.openRuAssertMethod.searchByText;

import org.junit.Before;
import org.junit.Test;

public class OpenRuTest {

  @Before
  public void start() {
    open("https://www.google.com");
  }

  @Test
  public void openAndSearch() {
    searchByText();
    assertText();
    openCurrencyPageAndAssert();
  }
}
