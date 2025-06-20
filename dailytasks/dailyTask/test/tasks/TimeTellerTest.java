package tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimeTellerTest {
    @Test
    public void TimeTellerCanTellTheCorrectTime() {
        TimeTeller timeTeller = new TimeTeller();
        assertEquals("The Time is twelve O'clock", TimeTeller.tellTheTime("12:00"));
        assertEquals("The Time is one O'clock", TimeTeller.tellTheTime("1:00"));
        assertEquals("The Time is one O'clock", TimeTeller.tellTheTime("01:00"));

    }

}
