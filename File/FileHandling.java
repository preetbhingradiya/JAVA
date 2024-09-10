import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class FileHandling {
    public static void main(String[] args) {

        // READ BYTE DATA AS NORMAL DATA

        // InputStreamReader ip = new InputStreamReader(System.in);

        // try {
        // int letter = ip.read();
        // while (ip.ready()) { // Read bytes until end of stream
        // System.out.print((char) letter); // Print the character
        // letter = ip.read(); // Read next byte
        // }
        // ip.close();
        // } catch (IOException e) {
        // e.printStackTrace();
        // }

        // READ BYTE FILE AS DATA

        // try {
        // FileReader fd = new FileReader("file.txt");
        // try {
        // int letter;
        // while ((letter = fd.read()) != -1) { // Read bytes until end of stream
        // System.out.print((char) letter); // Print the character
        // }
        // System.err.println();
        // } catch (IOException e) {
        // System.out.println(e.getMessage());
        // }
        // } catch (FileNotFoundException e) {
        // e.printStackTrace();
        // }

        // byte data to char data and after reding char stream
        // BufferedReader fb = new BufferedReader(new InputStreamReader(System.in));
        // try {
        //     System.out.println("You are type : " + fb.readLine());
        // } catch (Exception e) {
        //     System.out.println(e.getMessage());
        // }



        // try {
        //     BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        //     try {
        //         while (br.ready()) { // Read lines until end of file
        //             System.out.println(br.readLine()); // Print each line
        //         }
        //     } catch (IOException e) {
        //         System.out.println(e.getMessage());
        //     }
        // } catch (FileNotFoundException e) {
        //     e.printStackTrace();
        // }



        //Write
        
        try {
            OutputStreamWriter osw = new OutputStreamWriter(System.out);
            osw.write("hello world"); 
            osw.write(97); // 97 -> a
            osw.write(10); // 10 -> new line
            osw.write('A'); // A
            osw.write('\n'); // new line
            char[] ch = "abcde".toCharArray(); // new char[]
            osw.write(ch);
            osw.flush();
        } catch (IOException e) {
           System.out.println(e.getMessage());
        }

        // create a new file
        try {
            File file = new File("file-new.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());

        }

        //append the data in this file
        try {
            FileWriter fw = new FileWriter("file-new.txt", true); // true -> append mode the new content are append in previous file
            fw.write("This is appended text");
            fw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
