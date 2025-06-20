package tasks;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimeTellerTest {
    TimeTeller timeTeller;
    @BeforeEach
    public void setup() {
        timeTeller = new TimeTeller();
    }

    @Test
    public void TimeTellerCanTellTheCorrectTime() {
        assertEquals("The Time is twelve O'clock", timeTeller.tellTheTime("12:00"));
        assertEquals("The Time is one O'clock", timeTeller.tellTheTime("1:00"));
        assertEquals("The Time is one O'clock", timeTeller.tellTheTime("01:00"));


    }
    @Test
    public void TimeTellerCanTellTheTimeMeridiem(){
        assertEquals("wrong time format", timeTeller.tellTheTime("13:00"));
        assertEquals("wrong time format", timeTeller.tellTheTime("6:100"));

    };

}
