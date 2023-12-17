package ui.localizationtesting;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import ui.BaseWebTest;

import java.util.List;
import java.util.stream.Stream;

public class LocalizationTesting extends BaseWebTest {

    public static Stream<Arguments> navButtons() {
        return Stream.of(
                Arguments.of(Locale.EN, List.of("STORE", "COMMUNITY", "ABOUT", "SUPPORT")),
                Arguments.of(Locale.RU, List.of("МАГАЗИН", "СООБЩЕСТВО", "ИНФОРМАЦИЯ", "ПОДДЕРЖКА"))
        );
    }

    @MethodSource
    @ParameterizedTest(name = "Для локализации {0} отображаются {1}")
    public void navButtons(Locale locale, List<String> buttons) {
        storePage.openShop()
                .clickLanguageButton()
                .choiceLanguage(locale)
                .checkButtons(buttons);
    }
}
