package java17;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;

public class Java17 {
    public static void main(String[] args) {

//       testBlank();
//       testLines();
       testRepeat();
    }

    static void testBlank(){

        // Your code here!

        System.out.println(" ".isBlank()); //true

        String s = "Anupam";
        System.out.println(s.isBlank()); //false
        String s1 = "";
        System.out.println(s1.isBlank()); //true


    }

    /**
     * This method returns a stream of strings, which is a collection of all substrings split by lines.
     * strip(), stripLeading(), stripTrailing() strip() -
     * Removes the white space from both, beginning and the end of string.
     */
    static void testLines(){
        String str = "JD\nJD\nJD";
        String str2 = "JD\nJD\n123444\n rrr \n ayush";
        System.out.println(str2);

        System.out.println(str2.lines().filter(e -> e.contains("ayush")).collect(Collectors.toList()));
    }

    /**
     * The repeat method simply repeats the string that many numbers of times as mentioned in the method
     * in the form of an int.
     */
    static void testRepeat(){
        String result ="Ayush kumar".repeat(2);
        System.out.printf(result);
    }

    /**
     * Epsilon: A No-Op Garbage Collector
     * ike the JVM GC which is responsible for allocating memory and releasing it, Epsilon only allocates memory. It allocates memory for the following things:
     *
     * Performance testing.
     * Memory pressure testing.
     * VM interface testing.
     * Extremely short lived jobs.
     * Last-drop latency improvements.
     * Last-drop throughput improvements.
     */

    /**
     * : Remove the Java EE and CORBA Modules
     */

    /**
     *  328: Flight Recorder
     *   HTTP Client
     *   Http CLient API. The new API supports both HTTP/1.1 and HTTP/2.
     *   It is designed to improve the overall performance of sending requests by a client and receiving responses from the server.
     *   It also natively supports WebSockets
     */

    static void readWrite() throws IOException {
        Path path = Files.writeString(Files.createTempFile("test", ".txt"), "This was posted on JD");
        System.out.println(path);
        String s = Files.readString(path);
        System.out.println(s); //This was posted on JD
    }

    static void testIntern(){
        String str1 = new String("Scaler by InterviewBit").intern();  //Line1
        String str2 = new String("Scaler by InterviewBit").intern(); //Line2
        System.out.println(str1 == str2); //prints true
    }
}
