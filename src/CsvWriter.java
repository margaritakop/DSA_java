import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class CsvWriter {
    public static void write(ArrayList<String> results) {

        try (PrintWriter writer = new PrintWriter(new File("results.csv"))) {

            StringBuilder sb = new StringBuilder();
            sb.append("N");
            sb.append(',');
            sb.append("Linear (ns)");
            sb.append(',');
            sb.append("Binary (ns)");
            sb.append('\n');

            int x = 1;
            for (String number: results){
                sb.append(number);
                if(x % 3 == 0){
                    sb.append('\n');
                }else{
                sb.append(",");
                }
            x = x+1;
            }

            writer.write(sb.toString());

            System.out.println("CSV done! See results.csv file");

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}