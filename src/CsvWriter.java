import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CsvWriter {
    public static void write(long[] times) {

        String number = Long.toString(times[0]);

        System.out.println("calling CSV writer with" + number);

        try (PrintWriter writer = new PrintWriter(new File("results.csv"))) {

            StringBuilder sb = new StringBuilder();
            sb.append("id,");
            sb.append(',');
            sb.append("Name");
            sb.append('\n');

            sb.append("1");
            sb.append(',');
            sb.append("Prashant Ghimire");
            sb.append('\n');

            writer.write(sb.toString());

            System.out.println("CSV done! See results.csv file");

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}