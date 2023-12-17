package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BasketPage {

    SelenideElement
            statusMessage = $(".cart_status_message"),
            deleteGameButton = $(".remove_link");
    ElementsCollection allGamesInBasket = $$(".cart_item_list");

    public BasketPage checkMassage() {
        statusMessage.shouldHave(Condition.text("Ваш товар был добавлен!"));
        return this;
    }

    public BasketPage checkGameAddInBasket(String gameName) {
        assertEquals(1, allGamesInBasket.filterBy(Condition.text(gameName)).size());
        return this;
    }

    public BasketPage deleteAllGamesInBasket() {
        deleteGameButton.click();
        return this;
    }

    public BasketPage checkDeleteGameMassage() {
        statusMessage.shouldHave(Condition.text("Ваш товар был удалён!"));
        return this;
    }

}
