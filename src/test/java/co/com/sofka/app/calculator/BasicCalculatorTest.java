package co.com.sofka.app.calculator;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class BasicCalculatorTest {
    private final BasicCalculator basicCalculator = new BasicCalculator();

    @Test
    @DisplayName("Testing sum: 1+1=2")
    public void suma() {
        // Arrange
        Long number1 = 1L;
        Long number2 = 1L;
        Long expectedValue = 2L;

        // Act
        Long result = basicCalculator.suma(number1, number2);

        // Assert
        assertEquals(expectedValue, result);

    }

    @Test
    @DisplayName("Testing sum: 1-1=0")
    public void resta() {
        // Arrange
        Long number1 = 1L;
        Long number2 = 1L;
        Long expectedValue = 0L;

        // Act
        Long result = basicCalculator.resta(number1, number2);

        // Assert
        assertEquals(expectedValue, result);

    }
    @Test
    @DisplayName("Testing sum: 1*2=2")
    public void multiplicacion() {
        // Arrange
        Long number1 = 1L;
        Long number2 = 2L;
        Long expectedValue = 2L;

        // Act
        Long result = basicCalculator.multiplicacion(number1, number2);

        // Assert
        assertEquals(expectedValue, result);

    }
    @Test
    @DisplayName("Testing sum: 7%3=2.3")
    public void division() {
        // Arrange
        Double number1 = Double.valueOf(7L);
        Double number2 = Double.valueOf(3l);
        Double expectedValue= Double.valueOf(2.3333333333333335);

        // Act
       Double result = basicCalculator.division(number1, number2);

        // Assert
        assertEquals(expectedValue, result);

    }
    @DisplayName("Testing several sums")
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,    1,   1",
            "1,    2,   3",
            "49,  51, 100",
            "1,  100, 101"
    })
    public void severalSums(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.suma(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }
}
