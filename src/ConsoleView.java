import java.util.Scanner;

public class ConsoleView {
    private String txtEnter;
    private Scanner scanner = new Scanner(System.in);

    public void requestingText() {
        printRequest();
        txtEnter = scanner.nextLine();
        scanner.close();
    }

    public String getTxtEnter() {
        return txtEnter;
    }

    private void printRequest() {
        System.out.println("***********************************************************");
        System.out.println("""
                Введите данные, разделенные пробелом:
                Фамилия Имя Отчество дата_рождения номер_телефона пол
                Форматы данных:
                фамилия, имя, отчество - строки
                дата_рождения - строка формата dd.mm.yyyy
                номер_телефона - целое беззнаковое число без форматирования
                пол - символ латиницей f или m.""");
        System.out.println("***********************************************************");
        System.out.print("->");
    }
}
