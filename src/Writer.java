import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Writer {
    Note note;
    String fileName;

    public Writer(Note note) {
        this.note = note;
        this.fileName = note.getSurname();
    }

    public void saveInFile() throws IOException{
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write(note.toString() + "\n");
        }
    }
}
