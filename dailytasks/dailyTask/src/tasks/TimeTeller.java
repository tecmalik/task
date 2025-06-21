package tasks;

public class TimeTeller {
    static String errorMessage = "wrong time format";
    static String Prefix = "The Time is ";
    static String Postfix = " O'clock";
    static String abbreviation = "";

    public static String tellTheTime(String time) {

        String spacelessTime = time.replaceAll("\\s","");
        String[] digits = spacelessTime.split(":");
        NumberReader numberReader = new NumberReader();
        long hour =  Long.parseLong(digits[0]);
        long minute = checkForAbbreviation(digits);


        if (isNotValidFormat(hour, digits))return errorMessage;
        if( minute == 0L) return Prefix.concat(numberReader.readNumber(hour).concat(Postfix)).concat(abbreviation) ;
    return "";
    }

    private static boolean isNotValidFormat(long hour, String[] digits) {
        return hour < 1 || hour > 12 && !digits[1].matches("^(?:(?:[0-5]?\\d|60)(?i)(am|pm)|(?:[0-5]?\\d|60))$");
    }

    private static long checkForAbbreviation(String[] digits) {

        if (digits[1].matches("(?i).*(am|pm).*")){
            identifyAbbreviation(digits[1]);
            return Long.parseLong(removeAbbreviation(digits[1]));

        }
        return  Long.parseLong(digits[1]);
    }

    private static String removeAbbreviation(String albaNumeric) {
        return albaNumeric.replaceAll("[a-zA-z]", "");
    }

    private static void identifyAbbreviation(String Alphanumeric) {
        if (Alphanumeric.matches("(?i).*am.*")) abbreviation = " Am";
        if (Alphanumeric.matches("(?i).*pm.*")) abbreviation = " Pm";
    }
}
