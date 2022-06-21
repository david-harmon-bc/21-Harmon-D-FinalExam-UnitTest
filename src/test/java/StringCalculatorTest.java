import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.AfterEach;

import static org.junit.jupiter.api.Assertions.*;


public class StringCalculatorTest {

    @Test
    public void illegalArgumentTest(){
        StringCalculator calc = new StringCalculator();
        boolean IllegalArgument = false;
        try {
            int test = calc.add("-1,5");
            assertEquals(test, "Won't reach here");
        }catch(IllegalArgumentException e){
            IllegalArgument = true;
            assertTrue(IllegalArgument);
        }
    }

    @Test
    public void ignoreNumsOver1000(){
        StringCalculator calc = new StringCalculator();
        int test = calc.add("1,1000");
        assertEquals(test, 1);
    }

}