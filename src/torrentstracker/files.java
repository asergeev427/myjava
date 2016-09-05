package torrentstracker;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class files {

    public static void addFile(String fileText) {
        File myFile = new File("file.txt");
        try {
            FileWriter writer = new FileWriter(myFile);
            writer.write(fileText);
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void openFile(String fileName) {
        try {

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Файл не найден");
        }
    }
}