package app_lottery_toys;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileClear {
    static String filename = "prize_toys.txt" ;
    public static void fileClear() throws FileNotFoundException {
        PrintWriter writer = new PrintWriter(filename);
        writer.print("");
        writer.close();
    }

}
