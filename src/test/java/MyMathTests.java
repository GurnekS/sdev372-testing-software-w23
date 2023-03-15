import org.example.src.math.MyMath;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MyMathTests
{
    @Test
    public void testsExceptions()
    {
        MyMath calculator = new MyMath();
        assertThrows(ArithmeticException.class, () -> calculator.divide(219, 0));

    }

    @Test
    public void divideTests()
    {
        MyMath calculator = new MyMath();
        assertDoesNotThrow(() -> calculator.divide(219, 21));

    }
}
