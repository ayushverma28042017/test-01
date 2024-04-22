package fileIO;

import java.io.*;
import java.util.stream.Collectors;

public class FileReadWrite {
    public static void main(String[] args) throws IOException {
        FileReadWrite fileReadWrite = new FileReadWrite();
        String fileNAme = "Ayush.txt";
        fileReadWrite.writeFile(fileNAme);


        // read
         fileReadWrite.readFile(fileNAme);
    }

    void writeFile(String fileName) throws IOException {
        BufferedWriter bufferedWriter
                 = new BufferedWriter(new FileWriter(fileName));

        bufferedWriter.write("I am Ayush");
        bufferedWriter.write("I am Sunday");
        bufferedWriter.write("I am Monday");
        bufferedWriter.write("I am Tuesday");
        bufferedWriter.close();

    }

    void readFile(String fileName)throws IOException{
        BufferedReader bufferedReader =
                new BufferedReader( new FileReader(fileName));
        String data ="";

            data =bufferedReader.readLine();
        String line =  bufferedReader.lines().
                collect(Collectors.joining(System.lineSeparator()));
            System.out.println(data);
            System.out.println();
            System.out.println();
            System.out.println(line);




    }
}
