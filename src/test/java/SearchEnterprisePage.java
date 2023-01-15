import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class SearchEnterprisePage {
    @Test
    void successfulSearch() {
        open("https://github.com/");
        $(".header-menu-wrapper").$(byText("Solutions")).hover();
        $$(".HeaderMenu-dropdown").findBy(visible).$("a")
                .shouldHave(text("Enterprise")).click();
        $(".enterprise-hero h1").shouldHave(text("Build like the best"));
    }
}