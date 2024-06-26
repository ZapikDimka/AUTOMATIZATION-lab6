package org.ZapikDimka;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class JunitTest {

    @Test
    void concat() {
        // Виконуємо тести лише якщо операційна система Windows
        Assumptions.assumeTrue(System.getProperty("os.name").toLowerCase().contains("windows"));
        assertEquals("Morning Sunshine", Func.concat("Morning", "Sunshine"));
        assertEquals("Bright Day", Func.concat("Bright", "Day"));
        assertEquals("Starry Night", Func.concat("Starry", "Night"));
        assertEquals("Moonlit Sky", Func.concat("Moonlit", "Sky"));
    }

    @ParameterizedTest(name = "{0}.concat({1}) == {2}")
    @CsvSource({
            "'Morning',    Sunshine,   Morning Sunshine",
            "Bright ,  Day, Bright Day",
            "Starry ,  Night, Starry Night",
            "Moonlit ,  Sky, Moonlit Sky"
    })
    void concat(String a, String b, String expected) {
        assertEquals(expected, Func.concat(a, b));
    }
}
