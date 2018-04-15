import com.oelsner.csv.CsvReader;
import com.oelsner.csv.CsvWriter;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.util.List;

public class Go {

    public static void main(String[] args) throws IOException {

        /*
        Just to get things out of the static main method.
         */
        Go go = new Go();
        go.run();

    }

    private void run() throws IOException {
        CsvWriter.writeCsvFile();
        CsvReader.read();

        final List<CSVRecord> ckrList = CsvReader.getCkrList();

        for (CSVRecord c: ckrList) {
            System.out.println(c);
        }
    }
}
