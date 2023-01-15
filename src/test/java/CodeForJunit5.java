import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

class CodeForJunit5 {

    @Test
    void codeSampleCheckTest() {
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $(".js-wiki-more-pages-link").click();
        $(".wiki-rightbar").shouldHave(text("SoftAssertions"));
        $(".wiki-rightbar").$(byText("SoftAssertions")).click();
        //$("#user-content-3-using-junit5-extend-test-class а").$((byText("5. Using JUnit5 extend test class:")));
        $(".markdown-body").shouldHave(text("3. Using JUnit5 extend test class:"));
    }
}