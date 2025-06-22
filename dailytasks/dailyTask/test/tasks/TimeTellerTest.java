package tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimeTellerTest {

    @Test
    public void TimeTellerCanTellTheCorrectTime() {
        assertEquals("The Time is twelve O'clock", TimeTeller.tellTheTime("12:00"));
        assertEquals("The Time is four O'clock", TimeTeller.tellTheTime("04:00"));
        assertEquals("The Time is one O'clock", TimeTeller.tellTheTime("01:00"));


    }
    @Test
    public void TimeTellerDoesNotAcceptInvalidTimeFormat(){
        assertEquals("wrong time format", TimeTeller.tellTheTime("13:00"));
        assertEquals("wrong time format", TimeTeller.tellTheTime("24:00"));
        assertEquals("wrong time format", TimeTeller.tellTheTime("001:00"));
        assertEquals("wrong time format", TimeTeller.tellTheTime("6:100"));

    };
    @Test
    public void TimeTellerCanBeToldWithAnteMeridiem(){
        assertEquals("The Time is twelve O'clock Am",TimeTeller.tellTheTime("12:00 AM"));
        assertEquals("The Time is twelve O'clock Am",TimeTeller.tellTheTime("12:00 Am"));
        assertEquals("The Time is twelve O'clock Am",TimeTeller.tellTheTime("12:00Am"));

    }

}
