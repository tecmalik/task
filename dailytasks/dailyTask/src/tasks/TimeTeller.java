package tasks;

public class TimeTeller {
    static String errorMessage = "wrong time format";
    static String Prefix = "The Time is ";
    static String Postfix = " O'clock";
    static String abbreviation = "";

    public static String tellTheTime(String time) {
        abbreviation = "";
        if (time == null || time.trim().isEmpty()) {
            return errorMessage;
        }
        String spacelessTime = time.replaceAll("\\s","");
        String[] digits = spacelessTime.split(":");
        NumberReader numberReader = new NumberReader();
        long hour =  Long.parseLong(digits[0]);
        long minute = checkForAbbreviation(digits);

        if (isNotValidFormat(hour, digits))return errorMessage;
        if( minute == 0L) return Prefix.concat(numberReader.readNumber(hour).concat(Postfix)) ;
        if(minute > 0) return Prefix.concat(numberReader.readNumber(hour).concat(numberReader.readNumber(minute)).concat(Postfix)).concat(abbreviation) ;

        return "";

    }

    private static boolean isNotValidFormat(long hour, String[] digits) {
        return  !String.valueOf(hour).matches("0[0-9]|1[0-2]") || !digits[1].matches("^([0-5][0-9]|60)(?i)(am|pm)?$" );
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
        if (Alphanumeric.matches("^(\\d{2})(?i)am$")) abbreviation = " Am";
        if (Alphanumeric.matches("^(\\d{2})(?i)pm$")) abbreviation = " Pm";
    }
}
