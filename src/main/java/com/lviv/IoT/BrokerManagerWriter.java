package com.lviv.IoT;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class BrokerManagerWriter {

    // Writing function
    public final void writeToCSV(List<BrokerManager> brokerManagers) {

        // Reminder
        System.out.println("Check out our BrokerManagers.csv");

        try {

            // Writer object
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("BrokerManagers.csv"),
                    StandardCharsets.UTF_8));

            // Writing objects to our csv table
            for (BrokerManager brokerManager : brokerManagers) {

                // Headers
                String oneLine = brokerManager.getHeaders();

                // Values
                String otherLine = brokerManager.toCSV();

                bw.write(oneLine);
                bw.newLine(); // Dividing output table
                bw.write(otherLine);
                bw.newLine();
            }

            bw.close(); // Do not forget to close the stream!
        }

        // Catching all the exceptions
        catch (IOException e) {

            // Now we can see the error in the terminal
            e.printStackTrace();
        }
    }

}