import java.io.IOException;
import java.time.format.DateTimeParseException;

public class Service {

    public void start(){
        ConsoleView consoleView = new ConsoleView();
        consoleView.requestingText();
        Parser parser = new Parser(consoleView.getTxtEnter());
        try {
            if (parser.checkSize()) {
                Note note = new Note(parser.parsingSurname(), parser.parsingName(), parser.parsingPatronymic(),
                        parser.parsingbirthDate(), parser.parsingPhone(), parser.parsingGender());
                Writer writer = new Writer(note);
                writer.saveInFile();
            }
        } catch (AmountDataRuntimeException e) {
            System.err.println("Неверное количество данных");
        } catch (DateTimeParseException e) {
            System.err.println("Неверный формат даты!");
        } catch (NumberFormatException e) {
            System.err.println("Неверный формат телефона");
        } catch (GenderRuntimeException e) {
            System.err.println("Неверный формат пола!");
        } catch (IOException e) {
            System.err.println("Ошибка записи в файл");
        } catch (Exception e) {
            System.err.println("Что-то пошло не так!");
        }
    }
}
