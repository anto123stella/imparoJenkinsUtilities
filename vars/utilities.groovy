import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;


def file(String fileName) {
    def newFile = new File("C:/Users/antonio.agostino/OneDrive - Accenture/Documents/test/${fileName}.txt")
    newFile.createNewFile()  
}

def writeFile(String fileName, String toWrite) {
    def file = new File("C:/Users/antonio.agostino/OneDrive - Accenture/Documents/test/${fileName}.txt")
    file.append(toWrite)
}
