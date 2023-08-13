package helpers;

import org.apache.commons.lang3.StringUtils;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Common {

    public static String uniqueValue = generateRandom();

    public static String getUniqueValue(String value) {
        if (value.contains("pre-setup")) {
            return value.replace("pre-setup ", "");
        } else {
            return value + uniqueValue;
        }
    }

    public static String getUniqueEmail(String email) {
        String[] parsedEmail = email.split("@");
        return getUniqueValue(parsedEmail[0]) + "@" + parsedEmail[1];
    }

    public static String generateRandom() {
        return "-" + getCurrentTimeStampString();
    }

    private static String getCurrentTimeStampString() {
        Date date = new Date();

        SimpleDateFormat sd = new SimpleDateFormat("MMddmmSS");
        TimeZone timeZone = TimeZone.getDefault();
        Calendar cal = Calendar.getInstance(new SimpleTimeZone(timeZone.getOffset(date.getTime()), "GMT"));
        sd.setCalendar(cal);

        return sd.format(date);
    }

    public static String getUniqueResult(String source) {
        String result = source;
        Pattern p = Pattern.compile("'(.*?)'");
        Matcher m = p.matcher(source);
        while (m.find()) {
            result = result.replace(m.group(), getUniqueValue(m.group().replaceAll("\'", "")));
        }
        return result;
    }

    public static String getConfigValue(String key) {
        ResourceBundle config = ResourceBundle.getBundle("config");
        return config.getString(key);
    }

    public static String getAppUiUrl() {
        return System.getProperty("app_ui_url");
    }

    public static void setUniqueValue(String value) {
        uniqueValue = value;
    }

    public static String getUniqueNumber(String value) {
        if (!value.equalsIgnoreCase("") && !value.equalsIgnoreCase("No answer")) {
            value = value + uniqueValue.substring(1);
        }
        return value;
    }

    public static void setUniqueValue() {
        uniqueValue = generateRandom();
    }

    public static String firstLetterToUpperCase(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    public static String upperCamelCase(String text) {
        String[] words = text.split(" ");
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            word = word.isEmpty() ? word : Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();
            if (i == words.length - 1)
                builder.append(word);
            else builder.append(word + " ");
        }
        return builder.toString();
    }
}
