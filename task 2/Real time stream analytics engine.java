import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Reading> readings = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String sensorId = sc.next();
            double temperature = sc.nextDouble();

            readings.add(new Reading(sensorId, temperature));
        }

        readings.stream()
                // 1. Filter temperatures greater than 50
                .filter(r -> r.temperature > 50)

                // 2 & 3. Group by Sensor ID and calculate average
                .collect(Collectors.groupingBy(
                        r -> r.sensorId,
                        Collectors.averagingDouble(r -> r.temperature)
                ))

                // 4. Sort by average temperature descending
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed())

                // Display result
                .forEach(entry ->
                        System.out.println(entry.getKey() + " " + entry.getValue())
                );
    }

    static class Reading {
        String sensorId;
        double temperature;

        Reading(String sensorId, double temperature) {
            this.sensorId = sensorId;
            this.temperature = temperature;
        }
    }
}

Sample Input
6
S1 60
S2 40
S1 80
S3 70
S2 90
S3 30
Output
S2 90.0
S1 70.0
S3 70.0
