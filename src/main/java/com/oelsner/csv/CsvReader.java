package com.oelsner.csv;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class CsvReader {
    private static final String CKR_FILE = "./ckr.csv";

    public static void read() throws IOException {

        try (Reader reader = Files.newBufferedReader(Paths.get(CKR_FILE));
             CSVParser parser = new CSVParser(reader, CSVFormat.DEFAULT
                     .withHeader("CkrNumber", "CkrRun")
                     .withIgnoreHeaderCase()
                     .withTrim())
        ) {
            for (CSVRecord record : parser) {
                String ckrNumber = record.get("CkrNumber");
                String ckrRun = record.get("CkrRun");
                System.out.println("Record Number: " + record.getRecordNumber());
                System.out.println("-----------------------");
                System.out.println("CkrNumber: " + ckrNumber);
                System.out.println("CkrRun: " + ckrRun);
                System.out.println("-----------------------\n\n");
            }
        }
    }

    public static List<CSVRecord> getCkrList() {
        Reader reader = null;
        try {
            reader = Files.newBufferedReader(Paths.get(CKR_FILE));
        } catch (IOException e) {
            e.printStackTrace();
        }
        CSVParser parser;
        List<CSVRecord> csvRecords = null;
        try {
            parser = new CSVParser(reader, CSVFormat.DEFAULT);
            csvRecords = parser.getRecords();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return csvRecords;
    }
}
