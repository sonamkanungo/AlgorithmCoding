package scan;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;


/**
 * Created by kanunso on 3/28/17.
 */
public class ReadFromCLI {

    public static void main(String[] args) {

        // The name of the file to open
        String fileName = "/Users/kanunso/operate.txt";

        // This will reference one line at a time
        String line = null;

        try {
            // FileReader reads text files.
            FileReader fileReader =
                    new FileReader(fileName);

            // FileReader in BufferedReader.
            BufferedReader bufferedReader =
                    new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        }
        catch(IOException ex) {
            System.out.println(
                    "Error reading file '"
                            + fileName + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        }

    }

}
