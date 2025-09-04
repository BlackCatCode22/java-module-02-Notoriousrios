//fileIOPRactice.java
// rVE 09/04/25

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class fileIOPractice {
    public static void main(String[] args) {

        System.out.println("\n Welcome to my File I/O practice! ");

        //create a Bufferedwriter object and use it.

        try {
            BufferedWriter  bufferedWriter = new BufferedWriter(new FileWriter("myOutputFile.txt"));
            bufferedWriter.write("\n line one");
            bufferedWriter.write("\n line two");
            bufferedWriter.write("\n line three");
            bufferedWriter.close();
            System.out.println("\n File named myOutPutFile.txt successfully created or modified!\n");
        } catch (IOException anything) {
            anything.printStackTrace();
        }
    }
}