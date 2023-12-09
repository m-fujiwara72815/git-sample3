package java3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

public class TextReader {
    private String path;

    private static Logger logger = Logger.getLogger(TextReader.class.getName());

    private enum Mark { START, END };

    private TextReader(String path) {
        this.path = path;
    }

    private void execute() {
        List<Integer> valueList = new ObjectList<Integer>();

        try (FileReader fr = new FileReader(path);
             BufferedReader br = new BufferedReader(fr)) {

        	String line = null;
     
            while ((line = br.readLine()) != null) {
                valueList.add(Integer.parseInt(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }

        for (int e : valueList) {
        	System.out.println(e);
        }
    }

    public static void main(String... args) {
        logger.info(Mark.START.name());
        new TextReader(args[0]).execute();
        logger.info(Mark.END.name());
    }

}
