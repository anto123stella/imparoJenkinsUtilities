import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;


def txtFile (String testo) {

    def filePath = "C:/Work File/bro.txt"

    try {
        
        def file = new File(filePath)

        
        def content = testo

        
        file.write(content)

        echo("File creato e scritto correttamente.")
    } catch (FileWritingException e) {
        echo("Errore durante la scrittura del file: ${e.message}")
    } catch (Exception e) {
        echo("Errore generico: ${e.message}")
    }
}
