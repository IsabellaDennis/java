// Write a Java program to perform a "Search and Replace" operation on a text file.
// The program should read lines from the file, find the word to search and replace with the new word
// and write to a second file. Give number of replacements made.

import java.io.*;

public class Pg26_SearchReplace {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));

        String line;
        int count = 0;

        String search = "hello";
        String replace = "hi";

        while ((line = br.readLine()) != null) {
            if (line.contains(search)) {
                count++;
                line = line.replace(search, replace);
            }
            bw.write(line);
            bw.newLine();
        }

        br.close();
        bw.close();

        System.out.println("Replacements made: " + count);
    }
}

/*
Sample Output:

Replacements made: 2

(input.txt → hello world hello
 output.txt → hi world hi)
*/