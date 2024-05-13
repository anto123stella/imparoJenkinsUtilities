import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

class Utily {

    Utily(){}  
    def response = ""

    def txtFile (String testo) {

        def filePath = "C:/Work File/bro.txt"

        try {
            
            def file = new File(filePath)
            file.write(testo)

            response = "File creato e scritto correttamente."
        } catch (Exception e) {
            response = "Errore durante la scrittura del file: ${e.message}"
        } catch (Exception e) {
            response = "Errore generico: ${e.message}"
        }

        return response
    }


}

