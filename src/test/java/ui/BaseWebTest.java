package ui;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import pages.AuthorizationPage;
import pages.BasketPage;
import pages.GamePage;
import pages.StorePage;

import static com.codeborne.selenide.Selenide.open;

public class BaseWebTest {

    public AuthorizationPage authorizationPage = new AuthorizationPage();
    public StorePage storePage = new StorePage();
    public GamePage gamePage = new GamePage();
    public BasketPage basketPage = new BasketPage();

    @BeforeAll
    public static void config() {
        Configuration.baseUrl = "https://store.steampowered.com/";
        SelenideLogger.addListener("Allure",new AllureSelenide());
    }
}
