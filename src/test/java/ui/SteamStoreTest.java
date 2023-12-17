package ui;

import org.junit.jupiter.api.Test;

public class SteamStoreTest extends BaseWebTest {

    private final String game = "Raft";
    @Test
    public void openSpaceCategoryPage() {
        storePage.openShop();
        storePage.openSpaceCategory();
    }

    @Test
    public void searchGameOnSteam() {
        storePage.openShop()
                .setSearch(game)
                .clickSearch()
                .successSearchGame(game);
    }

    @Test
    public void addGameInBasket() {
        storePage.openShop()
                .setSearch(game)
                .clickSearch()
                .enterGamePage();
        gamePage.addGameInBasket();
        basketPage.checkMassage()
                .checkGameAddInBasket(game)
                .deleteAllGamesInBasket()
                .checkDeleteGameMassage();
    }

}
