package co.com.sofka.app.calculator;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class BasicCalculatorTest {
    private final BasicCalculator basicCalculator = new BasicCalculator();

    @Test
    @DisplayName("Testing sum: 1+1=2")
    public void suma() {
        // Arrange
        int number1 = Integer.valueOf(1);
        int number2 = Integer.valueOf(1);
        int expectedValue = Integer.valueOf(2);

        // Act
        int result = basicCalculator.suma(number1, number2);

        // Assert
        assertEquals(expectedValue, result);

    }

    @Test
    @DisplayName("Testing sum: 1-1=0")
    public void resta() {
        // Arrange
        int number1 = Integer.valueOf(1);
        int number2 = Integer.valueOf(1);
        int expectedValue = Integer.valueOf(0);

        // Act
        int result = basicCalculator.resta(number1, number2);

        // Assert
        assertEquals(expectedValue, result);

    }

    @Test
    @DisplayName("Testing sum: 1*2=2")
    public void multiplicacion() {
        // Arrange
        int number1 = Integer.valueOf(1);
        int number2 = Integer.valueOf(2);
        int expectedValue = Integer.valueOf(2);

        // Act
        int result = basicCalculator.multiplicacion(number1, number2);

        // Assert
        assertEquals(expectedValue, result);

    }

    @Test
    @DisplayName("Testing sum: 7%3=2.3")
    public void division() {
        // Arrange
        Double number1 = Double.valueOf(7L);
        Double number2 = Double.valueOf(3l);
        Double expectedValue = Double.valueOf(2.3333333333333335);

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
    public void severaluma(int number1, int number2, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.suma(number1, number2),
                () -> number1 + " + " + number2 + " should equal " + expectedResult);
    }

    //Caso  Test Resta
    @DisplayName("Testing Varios Casos Resta")
    @ParameterizedTest(name = "{0} - {1} = {2}")
    @CsvSource({
            "1,   0,   1",
            "1,   2,  -1",
            "51,  49, 2",
            "100,  1, 99"
    })
    public void severalresta(int number1, int number2, int expectedResult) {
        assertEquals(expectedResult, basicCalculator.resta(number1, number2),
                () -> number1 + " + " + number2 + " should equal " + expectedResult);
    }

    //Test Multipicacion
    @DisplayName("Testing Varios Casos Multiplicacion")
    @ParameterizedTest(name = "{0} *  {1} = {2}")
    @CsvSource({
            "0,   1,   0",
            "1,   2,   2",
            "49,  51, 2499",
            "1,  100, 100"
    })
    public void severalMultiplicacion(int number1, int number2, int expectedResult) {
        assertEquals(expectedResult, basicCalculator.multiplicacion(number1, number2),
                () -> number1 + " + " + number2 + " should equal " + expectedResult);
    }


    //Test Divion
    @DisplayName("Testing Varios Casos Division")
    @ParameterizedTest(name = "{0} / {1} = {2}")
    @CsvSource({
            "0,  1,  0",
            "4,  2,  2",
            "20, 8, 2.5",
            "10,  2, 5"
    })
    void severalDiv(Double number1, Double number2, Double expectedResult) {
        double result = basicCalculator.division(number1, number2);
        Assertions.assertEquals(expectedResult, result);
    }

    //validacion divion por cero
    @DisplayName("Testing Caso validacion por cero ")
    @ParameterizedTest(name = "{0} /{1}")
    @CsvSource({"4,0"})
    void severalDiv(Double first, Double second) {
        var response = assertThrows(RuntimeException.class, () -> {
            Double result = basicCalculator.division(first, second);
        });
        Assertions.assertEquals("No se puede dividir por cero", response.getMessage());
    }
}




