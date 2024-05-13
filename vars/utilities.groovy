import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;


def file(String testo) {
    def newFile = new File("C:/Work File/bro.txt")
    newFile.createNewFile()
    newFile.append(testo) 
    echo('file scaricato') 
}
