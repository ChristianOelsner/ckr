
package com.oelsner.csv;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;

public class CsvWriter {

    private static final String CSV_FILE_PATH_DEST = "./ckr.csv";

    public static void writeCsvFile() throws IOException {
//        Ckr ckr = new Ckr();
        Random random = new Random();
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(CSV_FILE_PATH_DEST));
             CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT
                     .withHeader("CkrNumber", "CkrRun"))
        ) {
            for (int i = 0; i < 200; i++) {
                csvPrinter.printRecord(random.nextInt(999999) + 1, random.nextInt(99999) + 1);
            }

            csvPrinter.flush();
        }
    }
}
