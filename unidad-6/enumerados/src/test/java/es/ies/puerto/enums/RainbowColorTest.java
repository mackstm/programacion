package es.ies.puerto.enums;

import es.ies.puerto.utilities.TestUtilities;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RainbowColorTest extends TestUtilities {
    RainbowColor rainbowColor;

    @BeforeEach
    public void beforeEach() {
    }

    @Test
    public void rainbowColorRedTest() {
        rainbowColor = RainbowColor.RED;
        Assertions.assertEquals(RainbowColor.RED, rainbowColor, ERR_MSG);
    }

    @Test
    public void rainbowColorYellowTest() {
        rainbowColor = RainbowColor.YELLOW;
        Assertions.assertEquals(RainbowColor.YELLOW, rainbowColor, ERR_MSG);
    }

    @Test
    public void rainbowColorMyColorTest() {
        rainbowColor = RainbowColor.getValueByName("red");
        Assertions.assertEquals(RainbowColor.RED, rainbowColor, ERR_MSG);
    }
}
