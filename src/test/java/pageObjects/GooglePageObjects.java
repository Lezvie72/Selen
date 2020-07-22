package pageObjects;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.SelenideElement;

public class GooglePageObjects {

  public static SelenideElement
      googleInputField = $(byXpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")),
      openRuTextLink = $(byXpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/a/div")),
      openRuLink = $(byXpath("//cite[normalize-space()='www.open.ru']")),
      usdPayValue = $(byXpath("(//span[contains(@class, 'main-page-exchange__rate')])[1]")),
      usdBuyValue = $(byXpath("(//span[contains(@class, 'main-page-exchange__rate')])[2]")),
      euPayValue = $(byXpath("(//span[contains(@class, 'main-page-exchange__rate')])[3]")),
      euBuyValue = $(byXpath("(//span[contains(@class, 'main-page-exchange__rate')])[4]"));

}
