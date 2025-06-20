package tasks;

import java.util.HashMap;
import java.util.Map;


public class NumberReader {

    public String readNumber(Long number) {
       if (countDigit(number) == 1L)return readDigit(number);
       if(countDigit(number) == 2L){
           if(checkDigitAt(1, number) == 0L) return readTenth(number);
           if(checkDigitAt(1, number) != 0L && checkDigitAt(0,number) == 1) return readTeen(number) ;
           if(checkDigitAt(1,number) != 0L && checkDigitAt(0,number) != 1) return readTenth(checkDigitAt(0,number)*10).
                   concat("-" + readDigit(checkDigitAt(1, number)));
       }
        if(countDigit(number) == 3L && number == 100L) return readHundred();
//           if(countDigit(number) == 3L && number != 100L) return
//           ToBeContinued ....
       return "";
    }

    private String readHundred() {
        return "hundred";
    }

    private String readTeen(long number) {
        HashMap<Long, String> doubleDigits = new HashMap<>();
        doubleDigits.put(11L, "eleven");
        doubleDigits.put(12L, "twelve");
        doubleDigits.put(13L, "thirteen");
        doubleDigits.put(14L, "fourteen");
        doubleDigits.put(15L, "fifteen");
        doubleDigits.put(16L, "sixteen");
        doubleDigits.put(17L, "seventeen");
        doubleDigits.put(18L, "eighteen");
        doubleDigits.put(19L, "nineteen");

        return doubleDigits.get(number);
    }

    private String readTenth(Long number) {
        HashMap<Long, String> doubleDigits = new HashMap<>();
        doubleDigits.put(10L, "ten");
        doubleDigits.put(20L, "twenty");
        doubleDigits.put(30L, "thirty");
        doubleDigits.put(40L, "forty");
        doubleDigits.put(50L, "fifty");
        doubleDigits.put(60L, "sixty");
        doubleDigits.put(70L, "seventy");
        doubleDigits.put(80L, "eighty");
        doubleDigits.put(90L, "ninety");
        return doubleDigits.get(number);
    }

    private Long checkDigitAt(int index ,Long number) {
        char[] charDigit = String.valueOf(number).toCharArray() ;
        return (long) charDigit[index]-'0';
    }


    private long countDigit(Long number) {
        return String.valueOf(number).length();
    }

    public String readDigit(Long digit) {

        Map<Long,String> singleDigits = Map.of(
                0L,"zero",
                1L , "one",
                2L , "two",
                3L , "three",
                4L , "four",
                5L , "five",
                6L , "six",
                7L , "seven",
                8L , "eight",
                9L , "nine");
        return singleDigits.get(digit);
    }




}
