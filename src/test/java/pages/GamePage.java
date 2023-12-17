package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class GamePage {
    SelenideElement addGameInBasketButton = $(".btn_addtocart");

    public GamePage addGameInBasket() {
        addGameInBasketButton.click();
        return this;
    }
}
