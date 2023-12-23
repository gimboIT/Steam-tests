package ui;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
@Feature("Автотесты для авторизации UI")
public class SteamAuthorizationTest extends BaseWebTest {

    private String login = "gimboy_test";
    private String password = "test123*";

    @Test
    @DisplayName("Тест на успешную авторизацию")
    @Story("Авторизация на сайте")
    @Owner("mustafintr")
    @Severity(SeverityLevel.BLOCKER)
    public void authorization() {
        authorizationPage.openSteam()
                .openAuthorization(login,password)
                .logOut();
        WebSteps webSteps = new WebSteps();
        webSteps.screen();
    }
}
