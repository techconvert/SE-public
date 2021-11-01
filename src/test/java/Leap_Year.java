import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Leap_Year {

    @Test
    public void is_a_leap_year_divisible_by_four() {

            // fail("There's no code yet, designed to fail");

            assertEquals(true, LeapYear.isLeapYear(1112));
    }

    @Test
    public void is_a_leap_year_century_divisible_by_400() {


        assertEquals(true, LeapYear.isLeapYear(2000));
    }

    @Test
    public void is_not_a_leap_year_not_divisible_by_4() {

        assertEquals(false, LeapYear.isLeapYear(1111));
    }

    @Test
    public void is_not_leap_year_century_not_divisible_by_400() {

        assertEquals(false, LeapYear.isLeapYear(1900));
    }
}
