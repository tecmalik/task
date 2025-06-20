package tasks;

public class TimeTeller {

    static String Prefix = "The Time is ";
    static String Postfix = " O'clock";
    public static String tellTheTime(String time) {
       String spacelessTime = time.replaceAll("\\s","");
       String[] digits = spacelessTime.split(":");
       NumberReader numberReader = new NumberReader();
       long hour =  Long.parseLong(digits[0]);
       long minute =  Long.parseLong(digits[1]);
    if( minute == 0L) return Prefix.concat(numberReader.readNumber(hour).concat(Postfix)) ;
    return "";
    }
}
