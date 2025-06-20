package tasks;

public class TimeTeller {
    static String errorMessage = "wrong time format";
    static String Prefix = "The Time is ";
    static String Postfix = " O'clock";
    public static String tellTheTime(String time) {
        String spacelessTime = time.replaceAll("\\s","");
        String[] digits = spacelessTime.split(":");
        NumberReader numberReader = new NumberReader();
        long hour =  Long.parseLong(digits[0]);
        long minute =  Long.parseLong(digits[1]);
        if (hour>12 || String.valueOf(hour).length() > 2)return errorMessage;
        if (minute>59 || String.valueOf(minute).length() > 2)return errorMessage;
        if( minute == 0L) return Prefix.concat(numberReader.readNumber(hour).concat(Postfix)) ;
    return "";
    }
}
