package com.lviv.IoT;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;

// Class for writing objects to CSV
public class BrokerManagerWriter {

    // Creating some lists for adding objects to CSV file
    private final List<BrokerManager> brokerManagersListForJamesGrey = new ArrayList<>();

    public final List<BrokerManager> getBrokerManagersListForJamesGrey() {

        return this.brokerManagersListForJamesGrey;
    }

    private final List<BrokerManager> brokerManagersListForAdamSmith = new ArrayList<>();

    public final List<BrokerManager> getBrokerManagersListForAdamSmith() {

        return this.brokerManagersListForAdamSmith;
    }

    private final List<BrokerManager> brokerManagersListForKateBush = new ArrayList<>();

    public final List<BrokerManager> getBrokerManagersListForKateBush() {

        return this.brokerManagersListForKateBush;
    }

    // Putting JamesGrey object to CSV table
    public final void writeToFileJamesGrey(final List<BrokerManager> brokerManagersListForJamesGrey) {

        // Name of our new CSV file
        final String locationOfCSV = "BrokerManagerJamesGrey.csv";

        try {

            FileWriter writer = new FileWriter(locationOfCSV);

            brokerManagersListForJamesGrey.add(new JamesGrey());

            StatefulBeanToCsvBuilder<BrokerManager> builder = new StatefulBeanToCsvBuilder<>(writer);
            StatefulBeanToCsv<BrokerManager> beanWriter = builder.build();

            beanWriter.write(brokerManagersListForJamesGrey);
            writer.close();
        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    public final void writeToFileAdamSmith(final List<BrokerManager> brokerManagersListForAdamSmith) {

        final String locationOfCSV = "BrokerManagerAdamSmith.csv";

        try {

            FileWriter writer = new FileWriter(locationOfCSV);

            brokerManagersListForAdamSmith.add(new AdamSmith());

            StatefulBeanToCsvBuilder<BrokerManager> builder = new StatefulBeanToCsvBuilder<>(writer);
            StatefulBeanToCsv<BrokerManager> beanWriter = builder.build();

            beanWriter.write(brokerManagersListForAdamSmith);
            writer.close();
        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    public final void writeToFileKateBush(final List<BrokerManager> brokerManagersListForKateBush) {

        final String locationOfCSV = "BrokerManagerKateBush.csv";

        try {

            FileWriter writer = new FileWriter(locationOfCSV);

            brokerManagersListForKateBush.add(new KateBush());

            StatefulBeanToCsvBuilder<BrokerManager> builder = new StatefulBeanToCsvBuilder<>(writer);
            StatefulBeanToCsv<BrokerManager> beanWriter = builder.build();

            beanWriter.write(brokerManagersListForKateBush);
            writer.close();
        } catch (Exception e) {

            e.printStackTrace();
        }
    }

}
