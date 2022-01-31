import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParcelLockerValidation {

    private static Pattern addressPattern = Pattern.compile("([a-zA-Z0-9]+),([a-zA-Z]+),(([0-9]{2})-([0-9]{3}))");

    //sprawdzi czy id jest równe wartości od 0-200
    //nazwa zawiera min=2, max-10 znaków
    //address na format: "ulica,miasto,kod pocztowy", np. "Wiśniowa,Szczecin,70-000"
    //capacity: wartość od 0 do 100

    public static boolean validate(int id, String name, String address, int capacity) {
        boolean isValid = true;
        if (id < 0 || id > 200) {
            isValid = false;
        }

        if (name == null || name.trim().length() < 2 || name.trim().length() > 10) {
            isValid = false;
        }

        if (address == null || !addressPattern.matcher(address.trim()).matches()) {
            isValid = false;
        }

        if (capacity < 0 || capacity > 100) {
            isValid = false;
        }
        return isValid;

    }

}
