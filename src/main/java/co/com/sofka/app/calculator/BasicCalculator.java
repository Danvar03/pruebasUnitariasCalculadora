package co.com.sofka.app.calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicCalculator {
    private static final Logger logger = LoggerFactory.getLogger(BasicCalculator.class);

    public int suma(int number1, int number2) {
        logger.info( "Summing {} + {}", number1, number2 );
        return number1 + number2;
    }
    public int resta(int number1, int number2) {
        logger.info( "Summing {} - {}", number1, number2 );
        return number1 - number2;
    }

    public Double division(Double number1, Double number2) {

            logger.info( "Division {} / {}", number1, number2 );
            if(number2 == 0){
                throw new RuntimeException("No se puede dividir por cero");
            }
            return number1 / number2;
        }
    public int multiplicacion(int number1, int number2) {
        logger.info( "Summing {} * {}", number1, number2 );
        return number1 * number2;
    }
}
