import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;

public class Parser {
    List<String> txtEnterArray;
    private final int QUANTITY = 6;

    public Parser(String txtEnter) {
        this.txtEnterArray = new ArrayList<>(List.of(txtEnter.split(" ")));
    }

    public boolean checkSize() throws RuntimeException{
        if (QUANTITY != txtEnterArray.size()) {
            throw new AmountDataRuntimeException();
        }
        return true;
    }

    public String parsingSurname() {
        return txtEnterArray.get(0);
    }

    public String parsingName() {
        return txtEnterArray.get(1);
    }

    public String parsingPatronymic() {
        return txtEnterArray.get(2);
    }

    public LocalDate parsingbirthDate() throws DateTimeParseException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate birthDate = null;
        birthDate = LocalDate.parse(txtEnterArray.get(3), formatter);
        return birthDate;
    }

    public long parsingPhone() throws NumberFormatException {
        long phone = -1;
        phone = Long.parseLong(txtEnterArray.get(4));
        return phone;
    }

    public String parsingGender() throws GenderRuntimeException {
        if (!txtEnterArray.get(5).equals("m") && !txtEnterArray.get(5).equals("f")) {
            throw new GenderRuntimeException();
            }
        return txtEnterArray.get(5);
    }
}
