package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class AuthorizationPage {

    public AuthorizationPage openSteam() {
        step("Заходим на сайт", () -> {
            open("/");
        });

        return this;
    }

    private final SelenideElement
            in = $(".global_action_link"),
            logins = $(".newlogindialog_TextInput_2eKVn"),
            passwords = $$(".newlogindialog_TextInput_2eKVn").last(),
            signIn = $(".newlogindialog_SubmitButton_2QgFE"),
            account = $("#account_pulldown"),
            logOut = $("a[href='javascript:Logout();']");

    public AuthorizationPage openAuthorization(String login, String password) {

        step("Нажимаем на кнопку войти", () -> {
            in.click();
        });
        step("Вводим логин", () -> {
            logins.setValue(login);
        });
        step("Вводим пароль", () -> {
            passwords.setValue(password);
        });
        step("Нажимаем на копку для авторизации", () -> {
            signIn.click();
        });

        return this;
    }

    public AuthorizationPage logOut() {
        step("Нажимаем на сой профиль", () -> {
            account.click();
        });
        step("Нажимаем на копку выхода из профиля", () -> {
            logOut.click();
        });

        return this;
    }

}
