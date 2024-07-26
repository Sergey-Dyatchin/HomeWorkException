import java.time.LocalDate;

public class Note {

    private String surname, name, patronymic;
    private LocalDate birthDate;
    private long phone;
    private String gender;

    public Note(String surname, String name, String patronymic, LocalDate birthDate, long phone, String gender) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.birthDate = birthDate;
        this.phone = phone;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return surname + " " + name + " " + patronymic + " " + birthDate + " " + phone + " " + gender;
    }

    public String getSurname() {
        return surname;
    }
}
