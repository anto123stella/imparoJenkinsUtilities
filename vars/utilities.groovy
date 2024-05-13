import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;


def file(String fileName) {
    def newFile = new File("C:/Work File/${fileName}.txt")
    newFile.createNewFile()
    newFile.append("hello baby")  
}
