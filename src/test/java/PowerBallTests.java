import org.example.src.random.PowerBall;
import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PowerBallTests
{
    @RepeatedTest(5)
    public void testRange()
    {
        PowerBall powerBall = new PowerBall();
        int[] numbers = powerBall.getNumbers();

        //verify that the first five are in the range [1,69]
        for (int i = 0; i < 5; i++)
        {
            testCheckRange(1,69, numbers[i]);
        }


        //verify the sixth number is in the range [1,26]
        testCheckRange(1, 26, numbers[5]);

    }

    private void testCheckRange(int low, int high, int value)
    {
        assertTrue(value >= low);
        assertTrue(value <= high) ;
    }

}
