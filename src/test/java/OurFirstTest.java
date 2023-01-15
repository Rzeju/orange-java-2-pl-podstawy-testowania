import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OurFirstTest {

    @Test
    void shouldMultiplyTwoNumbers() {

        //given
        final double firstNumber = 2;
        final double secondNumber = 3;

        //when
        final double result = firstNumber * secondNumber;

        //then
        assertEquals(6, result);
    }
}
