package ui;

import io.qameta.allure.Feature;
import io.qameta.allure.Features;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
@Feature("Автотесты для авторизации UI")
public class SteamAuthorizationTest extends BaseWebTest {

    private String login = "gimboy_test";
    private String password = "test123*";
    @DisplayName("Тест на успешную авторизацию")
    @Story("Авторизация на сайте")
    @Test
    public void authorization() {
        authorizationPage.openSteam()
                .openAuthorization(login,password)
                .logOut();
    }
}
