package tasks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberReaderTest {

    NumberReader numberReader;
    @BeforeEach
    public void setup() {
        numberReader = new NumberReader();
    }

    @Test
    public void NumberReaderCanReadADigitTest(){
        assertEquals("one", numberReader.readNumber(1L ));
        assertEquals("two", numberReader.readNumber(2L));
        assertEquals("nine", numberReader.readNumber(9L));
    }
    @Test
    public void NumberReaderCanReadTeensNumberTest(){
        assertEquals("twelve", numberReader.readNumber(12L));
    }
     @Test
    public void NumberReaderCanReadTwoDigitTenthNumberTest(){
        assertEquals("twenty", numberReader.readNumber(20L));
    }
     @Test
    public void NumberReaderCanReadTwoDigitsNumbersTest(){
        assertEquals("twelve", numberReader.readNumber(12L));
        assertEquals("twenty", numberReader.readNumber(20L));
        assertEquals("twenty-eight", numberReader.readNumber(28L));
    }
    @Test
    public void NumberReaderCanReadThreeDigitNumberTest(){
        assertEquals("hundred", numberReader.readNumber(100L));
//        assertEquals("twenty", numberReader.readNumber(900L));
    }

}
