import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
public class OptinalTaskActions {
    @Test
    void successfulActionsOnTheElemets() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").dragAndDropTo($("#column-b"));
        $("#columns div").shouldHave(text("B"));
    }
}
