package co.com.sofka.app;

import co.com.sofka.app.calculator.BasicCalculator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

    private static final Logger logger = LoggerFactory.getLogger( App.class );

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader( System.in ) );

        System.out.println( "Enter number 1: " );
        String textNumber1 = bufferedReader.readLine();

        System.out.println( "Enter number 2: " );
        String textNumber2 = bufferedReader.readLine();

       int number1 = Integer.valueOf( textNumber1 );
       int number2 = Integer.valueOf( textNumber2 );

        BasicCalculator calculator = new BasicCalculator();
        int result = calculator.suma( number1, number2 );

        System.out.println( number1 + " + " + number2 + " = " + result );
    }
}