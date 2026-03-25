// Write a Java program to perform a copy of a text file. The program should read the contents
// of a source file, convert all the text to Uppercase, and write the result into a new destination
// file. Use BufferedInputStream & BufferedOutputStream.

import java.io.*;

public class Pg25_FileCopyUppercase {
    public static void main(String[] args) throws Exception {

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("input.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("output.txt"));

        int ch;

        while ((ch = bis.read()) != -1) {
            bos.write(Character.toUpperCase((char) ch));
        }

        bis.close();
        bos.close();

        System.out.println("File copied and converted to uppercase.");
    }
}


/*
Sample Output:

File copied and converted to uppercase.

(input.txt → hello world
 output.txt → HELLO WORLD)
*/