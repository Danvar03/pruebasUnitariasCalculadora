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
        Double number1 = Double.valueOf(1L);
        Double number2 = Double.valueOf(1L);
        Double expectedValue = Double.valueOf(0);

        // Act
        Double result = basicCalculator.resta(number1, number2);

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
    @DisplayName("Testing Varios Casos Suma")
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,    1,   1",
            "1,    2,   3",
            "49,  51, 100",
            "1,  100, 101"
    })
    public void severaluma(Long number1, Long number2, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.suma(number1, number2),
                () -> number1 + " + " + number2 + " should equal " + expectedResult);
    }

    //Caso Resta
    @DisplayName("Testing Varios Casos Resta")
    @ParameterizedTest(name = "{0} - {1} = {2}")
    @CsvSource({
            "1,   0,   1",
            "1,   2,  -1",
            "51,  49, 2",
            "100,  1, 99"
    })
    public void severalresta(Double number1, Double number2, Double expectedResult) {
        assertEquals(expectedResult, basicCalculator.resta(number1, number2),
                () -> number1 + " + " + number2 + " should equal " + expectedResult);
    }


}

