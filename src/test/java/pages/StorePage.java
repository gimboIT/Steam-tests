package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import ui.localizationtesting.Locale;

import java.util.List;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class StorePage {

    private final SelenideElement
            store = $(byText("МАГАЗИН")),
            categories = $("#genre_tab"),
            searchGames = $("#store_nav_search_term"),
            searchButton = $("#store_search_link").lastChild(),
            spaceCategory = $("#genre_flyout").$(byText("Космос")),
            searchGame = $$(".title").first(),
            languageButton = $("#language_pulldown"),
            languageChoice =  $("#language_dropdown");;

    public StorePage openShop() {
        open("/");
        return this;
    }

    public StorePage openSpaceCategory() {
        categories.hover();
        spaceCategory.click();
        return this;
    }

    public StorePage setSearch(String gameName) {
        searchGames.setValue(gameName);
        return this;
    }

    public StorePage clickSearch() {
        searchButton.click();
        return this;
    }

    public StorePage enterGamePage() {
        searchGame.click();
        return this;
    }

    public StorePage successSearchGame(String gameName) {
        searchGame.shouldHave(Condition.text(gameName));
        return this;
    }

    public StorePage clickLanguageButton() {
        languageButton.click();
        return this;
    }
    public StorePage choiceLanguage(Locale locale){
        languageChoice.$(byText((locale.getDescription()))).click();
        return this;
    }
    public StorePage checkButtons(List<String> buttons) {
        $$(".supernav_container a").filter(visible).shouldHave(texts(buttons));
        return this;
    }
}
