package co.com.uco.managewood.crosscutting.helper;

import java.util.Objects;

import static co.com.uco.managewood.crosscutting.helper.ObjectHelper.getDefaultIfNull;

public class StringHelper {

    private StringHelper(){
        super();
    }

    public static final String EMPTY = " ";

    public static final String getDefaultString (String value, String defaultValue){
        return getDefaultIfNull(value, defaultValue);
    }

    public static final String getDefaultString(String value){
        return getDefaultIfNull(value, EMPTY);
    }

    public static final String applyTrim(String value){
        return getDefaultString(value).trim();
    }

    public static final boolean isEmpty(String value){
        return Objects.equals(value, EMPTY);
    }

    public static final boolean isOnlyWordsAndSpace(String value) {
        return value.matches("[a-zA-Z ]+");
    }
    public static final boolean isOnlyNumbers(String value) {
        return value.matches("[0-9]");
    }
    public static final boolean isOnlyWordsAndSpaceAndNumbers(String value) {
        return value.matches("[a-zA-Z ]+[0-9]");
    }
}
