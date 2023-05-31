import org.example.TriangleCalculator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.*;


public class TestTriangle {

    private static TriangleCalculator triangleCalculator;

    @BeforeAll
    public static void setup() {
        triangleCalculator = new TriangleCalculator();
    }

    @Test
    public void testCalculation() {
        Double triangle = triangleCalculator.calculateSquare(10, 5, 8);
        assertTrue(triangle > 0);
        //данный метод проверяет что результат полученный при вычислении больше 0
    }

    @Test
    public void testCalculateResult() {
        Double expected = 24.0;
        Double actual = triangleCalculator.calculateSquare(6.0, 8.0, 10.0);
        assertEquals(expected, actual);
    }

    @Test
    public void testInvalidInputZeroValueC() {
        assertThrows(InputMismatchException.class, () -> {
            triangleCalculator.calculateSquare(5, 55, 0);
        });
    } // данный тест проверяет возникновение ошибки при введении стороны равной 0.
    // данный треугольник не должен иметь площади и ожидается возникновение эксепшн

    @Test
    public void testNegativeInputValueA() {
        assertThrows(InputMismatchException.class, () -> {
            triangleCalculator.calculateSquare(-3, 5, 6);
        });
    } //данный тест проверяет возникновение ошибки при введении a < 0;

    @Test
    public void testNegativeInputValueB() {
        assertFalse(() -> {
            try {
                triangleCalculator.calculateSquare(5, -4, 5);
                return true;
            } catch (InputMismatchException e) {
                return false;
            }
        });
    } //данный тест проверяет возникновение ошибки при введении b < 0; также использовано assertFalse

    @Test
    public void testNegativeInputValueC() {
        assertThrows(InputMismatchException.class, () -> {
            triangleCalculator.calculateSquare(2, 5, -6);
        });
    } //данный тест проверяет возникновение ошибки при введении c < 0;

    @Test
    public void testStringInput() {
        Double triangle = triangleCalculator.calculateSquare("5", "10", "8");
        assertTrue(triangle > 0);
    } //тест проверяет возможность считывания чисел для формулы при введении строкового значения

    @Test
    public void testDoubleInput() {
        Double triangle = triangleCalculator.calculateSquare(2.22, 5.569, 4.0);
        assertTrue(triangle > 0);
    } //тест проверяет возможность введения чисел с плавающей точкой

    @Test
    public void testInvalidInputEmptyStrings() {
        assertThrows(NumberFormatException.class, () -> {
            triangleCalculator.calculateSquare(" ", " ", " ");
        });
    } // тест проверяет возможность введения пробелов вместо чисел

}


